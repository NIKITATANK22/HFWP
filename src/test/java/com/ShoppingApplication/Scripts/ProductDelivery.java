package com.ShoppingApplication.Scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.ShoppingApplication.genericlib.BaseClass;
import com.ShoppingApplication.genericlib.Propertylib;
import com.ShoppingApplication.genericlib.Utilites;
import com.ShoppingApplication.pomrepository.pages.EveningDress;
import com.ShoppingApplication.pomrepository.pages.Home;
import com.ShoppingApplication.pomrepository.pages.Login;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class ProductDelivery extends BaseClass {
	@Test
	public void Delivery() throws FileNotFoundException, IOException, InterruptedException
	{
		ExtentTest test = reports.createTest("ProductDelivery");
		test.log(Status.PASS,"open the browser");
		Login l= new Login(driver);
		l.loginCredtails(Propertylib.getpropertydata("username"),Propertylib.getpropertydata("password"));
	    Home h=new Home(driver);
	    Thread.sleep(5000);
	    Utilites.mouseHover(driver,h.getDressBtn());
	    h.eveningProduct();
	    EveningDress e= new EveningDress(driver);
	    e.deliveryBtn();
	}
	

}
