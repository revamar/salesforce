package com.nagarro.salesforce.utopia.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.nagarro.salesforce.utopia.utility.BrowserFactory;

public class BaseClass {
	
	public WebDriver driver;
	
	@BeforeClass
	public void setup() {
		driver = BrowserFactory.startApplication(driver, "Chrome", "https://ui.freecrm.com/");
	}
	
	@AfterClass
	public void teardown() {
		BrowserFactory.closeBrowser(driver);
	}
	

}
