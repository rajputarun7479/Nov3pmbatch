package WebElement;



import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToFindTheSpace {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///F:/demo.html");
		
	  Rectangle usernameRect = driver.findElement(By.name("abhishek")).getRect();
	  Rectangle passwordRect = driver.findElement(By.name("Mohit")).getRect();
	  
	  int usernameEndX = usernameRect.getX()+usernameRect.getWidth();
	  int passwordStartX = passwordRect.getX();
	  
	  int space = passwordStartX - usernameEndX;
	  
	  System.out.println("The space between the text field is :"+space);
	  
		
	

	}

}
