package webDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToModifyTheDimension {

	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webDriver.chrome.driver","./Drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			Dimension dim = new Dimension(500, 200);
			Thread.sleep(2000);
			driver.manage().window().setSize(dim);

	}

}
