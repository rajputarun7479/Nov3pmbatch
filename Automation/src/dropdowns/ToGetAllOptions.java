package dropdowns;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToGetAllOptions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/automation-practice-form");
		 
		WebElement dropdown = driver.findElement(By.id("oldSelectMenu"));
		Select select = new Select(dropdown);
		List<WebElement> allOptions = select.getOptions();
		
		for(WebElement option:allOptions) {
			System.out.println(option.getText());
		}
		

	}

}
