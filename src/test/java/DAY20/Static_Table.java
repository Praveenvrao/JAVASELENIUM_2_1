package DAY20;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Static_Table {

	public static void main(String[] args) {
		// static table
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com/");
		int Colsize = driver.findElements(By.xpath("//table[@name = 'BookTable']//tr[1]//th")).size();
//		Writing headers of table
		for(int h1 =1;h1<=Colsize;h1++) {
		String Headertext = driver.findElement(By.xpath("//table[@name = 'BookTable']//tr[1]//th["+h1+"]")).getText();
		System.out.print(Headertext + "\t");

		}
		

}
}

