package Selenium_Programmes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SE_program11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// How to automate checkbox of a webpage using Selenium Webdriver
		
		System.setProperty("webdriver.chrome.driver","C://Program Files//chromedriver.exe");
		WebDriver browserObject = new ChromeDriver();
		browserObject.get("http://training.qaonlinetraining.com/testPage.php");	
		
		WebElement checkboxBoat = browserObject.findElement(By.xpath("//input[@value='male']"));
		WebElement checkboxHorse = browserObject.findElement(By.xpath("//input[@value='horse']"));
		// Create variables checkboxBoat and assign value as xpath...
		// Create variables checkboxHorse and assign value as xpath...

		
		checkboxBoat.click() ;
		checkboxHorse.click();
		//command variable to click
	
		
		
	}

}
