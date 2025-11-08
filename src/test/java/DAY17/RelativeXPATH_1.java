package DAY17;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXPATH_1 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com.au/");
		driver.manage().window().maximize();
		
		//Relative xpath with single attribute
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@id ='nav-hamburger-menu']")).click();
		Thread.sleep(3000);
		
		//Relative xpath with multiple attribute
		driver.findElement(By.xpath("//a[@class='hmenu-item'][text()='Best Sellers']")).click();
		Thread.sleep(3000);
		//driver.close();
		
		//Relative xpath text() = "value"
		//boolean text1 = driver.findElement(By.xpath("//h1[text()='Amazon Best Sellers']")).isDisplayed();
		//System.out.println(text1);
		
		//relative xpath chained xpath
		boolean text1 = driver.findElement(By.xpath("//div/div/h1[text()='Amazon Best Sellers']")).isDisplayed();
		Thread.sleep(2000);
		System.out.println(text1);
		
		//relative xpath starts-with
		driver.findElement(By.xpath("//a[starts-with(text(),'Gar')]")).click();
		Thread.sleep(1000);
		
		//relative xpath Contains
		boolean text2 = driver.findElement(By.xpath("//span[contains(text(),'Amazon Best Sellers')]")).isDisplayed();
		System.out.println(text2);
		
		driver.close();


	}

}
