package DAY22;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshots {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chatgpt.com/");
		
		//full screenshot
		TakesScreenshot SS = (TakesScreenshot) driver;
		File SourceSS = SS.getScreenshotAs(OutputType.FILE);
		File TargetLocation = new File("C:\\Users\\91766\\eclipse-workspace\\JAVASELENIUM_2_1\\Screenshots\\fullpage.png");
		SourceSS.renameTo(TargetLocation);
				

	}

}
