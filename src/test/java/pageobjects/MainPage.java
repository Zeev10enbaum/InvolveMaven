package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {

		// constructor
	public MainPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(css = ".other-link.login")
	private WebElement logInBtn;
	public void gotologin() {
		click(logInBtn);
		sleep(2000);
	}
}
