package DAY19;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alerts_1 {

	public static void main(String[] args) throws Exception {
		// Programs for All type of alerts
		
		WebDriver driver = new ChromeDriver();
		WebDriverWait exWait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		//Simple alert
		driver.findElement(By.xpath("//*[normalize-space()='Simple Alert']")).click();
		Alert Sa = driver.switchTo().alert();
		System.out.println(Sa.getText());
		Sa.accept();
		Thread.sleep(4000);
		
		//2 Buttons alert / Coonfirmation alert
		driver.findElement(By.xpath("//*[normalize-space()='Confirmation Alert']")).click();
		exWait.until(ExpectedConditions.alertIsPresent());
		Alert cAlert = driver.switchTo().alert();
		System.out.println(cAlert.getText());
		cAlert.dismiss();
		Thread.sleep(4000);
		
		//Prompt alert
		driver.findElement(By.xpath("//*[normalize-space()='Prompt Alert']")).click();
		Thread.sleep(5000);
		
		
		

	}

}
