package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.learnautomation.utility.BrowserFactory;
import com.learnautomation.utility.ConfiqDataProvider;
import com.learnautomation.utility.ExcelDataProvider;

public class BaseClass {
	public WebDriver driver;
	public ExcelDataProvider excel;
	public ConfiqDataProvider confiq;
	
	@BeforeSuite
	public void setUpSuite()
	{
		excel = new ExcelDataProvider();
		confiq = new ConfiqDataProvider();
	}
	
	
	@BeforeClass
	public void setup() throws InterruptedException
	{
		driver=BrowserFactory.StartApplication(driver, confiq.getBrowser(), confiq.getStagingURL());
	}
	
	@AfterClass
	public void teardown()
	{
		BrowserFactory.quitBrowser(driver); //Abstraction: showing essential features and hiding background details
	}

}
