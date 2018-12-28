package com.pagelibrary.com.ranfordbank;

import org.openqa.selenium.WebElement;

import testbase.Base;

public class Branches extends Base {
	public static WebElement country_dp() {
		return driver.findElement(getelement("Country"));

	}
	public static WebElement city_dp() {
		return driver.findElement(getelement("City"));
		
	}
	public static WebElement state_dp() {
		return driver.findElement(getelement("State"));

	}
	public static WebElement search()
	{
		return driver.findElement(getelement("Search"));
		
	}
	public static WebElement NewBranch()
	{
		return driver.findElement(getelement("NewBranch"));
	}
}
