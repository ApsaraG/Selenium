package Selenium_Programmes;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SE_Program16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// How to right click in selenium webdriver
		// Introduction to class 'Actions', and method 'contextClick' which will right click.
		
		System.setProperty("webdriver.chrome.driver", "C://Program Files//chromedriver.exe");
		WebDriver browserObject = new ChromeDriver();
		browserObject.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		Actions action = new Actions(browserObject);
		// Summoned Actions Class and created a variable 'action' and assigned value
		
		WebElement rightClickElement = browserObject.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		// Created new variable rightClickElement and assigned value for browser object to find the button
		
		action.contextClick(rightClickElement).build().perform();
		//method contextClick is used 
		
	}

}
