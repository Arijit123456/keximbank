package com.pagelibrary.com.ranfordbank;

import org.openqa.selenium.WebElement;

import testbase.Base;

public class NewBranch extends Base {
	public static WebElement Branchname() {
		return driver.findElement(getelement("Branchname"));
	}
public static WebElement Address1() {
	return driver.findElement(getelement("Address1"));

}

public static WebElement Address2() {
	return driver.findElement(getelement("Address2"));
}
	public static WebElement Address3() {
		return driver.findElement(getelement("Address3"));
}
	public static WebElement Area() {
		return driver.findElement(getelement("Area"));
		}
	
	public static WebElement Zipcode() {
		return driver.findElement(getelement("Zipcode"));
		}
	public static WebElement Country_dp() {
		return driver.findElement(getelement("Country1"));
	}
	
	public static WebElement State_dp() {
		return driver.findElement(getelement("State1"));
	}
	public static WebElement City_dp() {
		return driver.findElement(getelement("City1"));
	}
	
	public static WebElement Submit() {
		return driver.findElement(getelement("Submit_br"));
	}
	
}
