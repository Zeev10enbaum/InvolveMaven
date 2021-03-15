package tests;
import org.testng.annotations.Test;
import pageobjects.TopMenuBarInvolveMe;
public class logout extends BaseTest {


	
	@Test(description = "Log out ")
	public void tc02_LogOut() {
		TopMenuBarInvolveMe tm = new TopMenuBarInvolveMe(driver);
		tm.userMenuBtn();
		tm.selectdropDownMenu("Log Out");
 }
}