package com.nagarro.salesforce.utopia.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LoginFreeCRM {
	
	WebDriver driver;
	@Test
	public void appLogin()
	{
		driver = com.nagarro.salesforce.utopia.utility.BrowserFactory.startApplication("Chrome", "https://freecrm.com/");
		System.out.println(driver.getTitle());
	}

}
