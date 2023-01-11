package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseClassNameAndLinkText {

	private static final String Thrtead = null;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///F:/demo1.html");
		
		driver.findElement(By.className("")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText(null)).click();

	}

}
