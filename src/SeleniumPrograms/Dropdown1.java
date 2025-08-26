package SeleniumPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.InvalidSelectorException;
public class Dropdown1 {

	public static void main(String[] args)  {
		// its method to set webdriver path
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		
	//	List<WebElement>birthdate=driver.findElements(By.xpath("//select[@name='birthday_day']/option"));
	//	System.out.println("total Dropdown dates: "  +birthdate.size());	
	//	birthdate.get(9).click();
		
		//2 nd way
		WebElement bm= driver.findElement(By.name("birthday_day"));
		//day.selectByIndex(20); 
		Select day=new Select(bm);
		List<WebElement> dropdown=day.getOptions();
		System.out.println(dropdown.size());
		
		
		

	}

}
