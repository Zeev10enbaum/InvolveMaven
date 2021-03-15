package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AffiliateProgramPage extends BasePage {
	// constructor
	public AffiliateProgramPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = ".e-title")
	private WebElement validateAffiliateProgramPageName;

//	Validation 
	public String validateAffiliateProgramPageName() {
		return getText(validateAffiliateProgramPageName);
	}

}
