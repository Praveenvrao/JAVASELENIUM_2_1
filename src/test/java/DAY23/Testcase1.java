package DAY23;

import org.testng.annotations.Test;

public class Testcase1 {
	
	@Test (priority = 0)
	void Open () {
		System.out.println("App Open step");
	}
	
	@Test(priority = 1)
	void LoginApp() {
		System.out.println("App login step");
	}
	
	@Test(priority = 3)
	void LogoutApp() {
		System.out.println("App Logout step");
	}

}
