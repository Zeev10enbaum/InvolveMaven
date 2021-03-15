package pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TopMenuBarInvolveMe extends BasePage {

	// constructor

	public TopMenuBarInvolveMe(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = "#nav-dropdown")
	private WebElement accountBtn;
	@FindBy(css = "[href='https://app.involve.me/logout']")
	private WebElement logoutBtn;
	@FindBy(css = "[href='https://app.involve.me/projects']")
	private WebElement projectsBtn;
	@FindBy(css = "[href='https://app.involve.me/templates']")
	private WebElement templatesBtn;
	@FindBy(css = "[href='https://app.involve.me/analytics']")
	private WebElement analyticsBtn;
	@FindBy(css = "[href='https://app.involve.me/integrations']")
	private WebElement integrationsBtn;
	@FindBy(css = "[href='https://app.involve.me/affiliate']")
	private WebElement affiliateBtn;
	@FindBy(css = ".fas")
	private WebElement userMenuBtn;
	// list Of work spaces names
	@FindBy(css = "#app > div:nth-child(2) > nav > div.w-full.hidden.md\\:block.flex-grow.md\\:flex.md\\:items-center.md\\:w-auto > div:nth-child(2) > div > ul li a")
	private List<WebElement> listOfOptions;

//	("Click Projects tab")
	public void clickProjects() {
		click(projectsBtn);
	}

//("Click Templates tab")
	public void clickTemplates() {
		click(templatesBtn);
	}

//	("Click Analytics tab")
	public void clickAnalytics() {
		click(analyticsBtn);
	}

//	("Click Integrations tab")
	public void clickIntegrations() {
		click(integrationsBtn);
	}

//("Click Affiliate Program tab")
	public void clickAffiliateProgram() {
		click(affiliateBtn);
	}

	// ( Open user name menu )
	public void userMenuBtn() {
		click(userMenuBtn);
		sleep(1000);
	}

	public void selectdropDownMenu(String menuOption) {
		for (WebElement el : listOfOptions) {
			String listName = getText(el);
//		 sleep(2000);
			if (listName.equalsIgnoreCase(menuOption)) {
				click(el);
				break;
			}
		}
	}

}
