package DAY25;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class APPLoginPage2 {
	
	// Constructor
	WebDriver driver;
	APPLoginPage2(WebDriver driver) {
		System.out.println("APPLoginPage2 Constructor");
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// Locators
	@FindBy(xpath = "//*[@placeholder = 'Username']") WebElement Username;
	@FindBy(xpath = "//*[@name= 'password']") WebElement password;
	@FindBy(xpath = "//*[@type = 'submit']") WebElement loginbutton;
	@FindBy(xpath = "//*[@alt= 'client brand banner']") WebElement homeimg;
	@FindBy(xpath="//li[1]//a[1]//span[1]") WebElement Adminlink;
	@FindBy(xpath = "//img[@class='oxd-userdropdown-img']") WebElement Userprofiledropdown;
	@FindBy(xpath = "//*[contains(text(), 'Logout')]") WebElement Logoutlink;
	
	// Methods
	public void enterUsername(String uname) {
		Username.sendKeys(uname);
	}
	public void enterPassword(String pwd) {
		password.sendKeys(pwd);
	}
	public void clickLogin() {
		loginbutton.click();
	}
	public void LoginPageHomeimg() {
		boolean imgstatus = homeimg.isDisplayed();
		System.out.println("Home Page image is displayed: " + imgstatus);
	}
	public void ClickAdminLink() {
		Adminlink.click();
	}
	public void UserProfileDropdown() {
		Userprofiledropdown.click();
	}
	public void ClickLogoutLink() {
		Logoutlink.click();
	}
}
