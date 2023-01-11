package SelfPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetSizeMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(2000);
		driver.get("https://www.whatsapp.com/");
		
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		driver.get("https://www.selenium.dev/");
		
		Thread.sleep(2000);
		driver.get("https://github.com/");
		
		Thread.sleep(2000);
		driver.get("https://www.youtube.com/");
		
		Thread.sleep(2000);
		driver.get("https://www.wikipedia.org/");
		
		Thread.sleep(2000);
		driver.get("https://www.actitime.com/");
		
	}

}

