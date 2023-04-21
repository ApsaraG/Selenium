package Selenium_Programmes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SE_Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Write a Selenium program to populate only input boxes

		System.setProperty("webdriver.chrome.driver", "C://Program Files//chromedriver.exe");
		WebDriver browserObject = new ChromeDriver();
		browserObject.get("http://www.training.qaonlinetraining.com/testPage.php");
		
		browserObject.findElement(By.name("name")).sendKeys("Apsara");
		// This will find the element labeled 'name' on the website and send keys 'Apsara' into the empty field
		
		browserObject.findElement(By.name("email")). sendKeys ("hello@apsaragurung.com");
		// This will find the element labeled 'email' on the website and will send keys 'hello@apsaragurung.com' into the empty field
		
		browserObject.findElement(By.name("website")). sendKeys ("ApsaraGurung.com");
		// This will find the element labeled 'website' on the website and will send keys 'ApsaraGurung.com' into the empty field
		
		browserObject.findElement(By.name("comment")). sendKeys ("No Comment");
		// This will find the element labeled 'website' on the website and will send keys 'ApsaraGurung.com' into the empty field
			
		
	}

}
