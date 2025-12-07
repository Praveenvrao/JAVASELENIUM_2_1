package DAY20;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DYNAMIC_TABLE_ASNMT {

	public static void main(String[] args) {
		// Dynamic table assignment
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		int Pages = driver.findElements(By.xpath("//ul[@class='pagination']/li")).size();
		System.out.println(Pages);
		int TableROWS = driver.findElements(By.xpath("//table[@id='productTable']/tbody/tr")).size();
		
		for(int p=1;p<=Pages;p++) {
			WebElement pagenumberElement = driver.findElement(By.xpath("//ul[@id='pagination']/li["+p+"]"));
			pagenumberElement.click();
			System.out.println("PAGE NUMBER "+ p +" ITEM DETAILS");
			for(int r=1;r<=TableROWS;r++) {
				WebElement namElement = driver.findElement(By.xpath("//table[@id='productTable']/tbody/tr["+r+"]/td[2]"));
				WebElement pricElement = driver.findElement(By.xpath("//table[@id='productTable']/tbody/tr[\"+r+\"]/td[3]"));
				System.out.println(namElement.getText() + " - " + pricElement.getText());
				WebElement selectboxElement = driver.findElement(By.xpath("//table[@id='productTable']/tbody/tr["+r+"]/td/input[@type='checkbox']"));
				selectboxElement.click();				
			}
			System.out.println();
		}
		driver.quit();

	}

}
