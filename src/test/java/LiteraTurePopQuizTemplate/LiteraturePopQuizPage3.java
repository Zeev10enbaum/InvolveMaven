package LiteraTurePopQuizTemplate;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageobjects.BasePage;

public class LiteraturePopQuizPage3 extends BasePage {
// constructor
	public LiteraturePopQuizPage3(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = "button.c-answer")
	private List<WebElement> listOfanswers;
	@FindBy(css = ".c-button.btn")
	private WebElement thirdPageNextBtn;
	@FindBy(css = ".e-html-container span")
	private WebElement literaturePopQuizPage3Validation;
	@FindBy(css = ".feedback-box .feedback-text")
	private WebElement feedbackTextCorrectPag3;

	public void chooseAnswerList(String answer) {
		sleep(3000);
		for (WebElement el : listOfanswers) {
			String listName = getText(el);
			if (listName.equalsIgnoreCase(answer)) {
				click(el);
				break;

			}
		}
	}

	public void clickigNextButton() {
		click(thirdPageNextBtn);

	}

//	Validation 
//	Correct  page validation
	public String literaturePopQuizPage3Validation() {
		sleep(2000);
		return getText(literaturePopQuizPage3Validation);
	}

	public String feedbackTextCorrectPag3() {
		sleep(2000);
		return getText(feedbackTextCorrectPag3);
	}

}
