package dropdowns;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToVerifyMultiSelect1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/automation-practice-form");
		
		 WebElement dropdown = driver.findElement(By.id("cars"));
		 
		 Select select = new Select(dropdown);
		 boolean multiple = select.isMultiple();
		 
		 if(multiple) 
		 {
			 System.out.println("Pass: The dropdown is multiselect");
		 }
		 else
			 System.out.println("Fail: The dropdown is single select");

	}

}
