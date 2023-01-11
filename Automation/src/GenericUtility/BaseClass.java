package GenericUtility;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import POMrepo.HomePage;
import POMrepo.Loginpage;

public class BaseClass {
public	WebDriver driver;
public	FileUtility fUtils =new FileUtility();
public ExcelUtility eUtils = new ExcelUtility();
      
	@BeforeSuite
	public void bsConfig() {
		System.out.println("Data base connection has been established");
	}
	
	@BeforeClass
	public void bcConfig() throws IOException {
		 FileUtility fUtils = new FileUtility();
		 String url = fUtils.fetchDataFromPropertyFile("url");
		    
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
		
		System.out.println("Browser has been launched");
		System.out.println("Navigated to the url");
	}
	
	@BeforeMethod
	public void bmConfig() throws IOException {
		 
	    String username = fUtils.fetchDataFromPropertyFile("username");
	    String password = fUtils.fetchDataFromPropertyFile("password");
		
		 Loginpage login = new Loginpage(driver);
		 login.loginAction(username, password);
		 
		System.out.println("Logged in to applilcation");
	}
	
	@AfterMethod
	public void amConfig() {
		 HomePage home = new HomePage(driver);
		 home.logoutAction();
		System.out.println("Logged out from the application");
	}
	
	@AfterClass
	public void acConfig() {
		driver.quit();
		System.out.println("Browser has been closed");
	}
	
	@AfterSuite
	public void asConfig() {
		System.out.println("Data base connection has been closed");
	}
}
