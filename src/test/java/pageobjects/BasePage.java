package pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	WebDriver driver;
	Actions actions;

	public BasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
	}

	public void fillText(WebElement el, String text) {
		highlightElement(el, "yellow");
		sleep(200);
		el.clear();
		el.sendKeys(text);
	}

	public void click(WebElement el) {
		// highlight
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid blue;');", el);
//		highlightElement(el, "yellow" );
		sleep(200);
		el.click();
		sleep(1000); 
	}
 
	public String getText(WebElement el) {
		highlightElement(el, "orange");
		sleep(500);
		return el.getText();
	}
 
	// Overloading
	public void alertOK(String text) {
		driver.switchTo().alert().sendKeys(text);
		driver.switchTo().alert().accept();
	}

	public void alertOK() {
		driver.switchTo().alert().accept();
	}

	public String getAttribute(WebElement el, String key) {
		return el.getAttribute(key);
	}

	public void sleep(long mills) {
		try {
			Thread.sleep(mills);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	// Mouse Options
	void MoveTo(WebElement el) {
		actions.moveToElement(el).build().perform();
	}

	private void highlightElement(WebElement element, String color) {
		// keep the old style to change it back
		String originalStyle = element.getAttribute("style");
		String newStyle = "background-color: " + color + ";" + originalStyle;
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Change the style
		js.executeScript("var tmpArguments = arguments;setTimeout(function () {tmpArguments[0].setAttribute('style', '"
				+ newStyle + "');},0);", element);

		// Change the style back after few milliseconds
		js.executeScript("var tmpArguments = arguments;setTimeout(function () {tmpArguments[0].setAttribute('style', '"
				+ originalStyle + "');},400);", element);
	}
	
}
