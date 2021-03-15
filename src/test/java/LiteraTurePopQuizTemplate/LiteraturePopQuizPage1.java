package LiteraTurePopQuizTemplate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageobjects.BasePage;

public class LiteraturePopQuizPage1 extends BasePage {
// constructor
	public LiteraturePopQuizPage1(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = ".c-button.btn")
	private WebElement StartQuizBtn;
	@FindBy(css = ".e-headline.is-shrinkable > div ")
	private WebElement literaturePopQuizPage1Validation;

	public void startQuizBtn() {
		sleep(3000);
		click(StartQuizBtn);
	}

//	Validation 
	public String literaturePopQuizPage1Validation() {
		sleep(2000);
		return getText(literaturePopQuizPage1Validation);
	}
}
