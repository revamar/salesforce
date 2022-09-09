package com.nagarro.salesforce.utopia;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class testclasscommit {

	@SuppressWarnings("deprecation")
	@Test
	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.gecko.driver", "C:\\Web Drivers\\geckodriver-v0.31.0-win64\\geckodriver.exe");
    WebDriver fd = new FirefoxDriver();
	fd.get("https://www.facebook.com/");
	fd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    fd.findElement(By.id("email")).sendKeys("shaurya.sps99@gmail.com");
    fd.findElement(By.id("pass")).sendKeys("pwd");
    Thread.sleep(1000);
    fd.findElement(By.xpath("//*[@id=\"u_0_5_Bq\"]")).click();
		

	}

}
