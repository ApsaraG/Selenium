package Selenium_Programmes;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateITLearn360_Registration {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty ("webdriver.chrome.driver", "C:\\program files\\chromedriver.exe");
		ChromeDriver    BrowserObject = new ChromeDriver();
		BrowserObject.get("https://www.facebook.com/?stype=lo&jlou=AfcY9YdHGEydmyDCemlHDIdkOi2DJMGVDV735zeHqVQNSRAy93dYshw59oCbh1dJfb3NVlxuDiHOOuCWe1E-7OyJQLe0KoLrZ3caY3Eq0unCxA&smuh=63009&lh=Ac94qAxd95ROSFX5wm8");
		BrowserObject.findElement(By.name("login")).click();
		
		Thread.sleep(3000);
		
		BrowserObject.findElement(By.name("email")).sendKeys("hello@Apsaragurung.com");
		
		
	}

}
