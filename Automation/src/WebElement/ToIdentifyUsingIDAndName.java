package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToIdentifyUsingIDAndName {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///F:/demo1.html");
		
		WebElement username = driver.findElement(By.id("abhishek"));
		 WebElement password = driver.findElement(By.name("345"));
		 
		 username.sendKeys("Captain Jack Sparrow");
		 password.sendKeys("Black Pearl");

	}

}
