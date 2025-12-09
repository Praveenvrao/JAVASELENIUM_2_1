package DAY21;

import java.security.PublicKey;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker2 {
	
	static void SelectFuturedate(WebDriver driver, String monthString, String yearString, String dateString) {
		while(true) {
			String CurrentMonth = driver.findElement(By.xpath("//*[@class='ui-datepicker-month']")).getText();
			String CurrentYear = driver.findElement(By.xpath("//*[@class='ui-datepicker-year']")).getText();
			
			if(CurrentMonth.equals(monthString) && CurrentYear.equals(yearString)) {
				break;
			}
			driver.findElement(By.xpath("//*[@class='ui-icon ui-icon-circle-triangle-e']")).click();
	
			}
		
		List<WebElement> dates = driver.findElements(By.xpath("//*[@class='ui-state-default']"));
		for(int p =1; p<=dates.size(); p++) {
			if(dates.get(p).getText().equals(dateString)) {
				dates.get(p).click();
				break;
			}
		}
	}
	
	static void SelectPreviousdate(WebDriver driver, String monthString, String yearString, String dateString) {
		while(true) {
			String CurrentMonth = driver.findElement(By.xpath("//*[@class='ui-datepicker-month']")).getText();
			String CurrentYear = driver.findElement(By.xpath("//*[@class='ui-datepicker-year']")).getText();
			
			if(CurrentMonth.equals(monthString) && CurrentYear.equals(yearString)) {
				break;
			}
			driver.findElement(By.xpath("//*[@class='ui-icon ui-icon-circle-triangle-w']")).click();
	
			}
		
		List<WebElement> dates = driver.findElements(By.xpath("//*[@class='ui-state-default']"));
		for(int p =1; p<=dates.size(); p++) {
			if(dates.get(p).getText().equals(dateString)) {
				dates.get(p).click();
				break;
			}
		}
	}

	public static void main(String[] args) {
		// Datepicker by selecting from Calendar
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/");
		driver.findElement(By.xpath("//a[normalize-space()='Datepicker']")).click();
		WebElement dateinput = driver.findElement(By.xpath("//*[@class='demo-frame']"));
		driver.switchTo().frame((dateinput));
		String yearString = "2026";
		String monthString = "August";
		String dateString = "22";
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
//		SelectFuturedate(driver, "May", "2027", "28");
		SelectPreviousdate(driver, "July", "2022", "13");
		driver.quit();

}
}

