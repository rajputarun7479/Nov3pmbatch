package webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Toverifyingurl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

            String expectedurl = "facebook";
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
	       String actualurl = driver.getCurrentUrl();
		
		if(actualurl.contains(expectedurl)) {
			System.out.println("Pass: The Title has been verified");
		}
		else
			System.out.println("Fail: The Title has not been verified");
		
		    driver.quit();
		}
	
	}


