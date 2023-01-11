package webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyIds {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		String windowForGoogle = driver.getWindowHandle();
		
		driver.navigate().to("https://www.facebook.com/");
        String windowForFacebook = driver.getWindowHandle();
        
        System.out.println("window id for google:"+ windowForGoogle);
        System.out.println("window id for facebook:"+ windowForFacebook);
	}

}
