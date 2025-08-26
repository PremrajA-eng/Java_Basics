package TestNGPrograms;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4jLogger {

	public static void main(String[] args) {
		Logger logger = Logger.getLogger("Log4jLogger");
		// Configure log4j properties file
		PropertyConfigurator.configure("C:\\Users\\Premraj\\eclipse-workspace\\JavaBasics\\log4j.properties");
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
				driver.get("https://www.facebook.com/");
		logger.info("chrome browser instance");
		driver.manage().window().maximize();
		logger.info("window maximise");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		logger.info("inmplicit wait given");
		try {
			driver.findElement(By.id("emails")).isDisplayed();
			logger.info("web element found");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			logger.info("web element not found");
		}
		
		
	}

}
