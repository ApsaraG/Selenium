package Selenium_Programmes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SE_Program2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Write a Selenium Program to open and close amazon.com. Ensure the website opens for 3000 miliseconds 

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		// This is the name and location of the webdriver

		WebDriver browserObject = new ChromeDriver();
		// This initializes webdriver object from chromedriver class

		browserObject.get("http://www.amazon.com/");
		// .get command will go and get the object

		Thread.sleep(3000); 
		// This will hold the object for 3000 milli seconds
		
		browserObject.close();
		// .close command will close the object
		
	}

}
