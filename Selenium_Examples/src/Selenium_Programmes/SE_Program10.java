package Selenium_Programmes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SE_Program10 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// How to automate radio button of a webpage using Selenium driver
		
		System.setProperty("webdriver.chrome.driver","C://Program Files//chromedriver.exe");
		WebDriver browserObject = new ChromeDriver ();
		browserObject.get("http://training.qaonlinetraining.com/testPage.php");
		
		browserObject.findElement(By.xpath("//input[@value ='male']")).click();
		// this commands to find value male on the radio button and click it
		
		browserObject.findElement(By.xpath("//input[@value ='horse']")).click();
		// this commands to find value horse on the radio buttong and click it
		
		Thread.sleep(2000);
		browserObject.close();
	
		
		
	}

}
