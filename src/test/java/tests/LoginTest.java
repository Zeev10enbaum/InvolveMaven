package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageobjects.MainPage;
import pageobjects.MyWorkspacePageInvolveMe;
import pageobjects.LogInPageInvolveMe;

public class LoginTest extends BaseTest {

	@Override
	@Test(description = "Override base test  ")
	public void validLogin() {

	}

	@Test(description = "Click on log in")
	public void tc01_goToLoginScreen() {
		MainPage mp = new MainPage(driver);
		mp.gotologin();
	}

	@Test(dataProvider = "getData", description = "InValid log in - credentials do not match")
	public void tc02_faileLogIn(String user, String password, String error) {
		LogInPageInvolveMe lp = new LogInPageInvolveMe(driver);
		lp.login(user, password);
		String expected = error;
		String actual = lp.getErrorMessage();
		Assert.assertEquals(actual, expected);
	}

	@DataProvider
	public Object[][] getData() {
		String[][] names = {
				{ "NotValidMAILandPassword@gmail.com", "NotValidPassword","These credentials do not match our records." },
				{ "NotValidMAIl@gmail.com", "1qaz2wsx3E", "These credentials do not match our records." },
				{ "Tenenbaumzeev@gmail.com", "NotValidPassword", "These credentials do not match our records." } };
		return names;
	}

	@Test(description = "Valid log in")
	public void tc03validLoginValidation() {
		LogInPageInvolveMe lp = new LogInPageInvolveMe(driver);
		lp.login("Tenenbaumzeev@gmail.com", "1qaz2wsx3E");
//		Navigating to"Workspace" page after log in
		MyWorkspacePageInvolveMe wsp = new MyWorkspacePageInvolveMe(driver);
		String actual = wsp.validateWorkspacePageName();
		String expected = "Workspaces";
		Assert.assertEquals(actual, expected);
	}

}
