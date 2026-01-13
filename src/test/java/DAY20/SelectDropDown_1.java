package DAY20;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown_1 {

	public static void main(String[] args) {
		// Select type dropdown
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/dropdown");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		Select dropdown
		WebElement dropdownEle = driver.findElement(By.xpath("//select[@id='dropdown']"));
		Select Sdropdown = new Select(dropdownEle);
		
//		Select by using index
		Sdropdown.selectByIndex(1);
		
		System.out.println(Sdropdown.getOptions());		
		List<WebElement> OP1 = Sdropdown.getOptions();
		
//		for each loop - printing values
		for(WebElement options1:OP1 ) {
			String Text1 = options1.getText();
			System.out.println(Text1);
			if(Text1.equals("Option 1")) {
				dropdownEle.click();
			}
		}
		
//		Select other dropdown by using Value
		WebElement DD2 = driver.findElement(By.xpath("//select[@id='elementsPerPageSelect']"));
		Select SelectDD2 = new Select(DD2);
		SelectDD2.selectByValue("50");
		
//		Select another dropdown with Visible text
		WebElement DD3 = driver.findElement(By.xpath("//select[@id='country']"));
		Select SelectDD3 = new Select(DD3);
		SelectDD3.selectByVisibleText("Christmas Island");
		
		List<WebElement> DD3values = SelectDD3.getOptions();
		System.out.println(DD3values.size());
//		System.out.println(DD3values);
		
		for (int i=0;i< DD3values.size();i++) {
			System.out.println(i +" Number country name is -> "+ DD3values.get(i).getText());
		}
		driver.quit();
		

	}

}
