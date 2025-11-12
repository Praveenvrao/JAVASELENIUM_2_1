package DAY18;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import DAY17.Get_Methods;

public class WindowHandles {

	public static void main(String[] args) throws Exception {
		// window handles
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();
		
		Set<String> Winhandles = driver.getWindowHandles();
		System.out.println(Winhandles);
		List<String> WINHD = new ArrayList<String>(Winhandles);
		System.out.println(WINHD);
		System.out.println(WINHD.get(1));
		System.out.println(WINHD.get(0));
		
		driver.switchTo().window(WINHD.get(1));
		//driver.findElement(By.xpath("//*[text()='Contact Sales']")).click();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		
		//for each loop
		
		Set<String> winhandles2 = driver.getWindowHandles();
		System.out.println(winhandles2);
		for(String objectWINHD2:winhandles2) {
			String PTitle =driver.switchTo().window(objectWINHD2).getTitle();
			if(PTitle.equals("Human Resources Management Software | HRMS | OrangeHRM")) {
				System.out.println(PTitle);
				driver.findElement(By.xpath("//*[text()='Contact Sales']")).click();
				System.out.println(driver.getCurrentUrl());
			}
		}
		
		driver.quit();

	}

}
