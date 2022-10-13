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
		loginpage.loginToCRM(excel.getStringData("Login", 0, 0),excel.getStringData("Login", 0, 1));
		
		
	}

}
