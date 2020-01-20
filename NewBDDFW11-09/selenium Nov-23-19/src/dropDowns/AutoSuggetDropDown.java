package dropDowns;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggetDropDown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ahsan\\\\Documents\\\\Drivers\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		WebElement source = driver.findElement(By.cssSelector("#fromCity"));
		source.click();
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Mumbai");
//		source.sendKeys("Muumbai");
		Thread.sleep(3000);
//		source.sendKeys(Keys.ENTER);
//		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Mumbai");
		
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ENTER);

	}

}
