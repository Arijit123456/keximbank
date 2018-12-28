package com.pagelibrary.com.ranfordbank;

import org.openqa.selenium.WebElement;

import testbase.Base;

public class Roles extends Base {
	
		
	
	
	public static WebElement NewRole()
	{
		return driver.findElement(getelement("NewRole"));
		

	}
}
