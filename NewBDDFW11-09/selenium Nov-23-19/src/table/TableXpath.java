package table;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TableXpath {
	
	@Test
	public void tblDemo() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahsan\\Documents\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bsc/daily/groupa");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		int countRow = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr")).size();
		System.out.println("Number of Tble Rows: " + countRow);
		
		int countColumn = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[1]/td")).size();//siz to column
		System.out.println("Number of TBL Columns are: " + countColumn);
		
		String currentPrice = driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[5]/td[4]")).getText();
		System.out.println("CurrentPrice is: " + currentPrice);
		//Since most TBL Data is changing dynamically so below method is recommending
		String currentPrice1 = driver.findElement(By.xpath("//a[contains(text(), 'Trident Ltd.')]/parent::*/following-sibling::td[3]")).getText();
		System.out.println("CurrentPrice is: " + currentPrice1);
	}

	
}
