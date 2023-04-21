package Selenium_Programmes;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class open_QA {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
	    // 2. Initialize Webdriver object through ChromeDriver class.
	  ChromeDriver  browserObject = new ChromeDriver();
	    // 3. Open form page of http://www.training.qaonlinetraining.com/testPage.php
	    browserObject.get("https://www.google.com/");
	    
	    browserObject.findElement(By.id("input")).sendKeys("Selenium Python");
	    
	    browserObject.findElement(By.name("btnK")).submit();



	}

}
