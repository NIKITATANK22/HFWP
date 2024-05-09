package com.ShoppingApplication.genericlib;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
/**
 * Author=Nikita
 */
public class Utilites {
	/**
	 * It is used to handle the dropdown
	 * @param element
	 * @param text
	 */
	
	public static void dropDown(WebElement element,String text)
	{
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}
	/**
	 * It is used to handle mouseHover
	 * @param driver
	 * @param element
	 */
	public static void mouseHover(WebDriver driver, WebElement element)
	{
		Actions a = new Actions(driver);
		a.moveToElement(element).perform();
	}
	
	/**
	 * It is used to handle right click
	 * @param driver
	 * @param element
	 */
	public void rightClick(WebDriver driver,WebElement element)
	{
		Actions a = new Actions(driver);
		a.contextClick(element).perform();
	}
	/**
	 * It is used to handle alert popup
	 * @param driver
	 */
	public void alertpopup(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	
	/**
	 * It is used to handle the scrollbar
	 * @param driver
	 */
	public void scrollbar(WebDriver driver)
	{
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,5000)");
	}

}
