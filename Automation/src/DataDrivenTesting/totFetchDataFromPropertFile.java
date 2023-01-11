package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class totFetchDataFromPropertFile {

	public static void main(String[] args) throws IOException {
	FileInputStream fis = new FileInputStream("./testData/propertdata2.properties");
	
	Properties property = new Properties();
	// we  are fetching the value using key.
	property.load(fis);
	
	String url = property.getProperty("url");
	System.out.println("The url is:"+url);
	
	String username = property.getProperty("username");
	System.out.println("The username is:"+username);
	
	String password = property.getProperty("password");
	System.out.println("The username is:"+password);
	
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get(url);
	
	driver.findElement(By.id("username")).sendKeys(username);
	driver.findElement(By.name("pwd")).sendKeys(password);
	driver.findElement(By.xpath("//div[text()='Login']")).click();
	
	

	}

}
