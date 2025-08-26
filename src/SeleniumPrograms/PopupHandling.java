package SeleniumPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import io.github.bonigarcia.wdm.WebDriverManager;

public class PopupHandling {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		// WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.get("https://paytm.com/");
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
        JavascriptExecutor jse= (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('tabButton').click()");
		Thread.sleep(2000);
		//driver.findElement(By.id("tabButton"));
		
		
		
		
	}

}
