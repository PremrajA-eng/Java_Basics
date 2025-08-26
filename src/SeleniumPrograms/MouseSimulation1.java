package SeleniumPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MouseSimulation1 {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://paytm.com/");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//*[text()='Sign In']")).click();
			
			// find the total frames present
			int allFrames=driver.findElements(By.tagName("iframe")).size();
			System.out.println("Total frames:" + allFrames);
			
			// check the elements is present or not
			for(int i=0;i<allFrames;i++) {
				driver.switchTo().frame(i);
				driver.switchTo().frame(i);
				
				String expText="Open paytm app";
				String abc=driver.findElement(By.xpath("//*[text()='Open Paytm App']")).getText();
				if(abc.equalsIgnoreCase(expText)) {
					System.out.println("Element Found");
				}
				else {
					System.out.println("Element not found");
				}
				
			}
			
	}

}
