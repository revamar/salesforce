package com.nagarro.salesforce.utopia.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.nagarro.salesforce.utopia.utility.BrowserFactory;

public class LoginFreeCRM {
	
	WebDriver driver;
	@Test
	public void appLogin()
	{
		driver = BrowserFactory.startApplication(driver, "Chrome", "https://freecrm.com/");
		System.out.println(driver.getTitle());
	}

}
