package Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ToWaitForButtonToBeEnabled {

	private static final String WebDriverWait = null;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	  Timeouts time = driver.manage().timeouts();
	  time.implicitlyWait(20,TimeUnit.SECONDS);
	  driver.get("https://github.com/signup?ref_cta=Sign+up&ref_loc=header+logged+out&ref_page=%2F&source=header-home");
	  driver.findElement(By.id("email")).sendKeys("akashDeb@gmail.com");
	  
	 org.openqa.selenium.support.ui.WebDriverWait wait;
	WebElement button = driver.findElement(By.xpath(//button[contains(text(), 'Continue']));
	
			 wait=new org.openqa.selenium.support.ui.WebDriverWait(driver, 20);
	  button.click();
	  
	  

	}

}
