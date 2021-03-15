package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.MainPage;
import pageobjects.TemplatesPageInvolveMe;
import pageobjects.ChooseProjectTypeInvolveMe;
import pageobjects.MyWorkspacePageInvolveMe;
import pageobjects.LogInPageInvolveMe;

public class CategoriesNavigationInvolveMe extends BaseTest {

	@Test(description = "Valid log in")
	public void tc01_successfulLogIn() {
		MainPage mp = new MainPage(driver);
		mp.gotologin();
		LogInPageInvolveMe lp = new LogInPageInvolveMe(driver);
		lp.login("Tenenbaumzeev@gmail.com", "1qaz2wsx3E");
		MyWorkspacePageInvolveMe wsp = new MyWorkspacePageInvolveMe(driver);
//		Navigating to"Workspace" page after log in
		String actual = wsp.validateWorkspacePageName();
		String expected = "My Workspace";
		Assert.assertEquals(actual, expected);
	}
 
	@Test(description = "Create new porject")
	public void tc02_CreateNewProject() {

		MyWorkspacePageInvolveMe mp = new MyWorkspacePageInvolveMe(driver);
		mp.clickCreateProjectBtn();
//		Navigating  to "Choose project type" page Validation
		ChooseProjectTypeInvolveMe cpt = new ChooseProjectTypeInvolveMe(driver);
		String actual = cpt.validateChooseProjectTypePageName();
		String expected = "Choose project type";
		Assert.assertEquals(actual, expected);

	}

	@Test(description = "Choose project type (Quiz)")
	public void tc03_ChooseProjectTypeQuiz() {

		ChooseProjectTypeInvolveMe cpt = new ChooseProjectTypeInvolveMe(driver);
		cpt.QuizBtn();
		cpt.sleep(2000);
//		Navigating  to "Templates" page Validation
		TemplatesPageInvolveMe tp = new TemplatesPageInvolveMe(driver);
		String actual = tp.validateTemplatesPageName();
		String expected = "Templates";
		Assert.assertEquals(actual, expected);
	}
 
	@Test(description = "ChooseCategories")
	public void tc04_ChooseCategories() {

		TemplatesPageInvolveMe tp = new TemplatesPageInvolveMe(driver);
		tp.AllFormCategory();
//		Verifying "All" category is selected 
		String actual = tp.allCategorySelected();
		String expected = "All";
		Assert.assertEquals(actual, expected);
		
		
		
		
		
		
//		tp.QuizCategory();
//		tp.SurveyCategory();
//		tp.CalculatorCategory();
//		tp.FormCategory();
//		tp.PaymentFormCategory();
//		tp.leadpageCategory();
//		tp.PromotionCategory();
//		tp.PersonalityTestCategory();
//		tp.LinklistCategoryCategory();

	}

}