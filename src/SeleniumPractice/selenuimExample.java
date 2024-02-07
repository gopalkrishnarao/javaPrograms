package SeleniumPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenuimExample {
	public static void main(String[] args) {
//		  System.setProperty("webdriver.chrome.driver",
//	              "F:\\chromedriver.exe");    
//	ChromeDriver driver = new ChromeDriver();
    // Set the path of the ChromeDriver executable
    System.setProperty("webdriver.chrome.driver", "F:\\eclipse_setup_for_seleium\\selenuimproject\\chromedriver\\chromedriver.exe");

    // Create a new instance of the ChromeDriver
    ChromeDriver driver = new ChromeDriver();




			//1.write a pgm top show google and validate title and url
		  

	    
	  //Alerts  
	    driver.get("http://the-internet.herokuapp.com/javascript_alerts");
	    
		//1. Alert popups
	    driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/ul[1]/li[1]/button[1]")).click();
	    try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    Alert alert = driver.switchTo().alert(); // switch to alert
	    String alertMessage= driver.switchTo().alert().getText(); // capture alert message
	    System.out.println(alertMessage); // Print Alert Message
	    alert.accept();
	    try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	//    
	//    
	//    
//	    //2.confirmation poup
	//  driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/ul[1]/li[2]/button[1]")).click();
	//  alert = driver.switchTo().alert(); // switch to alert
	//  alertMessage= driver.switchTo().alert().getText(); // capture alert message
	//  System.out.println(alertMessage); // Print Alert Message
	//  Thread.sleep(5000);
	//  alert.accept();
	//  
	//  //try reject
	//  Thread.sleep(5000);
	//  driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/ul[1]/li[2]/button[1]")).click();
	//  alert = driver.switchTo().alert();
	//  Thread.sleep(5000);
	//  alert.dismiss();
	//  Thread.sleep(5000);
//	    driver.quit();
	// 
	    
	   // Hidden division popup
	   
//	    driver.get("https://chercher.tech/practice/hidden-division-popup");
//	    Thread.sleep(5000);
//	  	driver.findElement(By.className("cd-popup-trigger")).click();
//	  	 Thread.sleep(5000);
//		// send text to Name field on overlay
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hidden Division Text");
//		 Thread.sleep(5000);
//		driver.quit();
	//	
	    
	    //File upload popup
//	    driver.get("http://www.2shared.com");
//	    Thread.sleep(5000);
//	    driver.findElement(By.id("upfield")).sendKeys("D:\\vijay\\raghu.txt");
//	    Thread.sleep(5000);
	//    
	//   // example2 
//	    driver.get("D:\\oraclenewlaptopdata\\eclipse_setup_for_seleium\\seleniumProjectAutoTraige\\src\\seleniumProjectAutoTraige\\page2.html");
//	    Thread.sleep(5000);
//	    driver.findElement(By.id("fileToUpload")).sendKeys("D:\\vijay\\raghu.txt");
//	    Thread.sleep(5000);
//	    //driver.quit();
	    
	    
	   // File download popup
//	    String fileDownloadPath = "D:\\vijay";
//	    Map<String, Object> prefsMap = new HashMap<String, Object>();
//		  prefsMap.put("profile.default_content_settings.popups", 0);
//		  prefsMap.put("download.default_directory", fileDownloadPath);
//		  
//		  ChromeOptions option = new ChromeOptions();
//		  option.setExperimentalOption("prefs", prefsMap);
//		  option.addArguments("--test-type");
//		  option.addArguments("--disable-extensions");
//		  
//		  driver  = new ChromeDriver(option);
//		  driver.get("https://www.seleniumhq.org/download/");
//		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		  driver.manage().window().maximize();
//		  Thread.sleep(2000);
//		  driver.findElement(By.linkText("64 bit Windows IE")).click();
//		  Thread.sleep(2000);
//		  System.out.println("Downloaded");
	    
	    
	//    
//		ChromeOptions options = new ChromeOptions();
//		Map<String, Object> prefs = new HashMap<String, Object>();
//		prefs.put("download.prompt_for_download", false);
//		options.setExperimentalOption("prefs", prefs);
	//	
//		driver = new ChromeDriver(options);
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//		driver.get("https://chromedriver.storage.googleapis.com/index.html?path=79.0.3945.36/");
//		Thread.sleep(2000);
//		WebElement btnDownload = driver.findElement(By.xpath("//a[text()='chromedriver_win32.zip']"));
//		btnDownload.click();
	//	
//		Thread.sleep(7000);
	    
	    
	    
		
		

		
		
	}
	}

