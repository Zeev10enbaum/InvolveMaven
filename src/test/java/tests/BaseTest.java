package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageobjects.LogInPageInvolveMe;
import pageobjects.MainPage;


public class BaseTest {
	WebDriver driver;

	@BeforeClass
	public void setup() {
//		System.setProperty("webdriver.chrome.driver", "C:\\automation\\drivers\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("https://www.involve.me/");
	}
	
	@Test(description = "Valid log in")
	public void validLogin() {
		MainPage mp = new MainPage(driver);
		mp.gotologin();
		LogInPageInvolveMe lp = new LogInPageInvolveMe(driver);
		lp.login("dmvnvapb@gmail.com", "1qaz2wsx3E");
 
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
 