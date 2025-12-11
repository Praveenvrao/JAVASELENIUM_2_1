package DAY21;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DATEPICKETTYPE2 {

	public static void main(String[] args) {
		// Datepicker all type
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("01/16/2026");
		driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//input[@id='txtDate']")).click();
		WebElement Month2 = driver.findElement(By.xpath("//select[@aria-label='Select month']"));
		Select monthSelect = new Select(Month2);
		monthSelect.selectByVisibleText("Jan");
		WebElement Year2 = driver.findElement(By.xpath("//select[@aria-label='Select year']"));
		Select yearSelect = new Select(Year2);
		yearSelect.selectByValue("2026");
		
		List<WebElement> Alldates = driver.findElements(By.xpath("//table[@class ='ui-datepicker-calendar']/tbody/tr/td/a[@class = 'ui-state-default']"));
		for (WebElement Tdate: Alldates) {
			if(Tdate.getText().equals("16")) {
				Tdate.click();
			}
		}
		driver.findElement(By.xpath("//input[@id='start-date']")).sendKeys("16-01-2026");
		driver.findElement(By.xpath("//input[@id='end-date']")).sendKeys("16-01-2027");
		driver.findElement(By.xpath("//button[@class='submit-btn']")).click();
		
		String Output = driver.findElement(By.xpath("//div[@id='result']")).getText();
		
		if(Output.equals("You selected a range of 365 days.")) {
			System.out.println("Testcase is PASSED");
		}else {
			System.out.println("Testcase is FAILED");
		}
		driver.quit();
		
		
	}

}
