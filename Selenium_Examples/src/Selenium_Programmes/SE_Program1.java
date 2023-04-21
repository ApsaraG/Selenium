package Selenium_Programmes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SE_Program1 {

	private static final String Select = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Howto run first Selenium Program (Open google.com)
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		// This is the name and location of web driver
		
		
		WebDriver browserObject = new ChromeDriver();
		//Initialize Webdriver object from Chromedriver class
		
		browserObject.get("http://www.google.com/");
		//get command will go an get the website
		
		
	}

}
