package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class softAssert {
	
@Test
public void demo() {
	 boolean expectedData = true;
	 boolean actualData = false;
	 
	 org.testng = new org.testng.asserts.SoftAssert();
	 s.assertEquals(actualData, expectedData);
	 System.out.println("pass");
	 s.assertAll();
}

}
