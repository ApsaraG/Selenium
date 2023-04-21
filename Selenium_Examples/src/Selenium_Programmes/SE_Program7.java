package Selenium_Programmes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SE_Program7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// How to use LinkText in website using selenium Webdriver
		
		System.setProperty("webdriver.chrome.driver", "C://Program Files//chromedriver.exe"); // Name and Location of webdriver
		WebDriver browserObject = new ChromeDriver(); // Object creation
		browserObject.get("https://www.google.com/"); //Command
		
		WebElement blogLink = browserObject.findElement(By.linkText("Gmail"));
		// This will ask webdriver to check if the text Gmail is a link or not
		
		if (blogLink.isDisplayed()) 
		{System.out.println("Blog Link is displayed");}
		// If it is a link, print the above
		
		 else {System.out.println("Unable to find Gmail");}
		// If it is not a link, print the above instead
		
		
		
	}
}
