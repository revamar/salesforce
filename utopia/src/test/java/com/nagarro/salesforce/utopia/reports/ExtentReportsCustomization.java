package com.nagarro.salesforce.utopia.reports;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReportsCustomization {
	static com.nagarro.salesforce.utopia.reports.ExtentTest test;
	static ExtentReportsCustomization report;
	@BeforeClass
	public static void startTest()
	{
	report = new ExtentReportsCustomization();
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
	test.log("Navigated to the specified URL");
	}
	else
	{
	test.log(LogStatus.FAIL, "Test Failed");
	}
	}
	@AfterClass
	public static void endTest()
	report.endTest(test);
	}
	private void flush() {
		// TODO Auto-generated method stub
		
	}
	}


