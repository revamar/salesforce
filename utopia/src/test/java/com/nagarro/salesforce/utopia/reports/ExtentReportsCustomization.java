package com.nagarro.salesforce.utopia.reports;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class ExtentReportsCustomization {
	static com.nagarro.salesforce.utopia.reports.ExtentTest test;
	static ExtentReportsCustomization report;

	public static void startTest()
	{
	test = report.startTest("ExtentDemo");
	}
	private com.nagarro.salesforce.utopia.reports.ExtentTest startTest(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	@Test
	public void extentReportsDemo()
	{
	System.setProperty("webdriver.chrome.driver", "D:SubmittalExchange_TFSQAAutomation3rdpartychromechromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.co.in");
	if(driver.getTitle().equals("Google"))
	{
	}
	else
	{
	}
	}
	@AfterClass
	public static void endTest() {
	report.endTest();
	}
	private void flush() {
		// TODO Auto-generated method stub
		
	}
	}


