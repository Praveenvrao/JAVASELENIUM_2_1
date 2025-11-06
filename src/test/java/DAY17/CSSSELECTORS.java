package DAY17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.implementation.bytecode.Division;

public class CSSSELECTORS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nopcommerce.com/en/get-started");
		driver.manage().window().maximize();
		
		//Tag.classname
		driver.findElement(By.cssSelector("svg#navigation-shopping-cart-ico")).click();

	}

}
