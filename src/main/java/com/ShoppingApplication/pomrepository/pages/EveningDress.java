package com.ShoppingApplication.pomrepository.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EveningDress  {
	
	public WebDriver driver;
@FindBy(xpath="(//div[@class='checker'])[3]")
private WebElement sizecb;

@FindBy(xpath="(//div[@class='checkbox'])[8]")
private WebElement manufacturecb;

@FindBy(xpath="(//a[@title='Delivery']")
private WebElement deliveryBtn ;

public WebElement getSizecb() {
	return sizecb;
}

public WebElement getManufacturecb() {
	return manufacturecb;
}

public WebElement getDeliveryBtn() {
	return deliveryBtn;
}

public EveningDress(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
	//super(driver);
}

public void deliveryBtn()
{
	sizecb.click();
	manufacturecb.click();
	deliveryBtn.click();
}

}
