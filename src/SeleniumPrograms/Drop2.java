package SeleniumPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		//1st way
		List<WebElement> birthMonth=driver.findElements(By.xpath("//select[@id='month']/option"));
		System.out.println("total values" +birthMonth.size());
		birthMonth.get(4).click(); 
		Thread.sleep(2000);
		// 2nd way
		WebElement bm=driver.findElement(By.xpath("//select[@id='month']"));
		Select month = new Select(bm);
		month.selectByIndex(4);
		month.selectByVisibleText("Apr");
		System.out.println(month.getFirstSelectedOption().getText());
		System.out.println("April");
		Thread.sleep(2000);
		
		 // 3rd way
		List<WebElement> dropdown=month.getOptions();
		System.out.println(dropdown.size());
		for (int i=0;i<dropdown.size();i++)
		{
			if(dropdown.get(i).getText().equalsIgnoreCase("Dec")) {
				dropdown.get(i).click();
			}
		}
		Thread.sleep(2000);
		System.out.println("dec");
		// 4th Way
		driver.findElement(By.id("month")).sendKeys("Jan");
		System.out.println("jan");
		Thread.sleep(2000);
		// 5th Way
		WebElement bm1=driver.findElement(By.xpath("//select[@id='month']"));
		bm.sendKeys("Feb");
		System.out.println("feb");
		
	}

}
