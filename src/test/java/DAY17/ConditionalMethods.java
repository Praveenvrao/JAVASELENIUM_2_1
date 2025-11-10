package DAY17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class='_6ltg']/a[@role='button']")).click();
		Thread.sleep(2000);
		//Conditional methods
		WebElement CN = driver.findElement(By.xpath("//div[text()='Create a new account']"));
		CN.getText();
		boolean CreateAc = CN.isDisplayed();  //isDisplayed
		System.out.println(CreateAc);
		Thread.sleep(2000);
		boolean Firstname = driver.findElement(By.xpath("//*[@name ='firstname']")).isEnabled(); //isEnabled
		System.out.println(Firstname);
		Thread.sleep(2000);
		WebElement Sex = driver.findElement(By.xpath("//*[text()='Male']"));
		boolean SexSel = Sex.isSelected();   //isSelected
		System.out.println(SexSel);
		Thread.sleep(2000);
		Sex.click();
		Thread.sleep(2000);
		System.out.println(Sex.isSelected());
		driver.getCurrentUrl();
		Thread.sleep(3000);
		driver.quit();
		
		
		
		

	}

}
