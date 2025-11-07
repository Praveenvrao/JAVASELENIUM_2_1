package DAY17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelector_2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		
		//Tagname.classname [name ="attribute"]
		driver.findElement(By.cssSelector("input.ytSearchboxComponentInput[name='search_query']")).sendKeys("Cooking videos");
		driver.findElement(By.cssSelector("button.ytSearchboxComponentSearchButton[title='Search']")).click();
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.close();

	}

}
