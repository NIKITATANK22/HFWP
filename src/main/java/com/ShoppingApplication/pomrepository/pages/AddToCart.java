package com.ShoppingApplication.pomrepository.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


/**
 * @author nikita
 */
public class AddToCart{
	/**
	 * Elements to Addtocart page
	 */
	public WebDriver driver;
	@FindBy(xpath="//i[@class='icon-plus']")
	private WebElement plus;
	
	@FindBy(xpath="//select[@class='form-control attribute_select no-print']")
	private WebElement sizeDd;
	
	@FindBy(name="White")
	private WebElement color;
	
	@FindBy(xpath="//span[text()='Add to cart']")
	private WebElement addTocart ;
	
	@FindBy(xpath="//a[@title='Proceed to checkout']")
	private WebElement proceedTocheckout ;

	public WebElement getPlus() {
		return plus;
	}

	public WebElement getSizeDd() {
		return sizeDd;
	}

	public WebElement getColor() {
		return color;
	}

	public WebElement getAddTocart() {
		return addTocart;
	}

	public WebElement getProceedTocheckout() {
		return proceedTocheckout;
	}

	public AddToCart(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		//super(driver);
	}
	
	public void plusBtn()
	{
		plus.click();
	}
	
	public void addtocartBtn()
	{
		color.click();
		addTocart.click();
		proceedTocheckout.click();
		
	}
}
