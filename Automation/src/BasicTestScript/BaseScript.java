package BasicTestScript;

import org.testng.annotations.Test;

import GenericUtility.BaseClass;

public class BaseScript extends BaseClass {
	
	@Test(priority = 1)
	public void verifyHomePageTest() {
		System.out.println("Homepage has been verified");
	}
    
	@Test(priority = 2)
	public void verifyCustomer() {
		System.out.println("Customer has been verified");
	}
}
