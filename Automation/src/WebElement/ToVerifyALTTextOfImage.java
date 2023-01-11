package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyALTTextOfImage {

	public static void main(String[] args) {
		String ExpectedAltText = "Flipkart";
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		String actualAltText = driver.findElement(By.xpath("//img[@class='_2xm1JU']")).getAttribute("Alt");
		System.out.println(actualAltText);
		
		if(actualAltText.equals(ExpectedAltText))
		{
			System.out.println("Pass: Alt Text is verified");
		}
		else
			System.out.println("Fail: ALt Text is not verified");
		
	}

}
