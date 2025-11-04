package DAY12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/watch?v=cGw2ghKh_eU&t=4272s");
		String acttitle = driver.getTitle();
		
		if(acttitle.equals("YouTube")) {
			System.out.println("Testcase passed and the Title is " + acttitle);
		}else {
			System.out.println("Testcase failed and the Actual title is ---->  "+ acttitle);
		}
		Thread.sleep(3000);
		driver.close();
		

	}

}
