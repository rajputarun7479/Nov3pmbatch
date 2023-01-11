package webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class verifying {

	public static void main(String[] args) {
		String expectedTitle ="kvhjkm";
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
		String actualTittle=driver.getTitle();
		Object actualTitle = null;
		System.out.println("The actual title: "+actualTitle);
		System.out.println("The expected title: "+expectedTitle);
		
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Pass: The Title has been verified");
		}
		else
			System.out.println("Fail: The Title has not been verified");
		}
	}

