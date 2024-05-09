package com.ShoppingApplication.Scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

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

public class AddingProductCart extends BaseClass {
	
	@Test
	public void addingProductcart() throws FileNotFoundException, IOException
	{
		ExtentTest test = reports.createTest("addingProductcart");
		test.log(Status.PASS,"open the browser");
		Login l= new Login(driver);
		l.loginCredtails(Propertylib.getpropertydata("username"),Propertylib.getpropertydata("password"));
		test.log(Status.SKIP,"Homepage is displayed");
		Home h=new Home(driver);
	    h.searching(Propertylib.getpropertydata("productname"));
	    test.log(Status.FAIL,"searching product");
	    Product p=new Product(driver);
	    Utilites.dropDown(p.getSortByDd(),Propertylib.getpropertydata("sortby"));
	    test.log(Status.WARNING,"After sort");
	    p.selectedDress();
	    AddToCart a=new AddToCart(driver);
	    a.plusBtn();
	    Utilites.dropDown(a.getSizeDd(),Propertylib.getpropertydata("size"));
	    a.addtocartBtn();
	}
	

}
