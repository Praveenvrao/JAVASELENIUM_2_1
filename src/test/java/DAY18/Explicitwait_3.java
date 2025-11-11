package DAY18;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait_3 {

	public static void main(String[] args) {
		// Explicit wait3
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait Exwait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/");
		Exwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space() ='Create new account']"))).click();
		Exwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name ='firstname']"))).sendKeys("RAJAN");
	
		Exwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Sign Up' and @type ='submit']"))).click();

	}

}
