package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Errorverify {

	public static void main(String[] args) {
		String expectedErrorMsg = "Username or Password is invalid";
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.xpath("//div[text()='Login '")).click();
		String actualErrorMsg = driver.findElement(By.className("errormsg")).getText();
		
		if(actualErrorMsg.contains(expectedErrorMsg)) {
			System.out.println("Pass: The error Msg has been verified");
			
		}
		else
			System.out.println("Fail: The error message has not be verified");
		
		driver.quit();
		

	}

}
