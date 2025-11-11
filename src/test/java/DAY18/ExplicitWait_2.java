package DAY18;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_2 {

	public static void main(String[] args) {
		// Explicit wait
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebDriverWait Exwait1 = new WebDriverWait(driver, Duration.ofSeconds(5));
		Exwait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space() ='Create new account']"))).click();
		
		Wait<WebDriver> FWAIT1 = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(15))
				.pollingEvery(Duration.ofSeconds(3))
				.ignoring(NoSuchElementException.class);
		
		WebElement name = FWAIT1.until(new Function<WebDriver, WebElement>(){
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.xpath("//*[@name ='firstname']"));
			}
			
		});
		name.sendKeys("JACKS");
		
		WebElement Surname = FWAIT1.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.xpath("//*[@name ='lastname']"));
			}
		});
		Surname.sendKeys("WILL");
		WebElement  Sex = Exwait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[normalize-space()='Male']")));
		Sex.click();
		System.out.println(Sex.getText());
		

	}

}
