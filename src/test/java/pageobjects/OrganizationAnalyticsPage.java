package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrganizationAnalyticsPage extends BasePage {
	// constructor
	public OrganizationAnalyticsPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = ".text-3xl")
	private WebElement validateOrganizationAnalyticsPageName;

//	Validation 
	public String validateOrganizationAnalyticsPageName() {
		return getText(validateOrganizationAnalyticsPageName);
	}

}
