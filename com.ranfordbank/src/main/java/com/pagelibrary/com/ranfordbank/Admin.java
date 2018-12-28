package com.pagelibrary.com.ranfordbank;

import org.openqa.selenium.WebElement;

import testbase.Base;

public class Admin extends Base{
public static WebElement Branches()
{
	return driver.findElement(getelement("Branches"));
}
public static WebElement Roles()
{
	return driver.findElement(getelement("Roles"));
}
public static WebElement Users()
{
	return driver.findElement(getelement("Users"));
	
}
public static WebElement Employee()
{
	return driver.findElement(getelement("Employee"));
	
}
}
