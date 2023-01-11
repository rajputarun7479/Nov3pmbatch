package SelfPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToNavigateToTheUrl {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://en.wikipedia.org/wiki/India");
		driver.manage().window().maximize();
		
		System.out.println("currenturl");
		
		System.out.println("title");
		
		System.out.println(" pagesource");
        
        driver.navigate().to("https://www.google.com/");
        driver.close();
	}

}
