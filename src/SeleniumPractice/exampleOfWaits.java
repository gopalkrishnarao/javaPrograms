package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class exampleOfWaits {
	public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver",
	              "F:\\eclipse_setup_for_seleium\\selenuimproject\\chromedriver");    
	ChromeDriver driver = new ChromeDriver();
	
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

      // Navigate to a website
      driver.get("https://example.com");

      // Find an element with implicit wait
      WebElement exampleElement = driver.findElement(By.partialLinkText("More information..."));

      // Perform some action on the element
      exampleElement.click();

      // Close the browser
      driver.quit();
	}
	}
