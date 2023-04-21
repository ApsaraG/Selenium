package Selenium_Programmes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SE_Program8 {

	private static WebElement Email;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// How to automate Login Webpage using Selenium Webdriver?
		
		System.setProperty("webdriver.chrome.driver", "C://Program Files//chromedriver.exe");
		WebDriver browserObject = new ChromeDriver();
		browserObject.get("https://admin-demo.nopcommerce.com/login");
		
		WebElement email = browserObject.findElement(By.name("Email"));
		// Variable 'email' has been given the value 'find element with the name Email'
		
		email.clear();
		// Command to clear what is inside variable email
		
		email.sendKeys("admin@yourstore.com");
		// command to type in above email address in variable email.
		
		WebElement password = browserObject.findElement(By.name("Password"));
		// Variable 'password' has been given the value 'go and find element with className 'Password'
		
		password.clear();
		// Command to clear what is inside variable password
		
		password.sendKeys("admin");
		// command to type in above email in variable password.
		
		browserObject.findElement(By.className("login-button")).submit();
		// Command to click log in button
		
		Thread.sleep(2000);
		// Command to hold the website for 2000 mili seconds
		
		browserObject.close();
		// Command to close the browser
		
	}

}
