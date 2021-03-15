package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPageInvolveMe extends BasePage {
	// constructor
	public LogInPageInvolveMe(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = "[name='email']")
	private WebElement insetEmail;
	@FindBy(css = "[type='password']")
	private WebElement insetPassword;
	@FindBy(css = ".btn.btn-primary.btn-lg")
	private WebElement logInBtn;
	@FindBy(css = ".alert.alert-danger")
	private WebElement credentialsErrorMessag;
	@FindBy(css = ".e-form-heading")
	private WebElement Validateloginscreen;

	public void login(String email, String password) {
		click(insetEmail);
		fillText(insetEmail, email);
		fillText(insetPassword, password);
		click(logInBtn);
	}

//	Validation 

	public String getErrorMessage() {
		return getText(credentialsErrorMessag);
	}

	public String validateLogInScreen() {
		return getText(Validateloginscreen);
	}

}
