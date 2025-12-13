package DAY21;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		// Mouse Hover Action
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cloudflare.com/en-in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ProductLink = driver.findElement(By.xpath("//span[text()='Products']"));
		WebElement Securegateway = driver.findElement(By.xpath("//span[text()='Secure web gateway']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(ProductLink).moveToElement(Securegateway).click().perform();
		

	}

}
