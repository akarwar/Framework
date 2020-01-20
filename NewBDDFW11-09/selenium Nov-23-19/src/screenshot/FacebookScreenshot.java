package screenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class FacebookScreenshot {
	WebDriver driver;

	
		@Test
		public void captureScreenshot()
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahsan\\Documents\\Drivers\\chrome 79\\chromedriver_win32\\chromedriver.exe");
			
			driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("http://www.facebook.com");
			
//			Utility.captureScreenshot(driver, "BrwoserStarted");
			
			driver.findElement(By.xpath(".//*[@id='email09']")).sendKeys("Learn Automation");
			
			
		}
		
		@AfterMethod
		public void tearDown(ITestResult result)
		{
			if(ITestResult.FAILURE==result.getStatus())
			{
				Utility.captureScreenshot(driver, result.getName());
			}
			driver.quit();
		}

	}


