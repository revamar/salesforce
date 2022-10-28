package com.nagarro.salesforce.utopia.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	@FindBy(name="email") WebElement uname;
	@FindBy(name="password") WebElement pass;
	@FindBy(xpath="//*[@id=\"ui\"]/div/div/form/div/div[3]") WebElement loginbutton;
	
	public void loginToCRM(String username, String password)
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) 
		{
			
		}
		
		uname.sendKeys(username);
		pass.sendKeys(password);
		loginbutton.click();
	}
	
}
