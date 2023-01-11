package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyTheDimensions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///F:/demo1.html");
		
		Dimension udim = driver.findElement(By.id("123")).getSize();
		int uheight = udim.getHeight();
		int uwidth = udim.getWidth();
		
		System.out.println(uheight+" "+uwidth);
		
		Dimension pdim = driver.findElement(By.id("345")).getSize();
		int pheight = pdim.getHeight();
		int pwidth = pdim.getWidth();
		System.out.println(pheight+" "+pwidth);
		
		if(uheight == pheight && uwidth == pwidth) {
			System.out.println();
		}
		
    

	}

}
