package webDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToLaunchEmptyChromeBrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		new ChromeDriver();
		

	}

}
