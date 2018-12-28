package com.pagelibrary.com.ranfordbank;

import org.openqa.selenium.WebElement;

import testbase.Base;

public class NewRole extends Base{

	public static WebElement RoleName() {
		return driver.findElement(getelement("RoleName"));
		
	}
	
	public static WebElement RoleDesc() {
		return driver.findElement(getelement("RoleDesc"));
	}
	public static WebElement RoleType() {
		return driver.findElement(getelement("RoleType"));
	}
	public static WebElement Submit() {
		return driver.findElement(getelement("Submit"));
	}
	
}
