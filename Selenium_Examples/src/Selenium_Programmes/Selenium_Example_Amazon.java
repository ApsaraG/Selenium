package Selenium_Programmes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Example_Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 1. setup the property of chromedriver to open google page through chrome web browser.
		  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe" );
		// 2. Initialize Webdriver object through ChromeDriver class.
	        WebDriver browserObject = new ChromeDriver(); // Creating a new object named browser object
		// 3. Open the http://www.google.com/ link using get method.
	        browserObject.get("http://www.amazon.com/"); // Get will open the website
	        browserObject.close(); // Close will close the website
	}

}
