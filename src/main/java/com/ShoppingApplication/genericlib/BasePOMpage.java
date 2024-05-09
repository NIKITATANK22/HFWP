package com.ShoppingApplication.genericlib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePOMpage {
	public WebDriver driver;
	
public BasePOMpage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
	
}
