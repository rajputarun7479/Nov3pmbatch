package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class keyBoardSimulation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoime.com/login.do");
		
		WebElement usernameTextField = driver.findElement(By.id("username"));
		WebElement passwordTextField = driver.findElement(By.name("pwd"));
		
		usernameTextField.sendKeys("trainee");
		Thread.sleep(2000);
		usernameTextField.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(2000);
		usernameTextField.sendKeys(Keys.CONTROL, "c");
		Thread.sleep(2000);
		passwordTextField.sendKeys(Keys.CONTROL, "v");
		Thread.sleep(2000);
		passwordTextField.sendKeys(Keys.ENTER);
		
		// how to perform keyboard action without keyboard

}
}
