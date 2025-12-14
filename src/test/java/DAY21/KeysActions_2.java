package DAY21;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeysActions_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		Actions actions = new Actions(driver);
		driver.get("https://www.opencart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		WebElement Register = driver.findElement(By.xpath("//a[text()='Register' and @class ='btn btn-black navbar-btn']"));
		Actions Act = new Actions(driver);
		Act.keyDown(Keys.CONTROL).click(Register).keyUp(Keys.CONTROL).perform();
		List<String> wHandles = new ArrayList(driver.getWindowHandles());
		System.out.println(wHandles);
		driver.switchTo().window(wHandles.get(1));
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	}

}
