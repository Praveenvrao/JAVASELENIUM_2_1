package DAY20;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown_1 {

	public static void main(String[] args) {
		// Select type dropdown
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/dropdown");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		Select dropdown
		WebElement dropdownEle = driver.findElement(By.xpath("//select[@id='dropdown']"));
		Select Sdropdown = new Select(dropdownEle);
		System.out.println(Sdropdown.getOptions());
		

	}

}
