package DAY21;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker1 {

	public static void main(String[] args) {
		// Datepicker by just giving input date
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/");
		driver.findElement(By.xpath("//a[normalize-space()='Datepicker']")).click();
		WebElement dateinput = driver.findElement(By.xpath("//*[@class='demo-frame']"));
		driver.switchTo().frame((dateinput));
		driver.findElement(By.xpath("//*[@id='datepicker']")).sendKeys("04/04/2025");
		driver.quit();

	}

}
