package DAY17;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Axes {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com.au/");
		driver.manage().window().maximize();
		
		//descendant
		driver.findElement(By.xpath("//div[@id='nav-main']/descendant::a[1]")).click();
		//Preceding 
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text() = 'New Releases' and @href='/gp/new-releases/?ref_=nav_em_cs_newreleases_0_1_1_3' ]/preceding::li[1]")).click();
		Thread.sleep(2000);
		//following
		driver.findElement(By.xpath("//a[@href ='/gp/bestsellers/electronics/ref=zg_bs_nav_electronics_0']/following::li/a[text()='Garden']")).click();
		Thread.sleep(2000);
		//child
		driver.findElement(By.xpath("//ul[@class ='nav-ul']/child::li[1]")).click();
		Thread.sleep(3000);
		//parent
		driver.findElement(By.xpath("//a[@href='/super?ref_=nav_cs_DiscoBar_amazonbasket']/parent::div")).click();
		Thread.sleep(5000);
		List<WebElement> Text = driver.findElements(By.xpath("//span[normalize-space()='Prime member exclusive']"));
		System.out.println(Text);
		driver.getTitle();
		driver.close();
		
	}

}
