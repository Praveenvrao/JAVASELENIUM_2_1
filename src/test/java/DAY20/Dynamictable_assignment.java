package DAY20;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v140.page.Page;
import org.openqa.selenium.support.ui.Select;

public class Dynamictable_assignment {

	public static void main(String[] args) {
		// Dynamic table assignment
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://blazedemo.com/");
		WebElement DEPRTURE= driver.findElement(By.xpath("//select[@name='fromPort']"));
		Select depSelect = new Select(DEPRTURE);
		System.out.println(depSelect.getOptions());
		depSelect.selectByVisibleText("Mexico City");
		WebElement DESTINY = driver.findElement(By.xpath("//select[@name='toPort']"));
		Select desSelect = new Select(DESTINY);
		System.out.println(desSelect.getOptions());
		desSelect.selectByVisibleText("New York");
		driver.findElement(By.xpath("//input[@value ='Find Flights']")).click();
		
		String ActTitle = driver.getTitle();
		if (ActTitle.equals("BlazeDemo - reserve")) {
			String Pagetablename = driver.findElement(By.xpath("//*[@class='container']//h3")).getText();
			System.out.println("Entered the " + Pagetablename + " PAGE");
			
		}
		

	}

}
