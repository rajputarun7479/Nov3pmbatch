package actionsclass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformKeyPress {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("\"https://www.selenium.dev/\"");
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//a[@class='nav-link'"));
		
		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL).perform();
		
		for(WebElement link:allLinks) {
			Thread.sleep(1000);
			link.click();
		}
        
		action.keyUp(Keys.CONTROL).perform();
	}

}
