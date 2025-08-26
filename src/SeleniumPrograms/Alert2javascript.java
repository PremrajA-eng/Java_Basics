package SeleniumPrograms;

import java.util.concurrent.TimeUnit;

import javax.swing.text.Document;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert2javascript {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.get("https://paytm.com/");
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		JavascriptExecutor jse= (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('confirmButton').click()");
	   Thread.sleep(3000);
		driver.switchTo().alert().accept(); 
		System.out.println("alert accepted");

	}

}
