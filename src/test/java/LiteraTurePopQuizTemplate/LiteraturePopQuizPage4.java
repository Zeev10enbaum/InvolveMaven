package LiteraTurePopQuizTemplate;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageobjects.BasePage;

public class LiteraturePopQuizPage4 extends BasePage {
// constructor
	public LiteraturePopQuizPage4(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = "button.c-answer")
	private List<WebElement> listOfanswers;
	@FindBy(css = ".c-button.btn")
	private WebElement PageNextBtn;
	@FindBy(css = ".e-html-container span")
	private WebElement literaturePopQuizPage4Validation;
	@FindBy(css = ".feedback-box p")
	private WebElement feedbackTextCorrectPag4;

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
		click(PageNextBtn);
	}

//	Validation 
//	Correct  page validation Assert.assertTrue
	public boolean literaturePopQuizPage4Validation(String name) {
		sleep(1500);
				if (getText(literaturePopQuizPage4Validation).contains(name)) {
				return true;
			
		}
		return false;
	}
	public String feedbackTextCorrectPag4() {
		sleep(2000);
		return getText(feedbackTextCorrectPag4);
	}
}
