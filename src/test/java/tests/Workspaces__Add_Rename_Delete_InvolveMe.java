package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.MyWorkspacePageInvolveMe;
import pageobjects.TopMenuBarInvolveMe;
import pageobjects.LogInPageInvolveMe;
public class Workspaces__Add_Rename_Delete_InvolveMe extends BaseTest {

	@Test(description = "Create new Workspace")
	public void tc01_addNewWorkspace() {
		MyWorkspacePageInvolveMe wp = new MyWorkspacePageInvolveMe(driver);
		wp.addWorkspacesBtn();
		wp.addNewWorkspace("Workspace Test");
		/// Verifying "Create workspace" screen is on
		String actual = wp.createNewWorkSpaceValidation();
		String expected = "Create a new Workspace";
		Assert.assertEquals(actual, expected);
	}

	@Test(description = " New Workspace confirmation")
	public void tc03_createWorkspaceConfirmation() {
		MyWorkspacePageInvolveMe wp = new MyWorkspacePageInvolveMe(driver);
		wp.createWorkspaceBtn();
//		Verifying new workspace is added 
		boolean expected = wp.checkIfWorkspaceAdded("Workspace Test");
		Assert.assertTrue(expected, "Sorry didn't find your workspace  ");
	}

	@Test(description = "Rename Workspace")
	public void tc04_renameWorkspace() {
		MyWorkspacePageInvolveMe wp = new MyWorkspacePageInvolveMe(driver);
		wp.clickMyWorkspaceOptionBtn();
		wp.selectingRenameWorkspace();
///		Verifying Rename Workspace screen is on 
		String actual = wp.renameWorkspaceverification();
		String expected = "Rename Workspace";
		Assert.assertEquals(actual, expected);
	}

	@Test(description = "Rename Workspace")
	public void tc05_renameWorkspaceBtn() {
		MyWorkspacePageInvolveMe wp = new MyWorkspacePageInvolveMe(driver);
		wp.renameWorkspaceBtn("Delete Workspace Test");
		wp.confirmRenameBtn();
//		Verifying workspace name was renamed 
		boolean expected = wp.checkIfWorkspaceAdded("Delete Workspace Test");
		Assert.assertTrue(expected, "Sorry didn't find your workspace  ");
	}
  
	@Test(description = "Delete Workspace")
	public void tc06_deleteWorkspace() {
		MyWorkspacePageInvolveMe wp = new MyWorkspacePageInvolveMe(driver);
		wp.clickMyWorkspaceOptionBtn();
		wp.deleteworkspace("Delete Workspace Test");
//		Verifying workspace was deleted 
		boolean expected = wp.checkIfWorkspaceAdded("Delete Workspace Test");
		Assert.assertTrue(expected, "Sorry didn't find your workspace  ");
	}
 
	@Test(description = "Log out ")
	public void tc07_LogOut() {
		TopMenuBarInvolveMe tm = new TopMenuBarInvolveMe(driver);
		tm.userMenuBtn();
		tm.selectdropDownMenu("Log Out");
//		Verifying Rename Workspace screen is on 			
		LogInPageInvolveMe li = new LogInPageInvolveMe(driver);
		String actual = li.validateLogInScreen();
		String expected = "Log in";
		Assert.assertEquals(actual, expected);
	}
}
 