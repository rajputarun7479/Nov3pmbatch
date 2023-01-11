package webDriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetPosition {

	public static void main(String[] args) {
		System.setProperty("webDriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		Point pos = driver.manage().window().getPosition();
		System.out.println(pos);
		
		int StartX = pos.getX();
		int StartY = pos.getY();
		
		System.out.println("the start x is :"+StartX);
		System.out.println("the start y is :"+StartY);
	}

}
