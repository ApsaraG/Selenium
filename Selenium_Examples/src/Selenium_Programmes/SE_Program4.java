package Selenium_Programmes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SE_Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//How to automate Google search in Selenium webdriver

		System.setProperty("webdriver.chrome.driver", "C://Program Files//chromedriver.exe");
		WebDriver browserObject = new ChromeDriver();
		browserObject.get("https://www.google.com/");
		
		browserObject.findElement(By.name("q")).sendKeys("Selenium Python");
		// This will find the element labeled 'q' on the website and send keys 'Selenium Python' into the empty field
		
		browserObject.findElement(By.name("btnK")).submit();
		// This will find element labeled 'btnK' and 'submit' command will click it.
		
		
		
		
		
		
		
		
		
		
	}

}
