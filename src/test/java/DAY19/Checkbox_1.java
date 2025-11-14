package DAY19;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox_1 {

	public static void main(String[] args) {
		// Checkbox 1
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.navigate().to("https://www.qa-practice.com");
		driver.findElement(By.xpath("//*[normalize-space()='Single UI Elements']")).click();
		driver.findElement(By.xpath("//ul[@class='sub-menu']/li[3]")).click();
		
		//selecting single checkbox
		WebElement selectbox= driver.findElement(By.xpath("//*[@value='select me or not']"));
		System.out.println(selectbox.isEnabled());
		selectbox.click();
		
		driver.findElement(By.xpath("//*[@id ='submit-id-submit']")).click();
		
		String Actresult = driver.findElement(By.xpath("//p[@id='result-text']")).getText();
		
		if(Actresult.equals("select me or not")) {
			System.out.println("Single checkbox testcase is PASSED and the Selected Box is '"+Actresult+"'");
		}else {
			System.out.println("Single checkbox Testcase is failed");
		}
		driver.quit();		

	}

}
