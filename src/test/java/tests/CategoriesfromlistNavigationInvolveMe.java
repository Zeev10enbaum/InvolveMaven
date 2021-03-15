package tests;


import org.testng.annotations.Test;

import pageobjects.MainPage;
import pageobjects.TemplatesPageInvolveMe;
import pageobjects.ChooseProjectTypeInvolveMe;
import pageobjects.MyWorkspacePageInvolveMe;
import pageobjects.LogInPageInvolveMe;

public class CategoriesfromlistNavigationInvolveMe extends BaseTest {

	@Test(description = "Valid log in")
	public void tc01_successfulLogIn() {
		MainPage mp = new MainPage(driver);
		mp.gotologin();
		LogInPageInvolveMe lp = new LogInPageInvolveMe(driver);
		lp.login("Tenenbaumzeev@gmail.com", "1qaz2wsx3E");

	}

	@Test(description = "Create new porject")
	public void tc02_CreateNewProject() {

		MyWorkspacePageInvolveMe mp = new MyWorkspacePageInvolveMe(driver);
		mp.clickCreateProjectBtn();

	}

	@Test(description = "Choose project type (Quiz)")
	public void tc03_ChooseProjectTypeQuiz() {

		ChooseProjectTypeInvolveMe cpt = new ChooseProjectTypeInvolveMe(driver);
		cpt.QuizBtn();
		cpt.sleep(2000);

	}

	@Test(description = "ChooseCategories")
	public void tc04_ChooseCategories() {

		TemplatesPageInvolveMe tp = new TemplatesPageInvolveMe(driver);
		tp.chooseCategory("Quiz");
		
////		Verifying "All" category is selected 
//		String actual = tp.chooseCategory("quiz");
//		String expected = "All";
//		Assert.assertEquals(actual, expected);
		
		
		tp.chooseCategory("Form");
//		tp.AllFormCategorie();
//		tp.QuizCategorie();
//		tp.SurveyCategorie();
//		tp.CalculatorCategorie();
//		tp.FormCategorie();
//		tp.PaymentFormCategorie();
//		tp.leadpageCategorie();
//		tp.PromotionCategorie();
//		tp.PersonalityTestCategorie();
//		tp.LinklistCategoryCategorie();

	}


}