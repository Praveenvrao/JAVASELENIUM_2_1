package DAY17;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Methods {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login.php/");
		driver.getCurrentUrl();
		System.out.println(driver.getTitle());
		driver.getWindowHandle();
		driver.findElement(By.xpath("//a[normalize-space()='Forgotten account?']")).click();
		
		Thread.sleep(4000);
		WebElement FP1 = driver.findElement(By.xpath("//a[normalize-space()='Forgotten account?']"));
		FP1.getText();
		FP1.click();
		Set<String> WHS = driver.getWindowHandles();
		System.out.println("Window handles are -> "+ WHS);
		
		//Browser methods
				Thread.sleep(3000);
				driver.close();
				Thread.sleep(3000);
				driver.quit();
		

	}

}
