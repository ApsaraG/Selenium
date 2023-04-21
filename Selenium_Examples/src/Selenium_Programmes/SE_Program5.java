package Selenium_Programmes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SE_Program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// How to navigate to multiple windows in Selenium webdriver
		//Create web to flow -> FB to IG, IG to TW, TW back to IG, IG further back to FB, and FB forward to IG
		
		System.setProperty("webdriver.chrome.driver", "C://Program Files//chromedriver.exe");
		WebDriver browserObject = new ChromeDriver ();
		
	
		//1. Requested webdriver to open FB 1st. 
		//Printed my current website location
		browserObject.get("https://www.facebook.com/");
		System.out.println("this is " + browserObject.getTitle()+ " 1st website");
		System.out.println("url is: " + browserObject.getCurrentUrl());
		
		//2. Requested webdriver to open IG 2nd. 
		//Printed my current website location
		browserObject.navigate().to("http://www.instagram.com/");
		System.out.println("this is " + browserObject.getTitle()+ " 2nd website");
		System.out.println("url is: " + browserObject.getCurrentUrl());
		
		//3. Requested webdriver to open TW 3rd. 
		//Printed my current website location
		browserObject.navigate().to("http://www.twitter.com/");
        System.out.println("this is " + browserObject.getTitle() + " 3rd website");
        System.out.println("url is: " + browserObject.getCurrentUrl());
        
        //4. Requested webdriver to go back one in web history, (2-IG)
      //Printed my current website location
        browserObject.navigate().back();
        System.out.println("this is " + browserObject.getTitle()+ " website");
		System.out.println("url is: " + browserObject.getCurrentUrl());
		
		//5. Requested webdriver to go back one more in web history, (1-FB)
	      //Printed my current website location
		browserObject.navigate().back();
        System.out.println("this is " + browserObject.getTitle()+ " website");
		System.out.println("url is: " + browserObject.getCurrentUrl());
		
		//6. Requested webdriver to go forward in web history, (2 IG)
	      //Printed my current website location
		browserObject.navigate().forward();
		System.out.println("this is " + browserObject.getTitle()+ " website");
		System.out.println("url is: " + browserObject.getCurrentUrl());
		
		
	}

}
