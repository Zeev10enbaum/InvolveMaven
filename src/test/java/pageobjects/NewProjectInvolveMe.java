package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewProjectInvolveMe extends BasePage {
	// constructor
	public NewProjectInvolveMe(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = ".swal-modal.new-project-modal .swal-title")
	private WebElement ChooseProjectTypealidation;
	@FindBy(css = ".nav-link.project-name")
	private WebElement validateNewProjectName;

//	Validation 
	public String ChooseProjectTypeScreenNameValidation() {
		return getText(ChooseProjectTypealidation);
	}

	public String validateNewProjectName() {
		return getText(validateNewProjectName);
	}
}
