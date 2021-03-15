package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.TemplatesPageInvolveMe;
import pageobjects.TopMenuBarInvolveMe;

public class GoingOverAllCategoriesInvolveMe2 extends BaseTest {

	@Test(description = "Open Templates tab")
	public void tc03_openTemplatesTab() {
		TopMenuBarInvolveMe tmbn = new TopMenuBarInvolveMe(driver);
		tmbn.clickTemplates();
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
		tp.QuizCategory();
		tp.SurveyCategory();
		tp.CalculatorCategory();
		tp.FormCategory();
		tp.PaymentFormCategory();
		tp.leadpageCategory();
		tp.PromotionCategory();
		tp.PersonalityTestCategory();
		tp.LinklistCategoryCategory();
	}
}