package com.pagelibrary.com.ranfordbank;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Generic {
	public static Select dropdown_handle(WebElement e)
	{
		Select s= new Select(e);
		return s;
	}
	

}
