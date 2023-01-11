package BasicTestScript;

import org.testng.annotations.Test;

import GenericUtility.BaseClass;

public class BaseScript2 extends BaseClass{
	
	@Test(priority = 1)
	public void verifyHomePageTest() {
		System.out.println("Homepage has been verified");
	}
	

}
