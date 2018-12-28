package com.pagelibrary.com.ranfordbank;

import org.openqa.selenium.WebElement;

import testbase.Base;

public class NewEmployee extends  Base{
	public static WebElement EmployerName() {
		return driver.findElement(getelement("EmployerName"));
	}
	public static WebElement LoginPassword() {
		return driver.findElement(getelement("LoginPassword"));
	}
	public static WebElement Role() {
		return driver.findElement(getelement("Role"));
	}
	public static WebElement Branch() {
		return driver.findElement(getelement("Branch"));
		}
	public static WebElement Submit() {
		return driver.findElement(getelement("Submit"));
		}
	
	
}
