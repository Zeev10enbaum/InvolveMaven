package pageobjects;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TemplatesPageInvolveMe extends BasePage {
	// constructor
	public TemplatesPageInvolveMe(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = "#filter-all")
	private WebElement allCCategory;
	@FindBy(css = "#filter-quiz")
	private WebElement quizCategory;
	@FindBy(css = "#filter-survey")
	private WebElement surveyCategory;
	@FindBy(css = "#filter-calculator")
	private WebElement calculatorCategory;
	@FindBy(css = "#filter-form")
	private WebElement formCategory;
	@FindBy(css = "#filter-payment")
	private WebElement paymentCategory;
	@FindBy(css = "#filter-leadpage")
	private WebElement leadpageCategory;
	@FindBy(css = "#filter-promotion")
	private WebElement promotionCategory;
	@FindBy(css = "#filter-personality_test")
	private WebElement personality_testCategory;
	@FindBy(css = "#filter-linklist")
	private WebElement linklistCategory;
	@FindBy(css = "h3")
	private List<WebElement> listOfExamples;
//	Preview button
	@FindBy(css = "#template-gallery > tbody > tr:nth-child(3) > td:nth-child(1) > div > div.caption > div.e-button-container > a:nth-child(1) > button")
	private WebElement previewBtn;
//	Choose button
	@FindBy(css = "#template-gallery > tbody > tr:nth-child(3) > td:nth-child(1) > div > div.caption > div.e-button-container > a:nth-child(2) > button")
	private WebElement chooseBtn;
	// Selecting category from list
	@FindBy(css = ".nav.flex-column .nav-item a")
	private List<WebElement> listofCategories;
//	Validation 
	@FindBy(css = ".col-md-12.c-list-header > .e-title")
	private WebElement validateTemplatesPageName;
	@FindBy(css = " [title='Literature Pop Quiz']")
	private WebElement QuizName;

	public void AllFormCategory() {
		sleep(500);
		click(allCCategory);
	}

	public void QuizCategory() {
		sleep(500);
		click(quizCategory);
	}

	public void SurveyCategory() {
		sleep(500);
		click(surveyCategory);
	}

	public void CalculatorCategory() {
		sleep(500);
		click(calculatorCategory);
	}

	public void FormCategory() {
		sleep(500);
		click(formCategory);
	}

	public void PaymentFormCategory() {
		sleep(500);
		click(paymentCategory);
	}

	public void leadpageCategory() {
		sleep(500);
		click(leadpageCategory);
	}

	public void PromotionCategory() {
		sleep(500);
		click(promotionCategory);
	}

	public void PersonalityTestCategory() {
		sleep(500);
		click(personality_testCategory);
	}

	public void LinklistCategoryCategory() {
		sleep(500);
		click(linklistCategory);
	}

	public void chooseExampleList(String name) {
		for (WebElement el : listOfExamples) {
			String listName = getText(el);
			if (listName.equalsIgnoreCase(name)) {
//			move mouse to this item
				MoveTo(el);
				break;

			}
		}
	}

	public void openPreview() {
		sleep(3000);
		click(previewBtn);
	}

	public void chooseCategory(String name) {
		for (WebElement el : listofCategories) {
			String categoryName = getText(el);// Quiz\153
			categoryName = categoryName.substring(0, categoryName.indexOf("\n"));
			if (categoryName.equalsIgnoreCase(name)) {
//					if (categoryName.startsWith(name)
				sleep(2000);
				click(el);
				break;
			}
		}
	}

//	Validation 

	public String validateTemplatesPageName() {
		return getText(validateTemplatesPageName);
	}

	public String validaQuizName() {
		return getText(QuizName);
	}

//	Verifying "All" category is selected 
	public String allCategorySelected() {
		sleep(2000);
		return getText(allCCategory);
	}
}
