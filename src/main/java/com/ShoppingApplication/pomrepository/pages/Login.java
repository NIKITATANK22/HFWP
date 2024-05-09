package com.ShoppingApplication.pomrepository.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author nikita
 */
public class Login  {
	/**
	 * Login page elements
	 */
	public WebDriver driver;
	@FindBy(xpath="//a[@class='login']")
	private WebElement signinBtn;
	
	@FindBy(id="email")
	private WebElement emailAddress;
	
	@FindBy(id="passwd")
	private WebElement passwordTb;
	
	@FindBy(id="SubmitLogin")
	private WebElement submitBtn ;
	
	public WebElement getSigninBtn() {
		return signinBtn;
	}

	public WebElement getEmailAddress() {
		return emailAddress;
	}

	public WebElement getPasswordTb() {
		return passwordTb;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}

	
	
	public Login(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		//super(driver);
	}

	
	
	public Home loginCredtails(String us,String pwd)
	{
		signinBtn.click();
		emailAddress.sendKeys(us);
		passwordTb.sendKeys(pwd);
		submitBtn.click();
		return new Home(driver);
	}
}
