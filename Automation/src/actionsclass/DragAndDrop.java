package actionsclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("");
		
		Object frame = driver.findElement(By.xpath());
		driver.switchTo().frame((int) frame);
		
		Object source = driver.findElement(By.xpath());
		Object destination = driver.findElement(By,id());
		
		Actions action = new Actions(driver);
		action.dragAndDrop(source, destination).perform();
		

	}

}
