package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IntegrationsPage extends BasePage {
	// constructor
	public IntegrationsPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = ".e-title")
	private WebElement validateIntegrationsPageName;

//	Validation 
	public String validateIntegrationsPageName() {
		return getText(validateIntegrationsPageName);
	}

}
