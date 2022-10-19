package com.nagarro.salesforce.utopia.reports;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportDemo {
	

	
	@Test
	public void LoginTest()
	{
	
		System.out.println("Login");
		
		ExtentHtmlReporter reporter=new ExtentHtmlReporter("D:\\Manish_Selenium\\Reports");
		
		ExtentReports extent  = new ExtentReports();
		
		extent.attachReporter(reporter);
		
	ExtentTest logger=extent.createTest("Login Test");
		
     logger.log(Status.INFO, "Login to Facebook");
     
     logger.log(Status.PASS, "Verified");
     extent.flush();
		
	}
	

}
