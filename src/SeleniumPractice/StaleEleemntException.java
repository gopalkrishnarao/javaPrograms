package SeleniumPractice;

	import java.io.IOException;

import org.openqa.selenium.By;

	import org.openqa.selenium.StaleElementReferenceException;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import SeleniumPractice.diverconfig;

	public class StaleEleemntException {
	    public static void main(String[] args) throws IOException {
	    	WebDriver driver =diverconfig.getChromeDriver();

	        // Navigate to a website
	        driver.get("https://example.com");
	        diverconfig.getImplicitTimeOut(10,driver);

	        try {
	            // Locate an element (e.g., by its ID)
	            WebElement exampleElement = driver.findElement(By.partialLinkText("More information..."));
	            Runtime.getRuntime().exec("F://bangalore.sh");
	            // Perform some action on the element
	            exampleElement.click();

	            // The DOM is refreshed or the element is re-rendered
	            // Attempt to interact with the same element again
	            exampleElement.click();
	           // This may throw StaleElementReferenceException

	        } catch (StaleElementReferenceException e) {
	            System.out.println("Caught StaleElementReferenceException. Retrying...");
	            driver.navigate().back();
	            driver.navigate().refresh();
	            // Retry the action by locating the element again
	            WebElement exampleElementAfterRefresh =driver.findElement(By.partialLinkText("More information..."));
	            exampleElementAfterRefresh.click();
	        }

	        // Close the browser
	        driver.quit();
	    }
	}



