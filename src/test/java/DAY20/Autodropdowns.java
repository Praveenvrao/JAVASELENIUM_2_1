package DAY20;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autodropdowns {

	public static void main(String[] args) throws Exception {
		// Auto suggestion dropdowns
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("Automation");
		List<WebElement> Sugg = driver.findElements(By.xpath("//div[@class='erkvQe']//ul[@role='listbox']//li"));
		
		for(WebElement SugOptions : Sugg) {
			String Text = SugOptions.getText();
			System.out.println(Text);
			if(Text.equals("automations iphone")) {
				SugOptions.click();
			}
		}
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.quit();

	}

}
