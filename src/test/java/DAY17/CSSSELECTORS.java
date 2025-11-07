package DAY17;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.implementation.bytecode.Division;

public class CSSSELECTORS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nopcommerce.com/en/get-started");
		driver.manage().window().maximize();
		
		//Tag.classname
		//driver.findElement(By.cssSelector("svg#navigation-shopping-cart-ico")).click();
		
		//tag#id
		driver.get("https:www.amazon.com");
		List<WebElement> l1 = driver.findElements(By.cssSelector("header#navbar-main"));
		System.out.println(l1);
		
		//tag [Attribute]
		driver.findElement(By.cssSelector("i['hm-icon nav-sprite']")).click();
		
		

	}

}
