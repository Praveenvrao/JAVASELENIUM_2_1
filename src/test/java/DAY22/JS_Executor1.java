package DAY22;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JS_Executor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//Sending elements with Javascript executor
		WebElement namElement = driver.findElement(By.xpath("//input[@id='name']"));
		JavascriptExecutor JS1 = (JavascriptExecutor)driver;
		JS1.executeScript("arguments[0].setAttribute('value','JONES')", namElement);
		
		WebElement phoneElement = driver.findElement(By.xpath("//input[@id='phone']"));
		JS1.executeScript("arguments[0].setAttribute('value','+61728376277')", phoneElement);
		
		//clicking element using Java script
		WebElement genderElement = driver.findElement(By.xpath("//input[@id='male']"));
		JS1.executeScript("arguments[0].click()", genderElement);
		
		WebElement dynamicstartElement = driver.findElement(By.xpath("//button[@onclick='toggleButton(this)']"));
		JS1.executeScript("arguments[0].click()", dynamicstartElement);
		System.out.println(dynamicstartElement.getText());
		if(dynamicstartElement.getText().equals("STOP")) {
			System.out.println("Testcase executed successfully");
		}else {
			System.out.println("Testcase Failed");
		}
		driver.quit();

	}

}
