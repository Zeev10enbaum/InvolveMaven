package pageobjects;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import pageobjects.BasePage;

public class LiteraturePopQuizPage3 extends BasePage {
// constructor
	public LiteraturePopQuizPage3(WebDriver driver) {
		super(driver);

	}
	@FindBy(css = "button.c-answer")
	private List<WebElement> listOfanswers;
	@FindBy(css = ".c-button.btn")
	
	private WebElement firstPageNextBtn;
		public void chooseAnswerList(String answer) {
		sleep(3000);
		for (WebElement el : listOfanswers) {
			String listName = getText(el);
			if (listName.equalsIgnoreCase(answer)) {
//				move mouse to this item
//			MoveTo(el);
				click(el);
			break;
			 
			}
		}
	}

	public void firstPageNextBtn() {
		click(firstPageNextBtn);
		sleep(2000);
	}
}
	
	

	
	
	

