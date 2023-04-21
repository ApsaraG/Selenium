package Selenium_Programmes;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SE_program14 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// How to handle alert button in log in page
		// Introduction to dismiss method

		System.setProperty("webdriver.chrome.driver", "C://Program Files//chromedriver.exe");
		WebDriver browserObject = new ChromeDriver();
		browserObject.get("http://www.training.qaonlinetraining.com/testPage.php");

		browserObject.findElement(By.id("alert")).click();
		Alert alert = browserObject.switchTo().alert();
		Thread.sleep(3000);
		alert.accept();
		// This will find alert element
		// Alert class is summoned and alert variable is given the switch to method
		// alert variable is asked to accept
		
		browserObject.findElement(By.id("confirm")).click();
		Thread.sleep(3000);
		alert.dismiss();
		// This will find confirm element
		// alert variable is asked to dismiss
				
		browserObject.findElement(By.id("prompt")).click();
		Alert alert2 = browserObject.switchTo().alert();
		Thread.sleep(3000);
		alert2.sendKeys("Hello");
		Thread.sleep(3000);
		alert2.accept();
		// This will find propmt element
		// Alert class is summoned and alert2 variable is created and assigned switchTo method
		// variable alert 2 is asked to send Keys 'Hello' in the text box
	}

}
