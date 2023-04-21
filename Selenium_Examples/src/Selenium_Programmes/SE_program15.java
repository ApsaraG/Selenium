package Selenium_Programmes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SE_program15 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// How to Drag and Drop action in Selenium webdriver
		// Introduction to method 'dragAndDrop'
		
		System.setProperty("chromedriver.chrome.driver", "C://Program Files//chromedriver.exe");
		WebDriver browserobject = new ChromeDriver();
		browserobject.get("http://jqueryui.com/droppable/");
		
		browserobject.switchTo().frame(0);
		// We ask to switch the focus to frame
		
		WebElement source = browserobject.findElement(By.xpath("//div[@id='draggable']"));
		WebElement notsource = browserobject.findElement(By.xpath("//div[@id='droppable']"));
		// Created variable with their locations on the webpage
		
		Thread.sleep(3000);
		
		Actions aa = new Actions(browserobject);
		//Actions summoned and variable aa created with value
		
		aa.dragAndDrop(source,notsource).build().perform();
		// new method used called dragAndDrop 
		
		Thread.sleep(3000);
		
		
		
	}

}
