package com.ShoppingApplication.Scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ShoppingApplication.genericlib.BaseClass;
import com.ShoppingApplication.genericlib.Propertylib;
import com.ShoppingApplication.genericlib.Utilites;
import com.ShoppingApplication.pomrepository.pages.AddToCart;
import com.ShoppingApplication.pomrepository.pages.Home;
import com.ShoppingApplication.pomrepository.pages.Login;
import com.ShoppingApplication.pomrepository.pages.Product;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Addingcart1 extends BaseClass{
	@Test
	public void cart() throws FileNotFoundException, IOException, InterruptedException
	{
		ExtentTest test = reports.createTest("Addingcart1");
		test.log(Status.PASS,"open the browser");
		Login l=new Login(driver);
		Home h=l.loginCredtails(Propertylib.getpropertydata("username"),Propertylib.getpropertydata("password"));
	    Assert.assertEquals(Propertylib.getpropertydata("homepagetitle"),"My account - My Store");
		Product p=h.searching(Propertylib.getpropertydata("productname"));
		Utilites.dropDown(p.getSortByDd(),Propertylib.getpropertydata("sortby"));
	    AddToCart c=p.selectedDress();
	    c.plusBtn();
	    Utilites.dropDown(p.getSortByDd(),Propertylib.getpropertydata("size"));
	    c.addtocartBtn();
	    Assert.assertEquals(Propertylib.getpropertydata("proceedtitle"),"Order - My Store");
	}

}
