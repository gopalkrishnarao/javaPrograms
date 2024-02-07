package SeleniumPractice;

import org.openqa.selenium.chrome.ChromeDriver;

public class asdsa {
	public static void main(String[] args) {
		System.out.println("hi");
		  System.setProperty("webdriver.chrome.driver",
	              "F:\\chromedriver.exe");    
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://google.co.in");
	System.out.println("hello");

	}

}
