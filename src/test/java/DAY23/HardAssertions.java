package DAY23;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class HardAssertions {
	@Test
	public void Test_Hardassertions() {
		
		String ActT = "Homepage";
		String ExpT = "Homepage";
		
//		if (ActT.equals(ExpT)) {
//			System.out.println("TESTCASE PASSED");
//		} else {
//			System.out.println("TESTCASE FAILED");
//		}
		
		Assert.assertEquals(ExpT, ActT);
	}

}
