package DAY18;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation_Methods {

	public static void main(String[] args) throws Exception {
		// Browser Navigation methods
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		URL OrngehrmUrl = new URL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.navigate().to(OrngehrmUrl);
		
		driver.navigate().to("https://www.amazon.com.au/");
		driver.navigate().back();
		System.out.println(driver.getTitle());
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		driver.navigate().back();
		
		driver.navigate().refresh();
		driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();
		
		System.out.println(driver.getTitle());
		driver.close();
		driver.quit();
		
		
		

	}

}
