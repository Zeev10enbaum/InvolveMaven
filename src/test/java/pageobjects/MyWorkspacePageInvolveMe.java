package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyWorkspacePageInvolveMe extends BasePage {
	// constructor
	public MyWorkspacePageInvolveMe(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = ".hidden:nth-child(2) ")
	private WebElement CreateProjectBtn;
	@FindBy(css = ".flex.justify-between.text-lg.font-medium.px-5 button ")
	private WebElement addWorkspacesBtn;
	@FindBy(css = "[placeholder='Workspace name']")
	private WebElement workSpaceField;
	@FindBy(css = "#confirm-create-button")
	private WebElement createWorkspacesBtn;
	@FindBy(css = "[data-toggle='dropdown'] [aria-hidden='true']")
	private WebElement clickMyWorkspaceOptionBtn;
// Select rename workspace  action 
	@FindBy(css = "li:nth-child(1) > button")
	private WebElement renamekWorkspace;
	// Insert new workspace name
	@FindBy(css = ".p-6.md\\:p-8 > input")
	private WebElement insertNewWorkSpaceName;
	// Confirm new workspace name
	@FindBy(css = "#confirm-create-button")
	private WebElement confirmNewNameBtn;
//	Selecte Delete workspace action
	@FindBy(css = "li:nth-child(2) > button")
	private WebElement deleteWorkspace;
	// Insert workspace name to delete
	@FindBy(css = ".p-6.md\\:p-8 > input")
	private WebElement insertWorkSpaceName;
	// Confirm delete workspace
	@FindBy(css = "#confirm-create-button")
	private WebElement confirmDeleteBtn;
	// list Of work spaces names
	@FindBy(css = ".px-5.flex.justify-between .mr-3.truncate")
	private List<WebElement> listOfworkspace;
	// Add project to workspace
	@FindBy(css = "h1+a")
//	@FindBy(css =".px-6.py-2")
	private WebElement StartBtn;
	@FindBy(css = ".flex.justify-between.text-lg span")
	private WebElement WorkspacPageName;
	@FindBy(css = "#app .max-w-full div .mt-4 > .mt-8 > div")
//	.leading-tight.text-lg.font-medium a
	private List<WebElement> listOfProject;
	@FindBy(css = ".flex.justify-right.items-center .dropdown.relative")
	private WebElement dropdownBtn;
	// Delete Project from menu
	@FindBy(css = "div > ul > li:nth-child(10) > button")
	private WebElement deleteProjectBtn;
	// Delete Project from menu
	@FindBy(css = "#confirm-delete-button")
	private WebElement confirmdeleteProjectBtn;
	// Validate new workspace was created
	@FindBy(css = ".h-10 h1")
	private WebElement WorkspaceName;
	// Create New Work SpaceValidation
	@FindBy(css = ".mb-6")
	private WebElement creatNewWorkSpaceValidation;
	// Create New Work SpaceValidation
	@FindBy(css = ".mb-6")
	private WebElement renameWorkspaceverification;
	// Validate "Delete workspace screen
	@FindBy(css = ".mb-6")
	private WebElement DeleteWorkspaceverification;
	@FindBy(css = ".relative.flex.flex-col")
	private List<WebElement> listOfProjects;

	public void clickCreateProjectBtn() {
		sleep(2000);
		click(CreateProjectBtn);
		sleep(500);
	}

//Add new workspace BTN
	public void addWorkspacesBtn() {
		click(addWorkspacesBtn);
		sleep(2000);
	}

//Insert workspace name
	public void addNewWorkspace(String name) {
		fillText(workSpaceField, name);

	}

	// Insert workspace name
	public void createWorkspaceBtn() {
		click(createWorkspacesBtn);
		sleep(500);
	}

//	Open the selecting workspace rename or delete
	public void clickMyWorkspaceOptionBtn() {
		click(clickMyWorkspaceOptionBtn);
		sleep(1000);
	}

//	Selecting delete workspace
	public void deleteworkspace(String name) {
		sleep(1000);
		click(deleteWorkspace);
		sleep(500);
		fillText(insertWorkSpaceName, name);
		click(confirmDeleteBtn);
		sleep(500);
	}

//		Rename workspace option
	public void selectingRenameWorkspace() {
		click(renamekWorkspace);
		sleep(500);
//		fillText(insertNewWorkSpaceName, name);
//		click(confirmNewNameBtn);
//		sleep(500);
	}

//	Rename workspace option
	public void renameWorkspaceBtn(String name) {
		fillText(insertNewWorkSpaceName, name);

	}

//	Rename workspace option
	public void confirmRenameBtn() {
		click(confirmNewNameBtn);
		sleep(500);
	}

	public void chooseWorkSpace(String workspace) {
		for (WebElement el : listOfworkspace) {
			String listName = getText(el);
			if (listName.equalsIgnoreCase(workspace)) {
				click(el);
				break;
			}
		}
	}

	public boolean checkIfWorkspaceAdded(String name) {
//		click(kababMenuBtn);
		sleep(1500);
		for (WebElement el : listOfworkspace) {
			if (getText(el).equalsIgnoreCase(name)) {
				return true;
			}
		}
		return false;
	}

	public void startProjectOnWorkspace() {
		sleep(500);
		click(StartBtn);
		sleep(500);
	}

//	select project 

	public void chooseProject(String name) {
		sleep(3000);
		List<WebElement> blockList = driver.findElements(By.cssSelector(".relative.flex.flex-col"));
		for (WebElement el : blockList) {
			String title = getText(el.findElement(By.cssSelector(".leading-tight a")));
			if (title.equalsIgnoreCase(name)) {
				click(el.findElement(By.cssSelector("[data-toggle='dropdown'] .fill-current")));
				break;
			}
		}
	}

	// Delete project from dropdown menu
	public void deleteProjectFromMenuBtn() {
		click(deleteProjectBtn);
		sleep(3000);
		click(confirmdeleteProjectBtn);
		sleep(6000);
	}

//	Validation 

	public String validateWorkspacePageName() {
		sleep(2000);
		return getText(WorkspacPageName);
	}

	public String validateNewWorkspacecreated() {
		sleep(2000);
		return getText(WorkspaceName);
	}

	public String validateRename() {
		sleep(2000);
		return getText(WorkspacPageName);
	}

//	Entering create New Workspace screen 
	public String createNewWorkSpaceValidation() {
		return getText(creatNewWorkSpaceValidation);

	}

//	Entering create New Workspace screen 
	public String renameWorkspaceverification() {
		return getText(renameWorkspaceverification);

	}

//	Validating delete workspace screen is on
	public String DeleteWorkspaceverification() {
		return getText(DeleteWorkspaceverification);

	}

//	public boolean checkIfprojectexsit (String name) {

	public boolean verifyProjectName(String name) {
		sleep(3000);
		for (WebElement el : listOfProjects) {
			if (getText(el).equalsIgnoreCase(name)) {
				return true;
			}
		}
		return false;
	}

}
