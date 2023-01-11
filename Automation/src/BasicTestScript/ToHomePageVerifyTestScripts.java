package BasicTestScript;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import GenericUtility.ExcelUtility;
import GenericUtility.FileUtility;
import POMrepo.HomePage;
import POMrepo.Loginpage;

public class ToHomePageVerifyTestScripts extends BaseClass {
    @Test
	public void ToHomePageVerifyTestScripts() throws IOException {

	  
	    
	  
	   String expectedTitle = eUtils.fetchStringDataExcelSheets("Sheet2",1,0);
	    
	   //testscript
		
		
		
		 
		 WebDriverWait wait = new WebDriverWait(driver, 20);
		 wait.until(ExpectedConditions.titleContains("Enter"));
		 
		 HomePage home = new HomePage(driver);
		 String actualTitle = home.verifyHomePageTitle();
		 
	
		Assert.assertEquals(actualTitle, expectedTitle);
		System.out.println("Pass: The title is verified");
		
		
		
	}

}
