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
		System.out.println(Colsize);
//		Writing headers of table
		for(int h1 =1;h1<=Colsize;h1++) {
		String Headertext = driver.findElement(By.xpath("//table[@name = 'BookTable']//tr[1]//th["+h1+"]")).getText();
		System.out.print(Headertext + "\t");

		}
		System.out.println();
//		writing whole table data
		
		int rows = driver.findElements(By.xpath("//table[@name = 'BookTable']//tr")).size();
		System.out.println("Size of the rows -> "+ rows);
		
		for(int r = 2; r<=rows;r++) {
			for(int c=1;c<=Colsize;c++) {
				String Value = driver.findElement(By.xpath("//table[@name = 'BookTable']//tr["+r+"]//td["+c+"]")).getText();
				System.out.print(Value + "\t");
			}
			System.out.println();
		}
		
		for(int r =2;r<=rows;r++) {
			String Lvalue = driver.findElement(By.xpath("//table[@name = 'BookTable']//tr["+r+"]//td[3]")).getText();
			if(Lvalue.equals("Selenium")) {
				String Cost = driver.findElement(By.xpath("//table[@name = 'BookTable']//tr["+r+"]//td[4]")).getText();
				System.out.print(Lvalue +" -> "+ Cost + "\t ");
			}
		}
		driver.quit();

}
}

