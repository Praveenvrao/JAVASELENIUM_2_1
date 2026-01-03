package DAY25;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
	
	@Test
	public void LoginTest() {
		System.out.println("LoginTestcase - LoginTest");
		APPLoginPage loginPage = new APPLoginPage(driver);
		loginPage.enterUsername("Admin");
		loginPage.enterPassword("admin123");
		loginPage.clickLogin();
	}
	@AfterMethod
	public void TestHomeimge() {
		APPLoginPage loginPage = new APPLoginPage(driver);
		loginPage.LoginPageHomeimg();
	}
	@AfterClass
	public void TearDown() {
		System.out.println("LoginTestCase - TearDown");
		driver.quit();
	}

}
