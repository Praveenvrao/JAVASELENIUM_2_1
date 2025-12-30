package DAY23;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HARDandSOFTAssertions {
	@Test (priority = 1)
	public void Test_HardandSoft() {
		
		String actTString = "Homepage";
		String expString = "Homepage";
		
		System.out.println("PROGRAM STrTED");
		Assert.assertEquals(expString, actTString);
		System.out.println("Program done and assertion applied");
	}
	
	@Test (priority = 2)
	public void Softassertion() {
		System.out.println("Program started");
		SoftAssert softAssert= new SoftAssert();
		softAssert.assertNotEquals(123, 543);
		System.out.println("Program done and soft assertion applied");
		softAssert.assertAll();
	}

}
