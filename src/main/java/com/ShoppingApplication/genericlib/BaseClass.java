package com.ShoppingApplication.genericlib;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * @author nikita
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class BaseClass implements AutoConstant {
	public ExtentHtmlReporter htmlreport;
	public ExtentReports reports;
	public WebDriver driver;
	
	@BeforeSuite
	public void configBS()	{
		
		 htmlreport=new ExtentHtmlReporter(new File("./advanceReport.html"));
		 htmlreport.config().setDocumentTitle("ExtentReport");
		 htmlreport.config().setTheme(Theme.DARK);
		 reports =new ExtentReports(); 
		 reports.attachReporter(htmlreport);		 
	}	
	
	/*
	 * It is used to launch the application,enter the url and closing the application
	 */	
	
	@BeforeMethod
	public void openapp() throws FileNotFoundException, IOException
	{
	System.setProperty(key,value);
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(Propertylib.getpropertydata("URL"));
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	
	/**
	 * It is used to take screenshot of failed testcase and close the application
	 * @param r
	 * @throws IOException
	 */
	
	@AfterMethod
	public void closeapp(ITestResult r) throws IOException
	{
		int status = r.getStatus();
		String name = r.getName();
		if(status==2)
		{
			photo.getPhoto(driver,name);
		}
		driver.quit();
	}
	
	@AfterSuite
	public void configAS() {
		reports.flush();
		htmlreport.flush();
	}
}
