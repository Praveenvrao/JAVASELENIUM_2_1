package DAY25;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTestCase {
	WebDriver driver;
	
	@BeforeClass
	public void Setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test (priority = 1)
	public void LoginTest() {
		System.out.println("LoginTestcase - LoginTest");
		APPLoginPage2 loginPage = new APPLoginPage2(driver);
		loginPage.enterUsername("Admin");
		loginPage.enterPassword("admin123");
		loginPage.clickLogin();
	}
	@Test (priority = 2)
	public void TestHomeimge() {
		APPLoginPage2 loginPage = new APPLoginPage2(driver);
		loginPage.LoginPageHomeimg();
	}
	@Test (priority = 3)
	public void TestAdminLink() {
		APPLoginPage2 loginPage = new APPLoginPage2(driver);
		loginPage.ClickAdminLink();
	}
	@Test (priority = 4)
	public void TestUserprfiledropdown() {
		APPLoginPage2 loginPage = new APPLoginPage2(driver);
		loginPage.UserProfileDropdown();
	}
	@Test (priority = 5)
	public void TestLogoutlink() {
		APPLoginPage2 loginPage = new APPLoginPage2(driver);
		loginPage.ClickLogoutLink();
	}
	@Test (priority = 6)
	public void TestHomepageURL() {
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		Assert.assertEquals(actualURL, expectedURL, "User is not logged out successfully");
		System.out.println("TESTCASE IS PASSED - User is able to logout successfully");
	}
	
	@AfterClass
	public void TearDown() {
		System.out.println("LoginTestCase - TearDown");
		driver.quit();
	}

}
