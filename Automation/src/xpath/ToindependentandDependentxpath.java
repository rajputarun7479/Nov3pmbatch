package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToindependentandDependentxpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/search?q=iphone&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=off&as=off&as-pos=1&as-type=HISTORY");
  // this xpath was used previously but now a days it is not used.
   String price = driver.findElement(By.xpath("//div[.='APPLE iPhone 12 mini (Black, 64 GB)']/../..//div[text()='₹37,999']")).getText();
  System.out.println(price);
	}
}