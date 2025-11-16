package DAY20;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FRAMES_1 {

	public static void main(String[] args) {
		// Switching Frames
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/");
		driver.findElement(By.xpath("//*[@id='iFrame']")).click();
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@name='globalSqa']"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//img[@alt='Selenium Online Training']")).click();
		//System.out.println(frame1.getText());
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//*[@id='Open New Window']")).click();
		driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//a[@class='button e.g. button_hilite button_pale small_button'][normalize-space()='Click Here']")).click();
		
		Set<String> WinHD= driver.getWindowHandles();
		
		System.out.println(WinHD);
		for(String WH1 : WinHD) {
			String Titles = driver.switchTo().window(WH1).getTitle();
			System.out.println(Titles);
		}
		driver.quit();
		

	}

}
