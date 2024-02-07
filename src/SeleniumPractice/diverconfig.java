package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;

public class diverconfig {
	public static ChromeDriver getChromeDriver() {
    // Set the path of the ChromeDriver executable
    System.setProperty("webdriver.chrome.driver", "F:\\eclipse_setup_for_seleium\\selenuimproject\\chromedriver\\chromedriver.exe");

    // Create a new instance of the ChromeDriver
    return  new ChromeDriver();
    
	}
	public static Timeouts getImplicitTimeOut(long time,WebDriver driver ) {

	    return driver.manage().timeouts().implicitlyWait(time,TimeUnit.SECONDS);
	    	
		}
	
}
