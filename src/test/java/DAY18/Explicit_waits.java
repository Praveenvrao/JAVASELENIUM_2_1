package DAY18;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_waits {

	public static void main(String[] args)throws Exception {
		// Explicit Waits
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait Exwait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.com.au/");
		Exwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id ='twotabsearchtextbox']"))).sendKeys("Iphone 15 Pro");
		Exwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='nav-search-submit-button']"))).click();
		Exwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Shop Apple']"))).click();
		Thread.sleep(4000);
		System.out.println(driver.getCurrentUrl());
		driver.quit();
	}

}
