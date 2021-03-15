package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChooseProjectTypeInvolveMe extends BasePage {
	// constructor
	public ChooseProjectTypeInvolveMe(WebDriver driver) {
		super(driver);
	}

//Click on Quiz button 
	@FindBy(css = "[alt='Quiz']")
	private WebElement QuizBtn;
	// Start project from scratch button
	@FindBy(css = " div:nth-child(2) > div > a > div > div.title")
	private WebElement StartFromScratchBtn;
	// Click on Survey
	@FindBy(css = " a:nth-child(2) > div > div.title")
	private WebElement SurveyBtn;
	@FindBy(css = ".col-md-12.c-list-header > .e-title")
	private WebElement ChooseProjectTypePageName;
	@FindBy(css = ".form-group #project-name")
	private WebElement insertProjectName;
	@FindBy(css = "div:nth-child(1) > label > div > button")
	private WebElement startEditBtn;
	@FindBy(css = ".e-close.nav-link")
	private WebElement saveAndCloseBtn;

	public void QuizBtn() {
		sleep(5000);
		click(QuizBtn);
	}

	public void SurveyBtn() {
		click(SurveyBtn);
	}

	public void StartProjectFromScratch() {
		click(StartFromScratchBtn);
	}

	public void insertProjectName(String projectName) {
		sleep(500);
		click(insertProjectName);
		fillText(insertProjectName, projectName);
	}

	public void startEditBtn() {
		sleep(500);
		click(startEditBtn);
	}

	public void saveAndCloseBtn() {
		click(saveAndCloseBtn);
	}

//	Validation 
	public String validateChooseProjectTypePageName() {
		return getText(ChooseProjectTypePageName);
	}
}
