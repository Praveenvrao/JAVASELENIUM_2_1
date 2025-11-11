package DAY18;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IMPLICIT_WAITS {

	public static void main(String[] args) {
		// Implicit waits
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.amazon.com.au/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Iphone 15 Pro");
		WebElement search = driver.findElement(By.xpath("//*[@id='nav-search-submit-button']"));
		search.click();
		WebElement shopapple = driver.findElement(By.xpath("//span[normalize-space()='Shop Apple']"));
		System.out.println(shopapple.getText());
		shopapple.click();
		System.out.println("The current URL of the Page is ->" +driver.getCurrentUrl());
		System.out.println("The Title of the page is -> " + driver.getTitle());
		driver.quit();
		

	}

}
