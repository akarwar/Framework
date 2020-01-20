package fileUploadInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FileUploadwithSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahsan\\Documents\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='ng-app']/body/div/div[2]/div[1]/input[1]")).sendKeys("C:\\Users\\ahsan\\Desktop\\Core-java-programs3.txt");

	}

}
