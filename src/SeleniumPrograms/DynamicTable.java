package SeleniumPrograms;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		// WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://practice.expandtesting.com/dynamic-table");
		// List of all Rows and Column
				List<WebElement> AllName=driver.findElements(By.xpath("//table[@class='table table-striped']/tbody/tr/td"));
				System.out.println("total Rows: " +AllName.size());
				
				//List of Current prise
				List<WebElement> CPU=driver.findElements(By.xpath("//table[@class='table table-striped']/tbody/tr/td"));
				System.out.println("total column: " +CPU.size());
				String Chromecpu=driver.findElement(By.xpath("//p[@id='chrome-cpu']")).getText();
				
				System.out.println(Chromecpu);
				
			//	String expResult="Chrome";
				for(int i=0;i<AllName.size(); i++) {
					if(AllName.get(i).getText().contains(Chromecpu)) {
					System.out.println(AllName.get(i).getText() + "===" +CPU.get(i).getText());
				System.out.println(AllName.get(i).getText());
					break;
				}
	}

} }
