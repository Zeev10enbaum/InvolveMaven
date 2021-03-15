package LiteraTurePopQuizTemplate;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageobjects.BasePage;

public class LiteraturePopQuizPage2 extends BasePage {
// constructor
	public LiteraturePopQuizPage2(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = "button.c-answer")
	private List<WebElement> listOfanswers;
	@FindBy(css = ".c-button.btn")
	private WebElement secoundPageNextBtn;
	@FindBy(css = ".c-question span")
	private WebElement literaturePopQuizPage2Validation;
	@FindBy(css = ".feedback-box .feedback-text.correct")
	private WebElement feedbackTextCorrectPag2;

	public void chooseAnswerList(String answer) {
		sleep(3000);
		for (WebElement el : listOfanswers) {
			String listName = getText(el);
			if (listName.equalsIgnoreCase(answer)) {
				click(el);
//				click(secoundPageNextBtn);
				sleep(1000);
				break;
 
			}
		}
	}

	public void clickigNextButton() {
		click(secoundPageNextBtn);

	}

//	Validation 
//	Correct  page validation
	public String literaturePopQuizPage2Validation() {
		sleep(2000);
		return getText(literaturePopQuizPage2Validation);
	}

	public String feedbackTextCorrectPag2() {
		sleep(2000);
		return getText(feedbackTextCorrectPag2);
	}
}