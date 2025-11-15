package DAY19;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.dom.Text;

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
		Alert PAlert = driver.switchTo().alert();
		System.out.println("The Text in the Alert is "+PAlert.getText());
	
		PAlert.sendKeys("MICHEAL JORDAN");
		PAlert.accept();
		
		String AlertText = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		System.out.println(AlertText);
		driver.quit();
		

	}

}
