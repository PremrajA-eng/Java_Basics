package SeleniumPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 {

	public static void main(String[] args) throws InterruptedException {
		// Alert is an interface 
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.get("https://paytm.com/");
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		// Alert handling
		//Thread.sleep(5000);
		System.out.println("wait end");
		driver.findElement(By.id("confirmButton")).click();
	// Handling alert
		
		Thread.sleep(6000);
		driver.switchTo().alert().accept();
		System.out.println("alert accepted");
		// dissmis the alert
		driver.switchTo().alert().dismiss();
		System.out.println("alert dissmiss"); 
		
		
		
		
	
	
	}

}
