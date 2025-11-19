package DAY20;

import java.time.Duration;
import java.util.List;import javax.naming.spi.ObjectFactoryBuilder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bootstrap_Dropdown {

	public static void main(String[] args) {
		// Bootstrap dropdown
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationcentral.com/demo/multi_select_dropdown.html");
		driver.findElement(By.xpath("//*[@id='dropdown-toggle']")).click();
		
//		selecting single option
		//driver.findElement(By.xpath("//label[text()='Cherry']")).click();
		
//		Selecting multiple options
		List<WebElement> Alloptions1 = driver.findElements(By.xpath("//ul[@id='dropdown-menu']//li"));

		for(WebElement OP: Alloptions1) {
			if(OP.getText().equals("Apple") || OP.getText().equals("Cherry") || OP.getText().equals("Fig")) {
				OP.click();
				System.out.println(OP.getText());
				
			}
		}
		driver.findElement(By.xpath("//*[@id='dropdown-toggle']")).click();
		String SItems= driver.findElement(By.xpath("//*[@id='selected-items']")).getText();
		System.out.println("Selected items are > "+ SItems);
		driver.quit();
	}

}
