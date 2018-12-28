package com.pagelibrary.com.ranfordbank;

import org.openqa.selenium.WebElement;

import testbase.Base;

public class Users extends  Base {
	public static WebElement Branch() {
		return driver.findElement(getelement("Branch"));
	}
	public static WebElement Roles() {
		return driver.findElement(getelement("Roles"));
		}
	public static WebElement Search() {
		return driver.findElement(getelement("Search"));
	}
	
	
	public static WebElement NewUser() {
		return driver.findElement(getelement("NewUser"));
	}
}

