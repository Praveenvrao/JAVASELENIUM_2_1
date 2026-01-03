package DAY25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class APPLoginPage {
	
	WebDriver driver;
	// Constructor
	APPLoginPage(WebDriver driver) {
//		System.out.println("APPLoginPage Constructor");
		this.driver = driver;
	}
	
	// Locators
	By Username = By.xpath("//*[@placeholder = 'Username']");
	By password = By.xpath("//*[@name= 'password']");
	By loginbutton = By.xpath("//*[@type= 'submit']");
	By homeimg = By.xpath("//*[@alt= 'client brand banner']");
	
	// Methods
	public void enterUsername(String uname) {
		driver.findElement(Username).sendKeys(uname);
	}
	public void enterPassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}
	public void clickLogin() {
		driver.findElement(loginbutton).click();
	}
	public void LoginPageHomeimg() {
		WebElement homeimge= driver.findElement(homeimg);
		boolean imgstatus = homeimge.isDisplayed();
		Assert.assertEquals(imgstatus, true, "Home Page image is not displayed");
		System.out.println("LoginTestCase - TestHomeimge - PASSED");
	}

}
