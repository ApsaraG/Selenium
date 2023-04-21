package Selenium_Programmes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SE_Program17 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// How to perform Mouse Over action in Selenium Webdriver
		// Introduction to 'moveToElement' method
		
		
		System.setProperty("webdriver.chrome.driver", "C://Program Files//chromedriver.exe");
		WebDriver browserObject = new ChromeDriver ();
		browserObject.get("https://www.amazon.com/");
		
		Thread.sleep(3000);
		
		WebElement element = browserObject.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
		// WebElement clas is summond, element variable is created and given the value/formula to find button
		
		Actions action = new Actions (browserObject);
		// Actions class summoned and variable action created with value
		
		action.moveToElement(element).build().perform();
		// new method 'moveToElement'
		
		browserObject.findElement(By.xpath("//span[contains(text(),'Create a List')]")).click();
		// this will click create the list
		
	
			
		
	}

}
