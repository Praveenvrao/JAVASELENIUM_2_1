package DAY23;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testcase2 {
  
	WebDriver driver;
  @Test (priority = 0)
  public void OpentheApp() throws Exception {
	  
	  FileInputStream FI1 = new FileInputStream(System.getProperty("user.dir")+ "\\TESTDATA\\Test.properties");
	  Properties properties = new Properties();
	  properties.load(FI1);
	  String AppURL = properties.getProperty("URL");
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.manage().window().maximize();
	  driver.get(AppURL);
  }
  @Test (priority = 1)
  public void Entercreds() {
	  driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
  }
  @Test (priority = 2)
  public void LoginApp() throws Exception {
	  driver.findElement(By.xpath("//*[text() =' Login ']")).click();
  }
  @Test (priority = 3)
  public void Homepage() throws InterruptedException {
	  String Exp_Title = "OrangeHRM";
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  String Act_title = driver.getTitle();
	  System.out.println(Act_title);
	  if(Act_title.equals(Exp_Title)) {
		  System.out.println("Homepage Opened  ---> Testcase PASSED");
	  }else {
		System.out.println("Unable to Open Homepage ---> Testcase FAILED");
	}
	  driver.quit();
	  
  }
  
  
}
