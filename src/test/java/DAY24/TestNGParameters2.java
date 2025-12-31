package DAY24;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGParameters2 {
	
	@Test (priority =1 , groups = {"APP"})
	void LoginApp(){
		System.out.println("This is ADMIN Login");
		Assert.assertTrue(true);
	}
	@Test(priority =2, dependsOnMethods = {"LoginApp"}, groups = {"APP", "ADMIN", "OCA"})
	void SearchAc() {
		System.out.println("This is ADMIN Search");
	}
	@Test (priority =3, dependsOnMethods = {"LoginApp"}, groups = {"APP", "ADMIN", "OCA"})
	void SearchACdetails() {
		System.out.println("This is method for searching account details");
	}
	@Test (priority = 4, dependsOnMethods = {"LoginApp"}, groups = {"APP"})
	void LogoutAdmin() {
		System.out.println("This is ADMIN Logout");
	}
	
	

}
