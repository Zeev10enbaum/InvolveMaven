package LiteraTurePopQuizTemplate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageobjects.BasePage;

public class LiteraturePopQuizPage5 extends BasePage {
// constructor
	public LiteraturePopQuizPage5(WebDriver driver) {
		super(driver);

	}

	@FindBy(css = ".input-label.firstName-label input")
	private WebElement insertFirstName;
	@FindBy(css = ".input-label.lastName-label input")
	private WebElement insertLastname;
	@FindBy(css = ".input-label.email-label input")
	private WebElement insertEmail;
	@FindBy(css = "span .el-checkbox__inner ")
	private WebElement CheckTheAgree;
	@FindBy(css = ".c-button.btn")
	private WebElement getResultBtn;
	@FindBy(css = ".title span")
	private WebElement literaturePopQuizPage5Validation;
	@FindBy(css = ".feedback-box p")
	private WebElement feedbackTextCorrectPag5;

	public void getResults(String FirstName, String LastName, String Email) {
		sleep(2000);
		click(insertFirstName);
		fillText(insertFirstName, FirstName);
		click(insertLastname);
		fillText(insertLastname, LastName);
		click(insertEmail);
		fillText(insertEmail, Email);
		click(CheckTheAgree);
		click(getResultBtn);

	}

//	Validation 
//	Correct  page validation
	public String literaturePopQuizPage5Validation() {
		sleep(2000);
		return getText(literaturePopQuizPage5Validation);
	}

	public String feedbackTextCorrectPag5() {
		sleep(2000);
		return getText(feedbackTextCorrectPag5);
	}

}
