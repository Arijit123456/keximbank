package com.cucumber.pagelibrary.com;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NewEmployee {
	
	@FindBy(how = How.ID, using = "txtUname")
	public static WebElement EmployerName ;
	
	@FindBy(how = How.ID, using = "txtLpwd")
	public static WebElement LoginPassword ;
	
	@FindBy(how = How.ID, using = "lst_Roles")
	public static WebElement Role ;
	
	@FindBy(how = How.ID, using = "lst_Branch")
	public static WebElement Branch ;
	

}
