package com.nagarro.salesforce.utopia.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.nagarro.salesforce.utopia.pages.BaseClass;
import com.nagarro.salesforce.utopia.pages.LoginPage;

public class LoginFreeCRM extends BaseClass{
	
	@Test
	public void appLogin()
	{
		
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.loginToCRM("selenium_50","Abcd@123456");
		
		
	}

}
