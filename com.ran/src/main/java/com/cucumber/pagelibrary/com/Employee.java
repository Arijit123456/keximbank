package com.cucumber.pagelibrary.com;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Employee {
	
	@FindBy(how = How.ID, using = "BtnNew")
	public static WebElement NewEmployee ;

}
