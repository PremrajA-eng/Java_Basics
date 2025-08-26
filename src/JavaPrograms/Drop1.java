package JavaPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");

		WebElement bm = driver.findElement(By.name("birthday_day"));
		Select day = new Select(bm);
		List<WebElement> dropdown = day.getOptions();
		System.out.println(dropdown.size());
		dropdown.get(5).click();
		System.out.println(dropdown.isEmpty());
		//dropdown.clear();
		
	}

}
