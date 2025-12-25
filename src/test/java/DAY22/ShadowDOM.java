package DAY22;

import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ShadowDOM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://books-pwakit.appspot.com/");

		SearchContext shadow0 = driver.findElement(By.cssSelector("book-app[apptitle='BOOKS']")).getShadowRoot();
		System.out.println(shadow0);
		WebElement searchfield = shadow0.findElement(By.cssSelector("#input"));
		searchfield.sendKeys("INDIAN HISTORY");
		WebElement Search = shadow0.findElement(By.cssSelector("svg[viewBox='0 0 24 24']"));
		Search.click();
		driver.getTitle();
		if(driver.getTitle().equals("Books")) {
			System.out.println("TESTCASE PASSED");
		}else {
			System.out.println("TESTCASE FAILED");
		}
		
		driver.quit();
		

	}

}
