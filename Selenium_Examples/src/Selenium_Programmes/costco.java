package Selenium_Programmes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class costco {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		System.setProperty("webdriver.chrome.chromedriver", "C://Program Files//chromedriver.exe");
		WebDriver browserObject = new ChromeDriver ();
		browserObject.get("https://signin.costco.com/e0714dd4-784d-46d6-a278-3e29553483eb/B2C_1A_SSO_WCS_signup_signin_541/oauth2/v2.0/authorize?ClientName=USBC&ui_locales=en-US&scope=openid+offline_access&response_type=code+id_token&redirect_uri=https%3A%2F%2Fwww.costco.com%2FOAuthLogonCmd&state=DM_PersistentCookieCreated%3Dtrue%26URL%3D%5BSSO%5D%2F%5BSSO%5D&nonce=13t4uPNtsEFisLFq&client_id=4900eb1f-0c10-4bd9-99c3-c59e6c1ecebf&TC=0&response_mode=form_post");
		
		WebElement email = browserObject.findElement(By.id("password"));
		
		email.clear();
		
		email.sendKeys("hello@psaragurung.com");
		
		// possibly blocked
		
		
		   
		
		
		
	}
		

}
