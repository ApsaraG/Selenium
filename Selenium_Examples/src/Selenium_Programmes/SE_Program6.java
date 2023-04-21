package Selenium_Programmes;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SE_Program6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//Write a code for checking social links at itlarn360.com (Check various social media links are working)
		
		System.setProperty("webdriver.chrome.driver", "C://Program Files//chromedriver.exe");
		WebDriver browserObject = new ChromeDriver();
		browserObject.get("https://www.itlearn360.com/");
		 
		browserObject.findElement(By.className("fa-facebook")).click();
		// This will click Facebook icon
		
		Thread.sleep(2000);
		
		browserObject.navigate().back();
		browserObject.findElement(By.className("fa-twitter")).click();
		// This will take website back to home page and then will click twitter icon
		
		Thread.sleep(2000);
		
		browserObject.navigate().back();
		browserObject.findElement(By.className("fa-instagram")).click();
		// This will take website back to home page and then will click instagram icon
		
		Thread.sleep(2000);
		
		browserObject.navigate().back();
		browserObject.findElement(By.className("fa-youtube")).click();
		// This will take website back to home page and then will click youtube icon
		
		Thread.sleep(2000);
		
		browserObject.navigate().back();
		browserObject.findElement(By.className("fa-linkedin")).click();
		// This will take website back to home page and then will click linked In icon
		
		Thread.sleep(2000);
		
		browserObject.navigate().back();
		// This will take website back to home page
		
		Thread.sleep(2000);
		
		browserObject.close();
		// This will close the web driver
		
	}

}
