package DAY18;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Fluent_Waits {

	public static void main(String[] args) {
		// Fluent waits
		
		WebDriver driver = new ChromeDriver();
		//fluent wait declaration
		Wait<WebDriver> fWait = new FluentWait<WebDriver>(driver)
			.withTimeout(Duration.ofSeconds(10))
			.pollingEvery(Duration.ofSeconds(2))
			.ignoring(NoSuchElementException.class);
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement CreateAc = fWait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.xpath("//a[normalize-space() ='Create new account']"));
			}
		});
		CreateAc.click();
		
		

	}

}
