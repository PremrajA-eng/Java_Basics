package SeleniumPrograms;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		// WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://money.rediff.com/gainers");
		
		// List of all companies
		List<WebElement> allComp=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]/a"));
		System.out.println("total comp: " +allComp.size());
		
		//List of Current prise
		List<WebElement> CurrentPrice=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		System.out.println("total comp: " +CurrentPrice.size());
		
		String expResult="KJMC Corporate Advi";
		for(int i=0;i<allComp.size(); i++) {
			if(allComp.get(i).getText().equalsIgnoreCase(expResult)) {
			System.out.println(allComp.get(i).getText() + "===" +CurrentPrice.get(i).getText());
			allComp.get(i).click();
			break;
		}

		
		

	}

} }
 