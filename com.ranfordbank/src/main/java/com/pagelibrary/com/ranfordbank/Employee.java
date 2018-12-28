package com.pagelibrary.com.ranfordbank;

import org.openqa.selenium.WebElement;

import testbase.Base;

public class Employee extends  Base{
	public static WebElement NewEmployee() {
		return driver.findElement(getelement("NewEmployee"));
	}

}
