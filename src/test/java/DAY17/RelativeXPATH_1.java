package DAY17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
		driver.close();

		

	}

}
