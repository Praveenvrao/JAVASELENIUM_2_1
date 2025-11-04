package DAY16;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.className("desktop-searchBar")).sendKeys("Mens watches");
		List<WebElement> headers = driver.findElements(By.id("desktop-header-cnt"));
		System.out.println(headers.size());
		System.out.println(headers);
		
		//Tagname
		
		List<WebElement> Allimgs= driver.findElements(By.tagName("img"));
		System.out.println(Allimgs.size());
		System.out.println(Allimgs);
		driver.close();
		

	}

}
