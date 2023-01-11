package webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetWindowId {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		
		String windowID = driver.getWindowHandle();
		System.out.println(windowID);
		
		WebDriver driver1=new ChromeDriver();
		
		String windowID1 = driver.getWindowHandle();
		System.out.println(windowID1);
		
		
		
	}

	}

