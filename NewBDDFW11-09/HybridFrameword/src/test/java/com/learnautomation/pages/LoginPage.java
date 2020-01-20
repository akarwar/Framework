package com.learnautomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BaseClass {
	WebDriver driver;
	
	public LoginPage(WebDriver ldriver) 
	{
		this.driver=ldriver;
	}
	
	@FindBy(name="username") WebElement uname;
	
	@FindBy(name="password") WebElement pass;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginbtn;
	//*[@id="loginForm"]/div/div/input
	
	public void loginToCRM(String usernameApplication, String passwordApplication)
	{
	uname.sendKeys(usernameApplication);	
	pass.sendKeys(passwordApplication);
	loginbtn.click();
	}

}
