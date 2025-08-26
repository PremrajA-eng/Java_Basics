package SeleniumPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import com.sun.java.swing.plaf.windows.resources.windows;

public class JavaScript1 {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://facebook.com");
       JavascriptExecutor jse= (JavascriptExecutor) driver;
       // Locate element sing JavaScript
       jse.executeScript("document.getElementById('email').value='asdf@gmail.com'");
       Thread.sleep(2000);
       jse.executeScript("document.getElementById('pass').value='1234'");
       
       
       jse.executeScript("window.scrollBy(0,500)");
      
       
       
       
       
	}

}
