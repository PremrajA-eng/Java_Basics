package SeleniumPrograms;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("How stuff work");
		// Handling Auto sujjesion
		List<WebElement> AllSuggesion=driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		for(int i=0;i< AllSuggesion.size();i++) {
			String Expresult="how stuff works science";
			if (AllSuggesion.get(i).getText().equalsIgnoreCase(Expresult)) {
				AllSuggesion.get(i).click();
				System.out.println("End of loop");
				break;
			}
			
		}
		
	}

}
