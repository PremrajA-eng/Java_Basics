package JavaPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//import com.sun.org.apache.bcel.internal.generic.Select;

public class Radio1 {

	public static void main(String[] args) throws InterruptedException {
		// its method to set webdriver path
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//*[contains(@id,'u_0_0')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='-1']")).click();
		System.out.println("end of radio click");
		driver.findElements(By.xpath("//label[@class='_58mt']"));
		
		List<WebElement> radioSexName= driver.findElements(By.xpath("//label[@class='_58mt']"));
		System.out.println("Total Number of radio present on page: " +radioSexName.size());
		String sex="Female";
		for(int i=0;i<radioSexName.size();i++)
		{
			System.out.println(i);
         if(radioSexName.get(i).getText().equalsIgnoreCase(sex))
          {
        	  radioSexName.get(i).click();
          } 
		}
		System.out.println("Complete of loop");
		
		List<WebElement> birthday=driver.findElements(By.name("birthday_day"));
		System.out.println("Total dropdown lalue:-" + birthday.size());
		birthday.get(3).click(); 
		/* Second way
		 WebElement bm =driver.findElement(By.xpath("//select[@id='month']"));
		Select month=new Select(bm);
		Thread.sleep(2000); 
		month.selectByIndex(12);
		Thread.sleep(2000);
		month.selectByVisibleText("April"); 
		System.out.println("its a End of program");  */
	
	}

}
