package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyTheOverlapping {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///F:/demo1.html");
		
		  Rectangle usernameRect = driver.findElement(By.name("abhishek")).getRect();
		  Rectangle passwordRect = driver.findElement(By.name("Mohit")).getRect();
		  
		  int usernameEndY = usernameRect.getY()+usernameRect.getHeight();
		  int passwordStartY = passwordRect.getY();
		  
		  if(passwordStartY>=usernameEndY)
		  {
			  System.out.println("pass: text field is not overlapping");
		  }
		  else
			  System.out.println("fail: text field is overlapping");  
		  
		  driver.quit();

	}

}
