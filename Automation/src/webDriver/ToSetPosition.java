package webDriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSetPosition {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	Point pos = new Point(500,500);
	driver.manage().window().setPosition(pos);
	
	Point pos1 = new Point(-250,-250);
	driver.manage().window().setPosition(pos1);
		

	}

}
