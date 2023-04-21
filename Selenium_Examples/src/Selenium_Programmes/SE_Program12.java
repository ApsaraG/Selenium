package Selenium_Programmes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SE_Program12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// How to automate radio dropdown of a webpage using Selenium Webdriver
		//Introduction of 'Select' Class and 'selectByVisibleText' Method
		
		System.setProperty("webdriver.chrome.driver","C://Program Files//chromedriver.exe");
		WebDriver browserObject = new ChromeDriver ();
		browserObject.get("http://training.qaonlinetraining.com/testPage.php");
		
		Select countryselect = new Select(browserObject.findElement(By.name("country")));
		// variable countryselect has been given a value/formula to find element Country
		// !! Here we are introduced to a new class -> Select
		
		
		countryselect.selectByVisibleText("France");
		// variable countryselect is requested to select France
		// !! Here we are introduced to new method -> selectByVisibleText
		
		Select skillselect = new Select(browserObject.findElement(By.name("skill")));
		// variable skillselect has been given a value/formula to find element skill
		
		skillselect.selectByVisibleText("Database");
		// variable skillselect is requested to select Database
		
	}

}
