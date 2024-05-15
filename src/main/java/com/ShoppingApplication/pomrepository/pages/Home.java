package com.ShoppingApplication.pomrepository.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * @author nikita
 */
public class Home{
	/**
	 * Elements of Homepage 
	 */
	public WebDriver driver;
@FindBy(id="search_query_top")
private WebElement searchTb;
  
@FindBy(name="submit_search")
private WebElement searchBtn;

@FindBy(xpath="//a[text()='Dresses'][2]")
private WebElement dressBtn ;

@FindBy(xpath="//a[text()='Evening Dresses'][2]")
private WebElement eveningdress ;

public WebElement getDressBtn() {
	return dressBtn;
}

public WebElement getEveningdress() {
	return eveningdress;
}

public WebElement getSearchTb() {
	return searchTb;
}

public WebElement getSearchBtn() {
	return searchBtn;
}

public Home(WebDriver driver){
	this.driver=driver;
	PageFactory.initElements(driver,this);
	//super(driver);
}


	public Product searching(String product)
	{
	searchTb.sendKeys(product);
	searchBtn.click();
	return new Product(driver);

	}
	public void eveningProduct()
	{
		eveningdress.click();
	}
}
