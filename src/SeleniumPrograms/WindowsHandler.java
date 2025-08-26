package SeleniumPrograms;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandler {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		// WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.get("https://paytm.com/");
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		Thread.sleep(4000);
		driver.findElement(By.id("tabButton")).click();
		Set<String> allWinId =driver.getWindowHandles();
		System.out.println(allWinId);
		Iterator<String> abc=allWinId.iterator();
		String win1=abc.next();
		String win2=abc.next();
		// Print the title of parent Windows
		driver.switchTo().window(win1);
		System.out.println("parent window ID: " +win1);
		System.out.println(driver.getTitle());
		

	}

}
