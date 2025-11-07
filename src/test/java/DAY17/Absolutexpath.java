package DAY17;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolutexpath {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/ytd-app/div[1]/div[2]/ytd-masthead/div[4]/div[3]/div[2]/ytd-button-renderer/yt-button-shape/a/yt-touch-feedback-shape/div[2]")).click();
		Thread.sleep(3000);
		driver.get("https://www.youtube.com/");
		WebElement Appicon= driver.findElement(By.xpath("/html[1]/body[1]/ytd-app[1]/div[1]/div[2]/ytd-masthead[1]/div[4]/div[1]/ytd-topbar-logo-renderer[1]/a[1]/div[1]/ytd-logo[1]/yt-icon[1]"));
		Thread.sleep(4000);
		System.out.println(Appicon);
		System.out.println(Appicon.getText());
		driver.close();

	}

}
