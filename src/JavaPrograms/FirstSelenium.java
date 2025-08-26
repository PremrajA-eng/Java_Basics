package JavaPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import com.sun.tools.javac.util.List;

public class FirstSelenium {

	static int i;

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(4000);
		driver.get("https://www.facebook.com/");
		//  //a[@id='u_0_0_69']
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		driver.findElement(By.xpath("//*[contains(@id,'u_0_0')]")).click();
		driver.findElement(By.xpath("//input[@value='1']")).click();
		driver.findElement(By.xpath("//input[@value='2']")).click();
		driver.findElement(By.xpath("//input[@value='-1']")).click();
		// 2nd way
		List<WebElement> radios= driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println("total radio buttons:" +radios.size());
		System.out.println(radios.get(0).isSelected());//false
		System.out.println(radios.get(1).isEnabled()); // true
		System.out.println(radios.get(2).isDisplayed()); // true
		radios.get(1).click();
		
		// type3 
		List<WebElement> radioText= driver.findElements(By.xpath("//label[@class='_58mt']"));
		System.out.println("Total radio button text:-" + radioText.size());
		String expResult="Female";
		
		for(i=0;i<radioText.size();i++);
		{
			if(radioText.get(i).getText().equalsIgnoreCase(expResult)) {
				radioText.get(i).click();
				System.out.println(expResult + " clicked");

			}
		}
	
	}

}
