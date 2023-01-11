package webDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchToWindow1 {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.actitime.com/login.do");
			
			driver.findElement(By.linkText("actiTIME Inc.")).click();
			
			Set<String> allWindowIDs = driver.getWindowHandles();
			for(String id:allWindowIDs) {
				driver.switchTo().window(id);;
				Object parentwindowId = null;
				if(!id.equals(parentwindowId)) {
					Thread.sleep(20000);
					driver.findElement(By.linkText("Try Free")).click();
					break;
					

	}

}
			driver.switchTo()
		}
}
