package DAY24;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGParameters {
	
	@Test (priority =1, groups = {"APP"})
	public void Login() {
		System.out.println("This is Login functionality");
		Assert.assertTrue(1==1);
	}
	@Test (priority = 2, groups = {"APP", "PAYMENTS", "PAY"}, dependsOnMethods = {"Login"})
	public void SearchPayment() {
		System.out.println("This is Search Payment functionality");
	}
	@Test (priority = 3, groups = {"APP","PAYMENTS", "PAY"}, dependsOnMethods = {"Login"} )
	public void Paymentstatus() {
		System.out.println("Checking Payment status functionality");
	}
	@Test (priority = 4, groups = {"APP"}, dependsOnMethods = {"Login"})
	public void Logout() {
		System.out.println("This is Logout functionality");
	}

}
