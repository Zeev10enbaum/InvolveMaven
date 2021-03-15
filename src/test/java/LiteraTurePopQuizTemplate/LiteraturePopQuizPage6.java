package LiteraTurePopQuizTemplate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageobjects.BasePage;

public class LiteraturePopQuizPage6 extends BasePage {
// constructor
	public LiteraturePopQuizPage6(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = ".c-button-group-button.e-close.float-right")
	private WebElement closeQuiz;
	@FindBy(css = ".e-headline span")
	private WebElement literaturePopQuizPage6Validation;
	@FindBy(css = ".share-icon.fa.fa-facebook-square")
	private WebElement facebookBtn;
	@FindBy(css = ".share-icon.fa.fa-twitter-square")
	private WebElement twitterBtn;
			

	public void closeQuiz() {
		click(closeQuiz);
	}
		
	public void facebook()  {
		click(facebookBtn);
		sleep(2000);
		alertOK();
		sleep(1000);
		}

	public void twitter ()  {
		click(twitterBtn);
		sleep(2000);
		alertOK();
		sleep(1000);
		}	
	
	
	


//	Validation 
//	Correct  page validation
	public String literaturePopQuizPage6Validation() {
		sleep(2000);
		return getText(literaturePopQuizPage6Validation);
	}
	
	
	
	

}
