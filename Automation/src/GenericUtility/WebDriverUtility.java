package GenericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {

  public void toWaitForTitle(RemoteWebDriver driver, String title) {
	  
	 WebDriverWait wait = new WebDriverWait(driver, 20);
	 wait.until(ExpectedConditions.titleContains(title));
	 
	}
  
  public void toWaitForElementToBeClickable(WebDriver driver, WebElement element ) {
	  
	  WebDriverWait wait = new WebDriverWait(driver, 20);
	  wait.until(ExpectedConditions.elementToBeClickable(element));
  }

}
