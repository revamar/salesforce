package com.nagarro.salesforce.utopia.utility;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helper {
	//Screenshots, alerts, frames, windows, sync issue, javascript executor
	
	public static void captureScreenshot(WebDriver driver)
	{
		File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try {
			FileHandler.copy(scr, new File("./Screenshots/"+ getCurrentDateTime()+".png"));
			
			System.out.println("Screenshot Captured");
			
		} catch (IOException e) {
			System.out.println("Unable to cpture the screenshot"+e.getMessage());
			
		}
		
	}
	
	public static String getCurrentDateTime()
	{
		DateFormat customFormat=new SimpleDateFormat("dd_MM_yyyy_HH_mm_ss");
		
		Date currentDate=new Date();
		return customFormat.format(currentDate);
		
	}

}
