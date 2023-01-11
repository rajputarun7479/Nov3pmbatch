package popUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandlePrompt {

	private static final Object alertHeading = null;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://demoqa.com/alerts");
		
		driver.findElement(By.xpath("//div[text()='Alerts']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
	
		js.executeAsyncScript("arguments[0].scrollIntoView(true)", alertHeading);
		
		
		driver.findElement(By.id("promtButton")).click();
		
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Arun");
		alert.accept();
		
		
		
		

	}

}
