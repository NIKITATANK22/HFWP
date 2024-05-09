package com.ShoppingApplication.pomrepository.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * @author nikita
 */
public class Product {
	/**
	 * Elements of product page
	 */
	public WebDriver driver;
	@FindBy(id="selectProductSort")
	private WebElement sortByDd;
	
	@FindBy(xpath="(//a[@title='Printed Summer Dress'])[3]")
	private WebElement dress;

	public WebElement getSortByDd() {
		return sortByDd;
	}

	public WebElement getDress() {
		return dress;
	}
	
	public Product(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		//super(driver);
	}
	
	public AddToCart selectedDress()
	{
		dress.click();
		return new AddToCart(driver);
	}

}
