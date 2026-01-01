package DAY24;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderMethoddemo {
	
	WebDriver driver;
	@BeforeClass
	void testsetup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test (dataProvider = "DP1")
	void Testlogin(String URL, String User, String Pwd) {
		driver.get(URL);
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(User);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(Pwd);
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		boolean HomepageLogin = driver.findElement(By.xpath("//img[@alt='client brand banner']")).isDisplayed();
		if(HomepageLogin==true) {
			driver.findElement(By.xpath("//img[@class='oxd-userdropdown-img']")).click();
			Assert.assertTrue(true);
			WebElement Logout = driver.findElement(By.xpath("//a[normalize-space()='Logout']"));
			boolean Logoutstatus = Logout.isEnabled();
			if (Logoutstatus == true) {
				Logout.click();
				Assert.assertTrue(Logoutstatus);
			}else {
				System.out.println("Logout button not visible");
				Assert.fail();
			}
			
		}else {
			Assert.assertFalse(false);
		}
	}
	@AfterClass
	void TestClose() {
		driver.quit();
	}
	
	@DataProvider (name ="DP1", indices = {2,0})
	Object[][] Testdata() {
		Object data[][] = {
				{"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login", "Admin", "admin123"},
				{"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login", "Test", "wrong"},
				{"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login", "Admin", "admin123"},
		};
		return data;
	}
	
	
	

}
