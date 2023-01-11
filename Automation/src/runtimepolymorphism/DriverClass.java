package runtimepolymorphism;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverClass {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		
		classA.test(new ChromeDriver(), "https://www.facebook.com/", "Facebook");
		classA.test(new EdgeDriver(), "https://www.facebook.com/", "Facebook");

	}

}
