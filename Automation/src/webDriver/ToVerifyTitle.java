package webDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyTitle {

	public static void main(String[] args) {
		 String expectedTitle = "Selenium";
	
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("");
		
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		
		if(actualTitle.equals(expectedTitle)  
				{
			System.out.println("Pass: The title is verified");
		}
		else
         System.out.println("Fail: The title is not verified");
	}

}
