package TestNGPrograms;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjectRepo {

	public static void main(String[] args) throws IOException {
		File src=new File("C:\\Users\\Premraj\\eclipse-workspace\\JavaBasics\\Locators.properties");
		FileInputStream fis=new FileInputStream(src);
		Properties pro=new Properties();
		pro.load(fis);
		
System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath(pro.getProperty("email"))).sendKeys("abc@gmail.com");
		}

}
