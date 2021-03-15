package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.ChooseProjectTypeInvolveMe;
import pageobjects.MyWorkspacePageInvolveMe;
import pageobjects.NewProjectInvolveMe;

public class ProjectStartFromscratch extends BaseTest {
	@Test(description = "Create new Workspace")
	public void tc01_addNewWorkspace() {
		MyWorkspacePageInvolveMe wp = new MyWorkspacePageInvolveMe(driver);
		wp.addWorkspacesBtn();
		/// Verifying that the create a new workspace screen is on
		String actual = wp.createNewWorkSpaceValidation();
		String expected = "Create a new Workspace";
		Assert.assertEquals(actual, expected);
		wp.addNewWorkspace("ZTWorkSpace");
	}

	@Test(description = " New Workspace confirmation")
	public void tc02_createWorkspaceConfirmation() {
		MyWorkspacePageInvolveMe wp = new MyWorkspacePageInvolveMe(driver);
		wp.createWorkspaceBtn();
	}

	@Test(description = " Start new project (BTN) ")
	public void tc03_startNewProject() {
		MyWorkspacePageInvolveMe wp = new MyWorkspacePageInvolveMe(driver);
		wp.startProjectOnWorkspace();
		/// Verifying entering Choose project type page after clicking the start button
		ChooseProjectTypeInvolveMe cpt = new ChooseProjectTypeInvolveMe(driver);
		String actual = cpt.validateChooseProjectTypePageName();
		String expected = "Choose project type";
		Assert.assertEquals(actual, expected);
	}

	@Test(description = "Start ProjectFrom Scratch (BTN)")
	public void tc04_ChooseProjectTypeQuiz() {
		ChooseProjectTypeInvolveMe cpt = new ChooseProjectTypeInvolveMe(driver);
		cpt.StartProjectFromScratch();
		cpt.sleep(2000);
		/// Verifying entering Choose project type page after clicking the start from
		/// scratch
		NewProjectInvolveMe npcpt = new NewProjectInvolveMe(driver);
		String actual = npcpt.ChooseProjectTypeScreenNameValidation();
		String expected = "Choose Project Type";
		Assert.assertEquals(actual, expected);
	}

	@Test(description = "Insert Project Name")
	public void tc05_insertProjectName() {
		ChooseProjectTypeInvolveMe cpt = new ChooseProjectTypeInvolveMe(driver);
		cpt.insertProjectName("123");
		cpt.startEditBtn();
		/// Validate New Project Name "123"
		NewProjectInvolveMe npcpt = new NewProjectInvolveMe(driver);
		String actual = npcpt.validateNewProjectName();
		String expected = "123";
		Assert.assertEquals(actual, expected);
	}

	@Test(description = "Save and close project")
	public void tc06_saveAndClose() {
		ChooseProjectTypeInvolveMe cpt = new ChooseProjectTypeInvolveMe(driver);
		cpt.saveAndCloseBtn();
		/// validate Works pacePage Name
		MyWorkspacePageInvolveMe wp = new MyWorkspacePageInvolveMe(driver);
		String actual = wp.validateNewWorkspacecreated();
		String expected = "ZTWorkSpace";
		Assert.assertEquals(actual, expected);
	}

	@Test(description = "Create new porject")
	public void tc07_CreateNewProject() {
		MyWorkspacePageInvolveMe MP = new MyWorkspacePageInvolveMe(driver);
		MP.clickCreateProjectBtn();
	}

	@Test(description = "Start ProjectFrom Scratch (BTN)")
	public void tc09_ChooseProjectTypeQuiz() {
		ChooseProjectTypeInvolveMe cpt = new ChooseProjectTypeInvolveMe(driver);
		cpt.StartProjectFromScratch();
		cpt.sleep(2000);
		/// Verifying entering Choose project type page after clicking the start from
		/// scratch
		NewProjectInvolveMe npcpt = new NewProjectInvolveMe(driver);
		String actual = npcpt.ChooseProjectTypeScreenNameValidation();
		String expected = "Choose Project Type";
		Assert.assertEquals(actual, expected);
	}

	@Test(description = "Insert Project Name")
	public void tc10_insertProjectName() {
		ChooseProjectTypeInvolveMe cpt = new ChooseProjectTypeInvolveMe(driver);
		cpt.insertProjectName("456");
		cpt.startEditBtn();
		/// Validate New Project Name "456"
		NewProjectInvolveMe npcpt = new NewProjectInvolveMe(driver);
		String actual = npcpt.validateNewProjectName();
		String expected = "456";
		Assert.assertEquals(actual, expected);
	}
 
	@Test(description = "Save and close project")
	public void tc11_saveAndClose() {
		ChooseProjectTypeInvolveMe cpt = new ChooseProjectTypeInvolveMe(driver);
		cpt.saveAndCloseBtn();
		/// validate Works pacePage Name
		MyWorkspacePageInvolveMe wp = new MyWorkspacePageInvolveMe(driver);
		String actual = wp.validateNewWorkspacecreated();
		String expected = "ZTWorkSpace";
		Assert.assertEquals(actual, expected);
	}
 
	@Test(description = "Delete project")
	public void tc12_deleteProject() {
		MyWorkspacePageInvolveMe MP = new MyWorkspacePageInvolveMe(driver);
		MP.chooseProject("456");
		MP.deleteProjectFromMenuBtn();
//		Verifying workspace name was renamed 
		boolean expected = MP.verifyProjectName("456");
		Assert.assertTrue(expected, "Sorry didn't find your workspace  ");
	}
}