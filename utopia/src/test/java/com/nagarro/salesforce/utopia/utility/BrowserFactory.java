package com.nagarro.salesforce.utopia.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {
	
	public static WebDriver startApplication( String browserName, String appURL)
	{
		WebDriver driver = null;
		if (browserName.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
			driver= new ChromeDriver();
		}
		
		else if (browserName.equals("FireFox"))
		
		{
			System.setProperty("webdriver.gecko.driver", "./geckodriver.exe");
			driver= new FirefoxDriver();
		}
		
		else if (browserName.equals("Edge"))
		{
			System.setProperty("webdriver.edge.driver", "./msedgedriver.exe");
			driver= new EdgeDriver();
		}
		
		else if (browserName.equals("IE"))
		{
			System.setProperty("webdriver.ie.driver", "./IEDriverServer.exe");
			driver= new InternetExplorerDriver();
		}
		
		else
		{
			System.out.println("Browser Not Supported");
		}
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(appURL);
		return driver;
	}
	
	public static void closeBrowser(WebDriver driver)
	{
		driver.quit();
	}

}
