package popUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleConfirmationPopUp2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.selenium.dev/documentation/webdriver/interactions/alerts/");
		
		driver.findElement(By.linkText("See a sample prompt")).click();
		Thread.sleep(2000);
		
		//driver.switchTo().alert().accept();
	
		Alert alert = driver.switchTo().alert();
		System.out.println("The alert text is:"+ alert.getText());
		
		alert.accept();
		
	
	}

}
