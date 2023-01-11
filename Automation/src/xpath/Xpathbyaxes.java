package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathbyaxes {

	public static void main(String[] args) {
	

	
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
String productName = "APPLE iPhone 12 mini (Black, 64 GB)";
String productPrice = "₹37,999";
  WebDriver driver=new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("https://www.flipkart.com/search?q=apple+iphone+12+mini&sid=tyy%2C4io&as=on&as-show=on&otracker=AS_QueryStore_OrganicAutoSuggest_1_18_na_na_na&otracker1=AS_QueryStore_OrganicAutoSuggest_1_18_na_na_na&as-pos=1&as-type=RECENT&suggestionId=apple+iphone+12+mini%7CMobiles&requestId=62de31c1-6889-406c-bc5d-afa058318866&as-searchtext=apple%20iphone%2012%20mini");

    String price= driver.findElement(By.xpath("//div[text()='"+productName+"']/ancestor::div[@class='_3pLy-c row']/descendant::div[text()='"+productPrice+"']")).getText();
   
    System.out.println("price");












}
}
