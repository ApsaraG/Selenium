package Selenium_Programmes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Example_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. setup the property of chromedriver to open google page through chrome web
		// browser.
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		// 2. Initialize Webdriver object through ChromeDriver class.
		// This line is telling the machine what the name of the driver file is and its
		// location.

		WebDriver browserObject = new ChromeDriver();
		// 3. Open the http://www.google.com/ link using get method.

		browserObject.get("http://www.google.com/");
		// 'get' is a method/function for webdriver
	}

}