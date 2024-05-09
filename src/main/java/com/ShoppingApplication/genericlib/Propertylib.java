package com.ShoppingApplication.genericlib;
/*
 * Author :- Nikita
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Propertylib implements AutoConstant {
	/**
	 * It is used to read the data from the property file
	 * @param Keyvalue
	 * @return
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	 
	 
	
	public static String getpropertydata(String Keyvalue) throws FileNotFoundException, IOException
	{
		Properties p = new Properties();
		p.load(new FileInputStream(propertyfilepath));
		String value1 = p.getProperty(Keyvalue);
		return value1;
	}

}
