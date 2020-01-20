package dropDowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahsan\\Documents\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("(//a[@value='HYD'])[1]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@value='COK'])[2]")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		driver.findElement(By.id("ctl00_mainContent_view_date2")).click();
		driver.findElement(By.cssSelector(".ui-state-default")).click();
		
		driver.findElement(By.name("//label[contains(text(),'Round Trip')]")).click();
		driver.findElement(By.name("//label[@class='select-label'][contains(text(),'One Way')]")).click();
		driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled();

	}

}
