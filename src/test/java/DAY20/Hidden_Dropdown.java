package DAY20;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_Dropdown {

	public static void main(String[] args) throws Exception {
		// Hidden dropdown selector
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.xpath("//*[@placeHolder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@placeHolder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[text()=' Login ']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='PIM']")).click();
		driver.findElement(By.xpath("//div[7]//div[1]//div[2]//div[1]//div[1]//div[2]//i[1]")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Marketing']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Reset']")).click();
		driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
		driver.findElement(By.xpath("//a[@role='menuitem' and normalize-space() ='Logout']")).click();
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		driver.quit();
		

	}

}
