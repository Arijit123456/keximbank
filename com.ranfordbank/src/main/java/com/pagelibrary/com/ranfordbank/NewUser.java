package com.pagelibrary.com.ranfordbank;

import org.openqa.selenium.WebElement;

import testbase.Base;

public class NewUser extends  Base {
	public static WebElement Role() {
		return driver.findElement(getelement("Role"));
	}
	public static WebElement Branch() {
		return driver.findElement(getelement("Branch"));
		}
	public static WebElement CustomerId() {
		return driver.findElement(getelement("CustomerId"));
		}
	public static WebElement CustomerName() {
		return driver.findElement(getelement("CustomerName"));
		}
	public static WebElement UserName() {
		return driver.findElement(getelement("UserName"));
		}
	public static WebElement LoginPassword() {
		return driver.findElement(getelement("LoginPassword"));
		}
	public static WebElement TransactionPassword() {
		return driver.findElement(getelement("TransactionPassword"));
		}
	public static WebElement Submit() {
		return driver.findElement(getelement("Submit"));
		}
	public static WebElement Reset() {
		return driver.findElement(getelement("Reset"));
		}
	public static WebElement Cancel() {
		return driver.findElement(getelement("Cancel"));
		}
	
	

}
