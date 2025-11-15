package DAY19;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplecheckbox2 {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		List<WebElement> Days= driver.findElements(By.xpath("//input[@class='form-check-input' and @type ='checkbox']"));
		
		// Checking selected Last 3
		/*for (int i = 4; i < Days.size(); i++) {
			Days.get(i).click();
			String Dayname = Days.get(i).getTagName();
			System.out.println(Dayname.getClass());
		}
		*/
		//Checking Just odd number days
		
		for (int i = 0; i<Days.size(); i++) {
			if(i%2 == 0) {
				Days.get(i).click();
			}
		}
		Thread.sleep(5000);
		//Now unselect the selected boxes and do vice versa
		for (int j =0;j<Days.size();j++) {
			boolean check1 = Days.get(j).isSelected();
			if (check1 == false) {
				Days.get(j).click();
			} 
			else if(check1 == true) {
				Days.get(j).click();
			}
		}
		driver.quit();

	}

}
