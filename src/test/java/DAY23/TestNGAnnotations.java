package DAY23;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {
	
	@Test
	public void Testmethod1(){
		System.out.println("This is Method1 Execution");
	}
	@Test
	public void TestMethod2() {
		System.out.println("This is Method2 execution");
	}
	@BeforeMethod
	public void BM() {
		System.out.println("This is Before METHOD");
	}
	@AfterMethod
	public void AM() {
		System.out.println("This is After METHOD");
	}
	@BeforeClass
	public void BC() {
		System.out.println("This is Before CLASS");
	}
	@AfterClass
	public void AC() {
		System.out.println("This is After CLASS");
	}
	@BeforeTest
	public void BT() {
		System.out.println("This is Before TEST Execution");
	}
	@AfterTest
	public void AT() {
		System.out.println("This is After TEST Execution");
	}
	@BeforeSuite
	public void BS() {
		System.out.println("This is Before TEST SUITE Execution");
	}
	@AfterSuite
	public void AS() {
		System.out.println("This is After TEST SUITE Execution");
	}

}
