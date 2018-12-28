package com.pagelibrary.com.ranfordbank;
import javax.sql.rowset.WebRowSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import testbase.Base;

public class Loginpage extends Base{

	
	public static WebElement UserName_editbox()
	{
		 return driver.findElement(getelement("username"));
	}
	public static    WebElement   pass_editbox()
	{
		 return driver.findElement(getelement("password"));
	}
	public static    WebElement       login_btn()
	{
		 return driver.findElement(getelement("login"));
	}
}


