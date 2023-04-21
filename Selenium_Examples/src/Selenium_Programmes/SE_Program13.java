package Selenium_Programmes;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SE_Program13 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// How to handle the alert in webpage using selenium webdriver
		// Introduction to 'Alert' Class and 'switchTo' method
		
		System.setProperty("webdriver.chrome.driver", "C://Program Files//chromedriver.exe");
		WebDriver browserObject = new ChromeDriver();
		browserObject.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		browserObject.findElement(By.name("proceed")).click();
		// This will find element called proceed and will click it
		
		Alert alert = browserObject.switchTo().alert();
		// Alert class has been summoned and variable alert has been assigned the value/formula to 'switchTo'
		
		Thread.sleep(6000);
		// Holding the screen for 6K mili seconds
		
		alert.accept();
		// command variable alert to accept it 
	}

}
