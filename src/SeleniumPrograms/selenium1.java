package SeleniumPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium1 {
	public static void main(String[] args) throws InterruptedException {
		//Setting the property of chrome Browser and passing Chrome Driver path
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		
		// we are Launching Chrome driver instance 
		WebDriver driver=new ChromeDriver();
		// wait for 4 sec
		Thread.sleep(4000);
		// driver is a refrence of WebDriver class 
		driver.get("https://www.facebook.com/");
		Thread.sleep(4000);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(4000);
		driver.navigate().to("https://www.google.com");
		Thread.sleep(4000);
		driver.navigate().refresh();
		driver.navigate().back();
		Thread.sleep(4000);
		driver.navigate().forward();
		Thread.sleep(4000);
	System.out.println(driver.getCurrentUrl());	
	System.out.println(driver.getTitle());
	driver.close();	
	}
}  
