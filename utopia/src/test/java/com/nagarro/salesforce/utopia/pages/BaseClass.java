package com.nagarro.salesforce.utopia.pages;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.nagarro.salesforce.utopia.utility.BrowserFactory;
import com.nagarro.salesforce.utopia.utility.ConfigDataProvider;
import com.nagarro.salesforce.utopia.utility.ExcelDataProvider;
import com.nagarro.salesforce.utopia.utility.Helper;

public class BaseClass {
	
	public WebDriver driver;
	public ExcelDataProvider excel;
	public ConfigDataProvider config;
	
	@BeforeSuite
	public void setUpSuite()
	{
		excel=new ExcelDataProvider();
		config=new ConfigDataProvider();
	}
	
	@BeforeClass
	public void setup() {
		driver = BrowserFactory.startApplication(driver, config.getBrowser(), config.getStagingURL());
	}
	
	@AfterClass
	public void teardown() {
		BrowserFactory.closeBrowser(driver);
	}
	
	@AfterMethod
	public void tearDownMeathod(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			Helper.captureScreenshot(driver);
		}
	}

}
