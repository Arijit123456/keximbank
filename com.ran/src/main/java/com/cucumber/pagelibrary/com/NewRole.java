package com.cucumber.pagelibrary.com;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NewRole {

	@FindBy(how = How.ID, using = "txtRname")
	public static WebElement RoleName;
	
	@FindBy(how = How.ID, using = "txtRDesc")
	public static WebElement RoleDesc;
	
	@FindBy(how = How.ID, using = "lstRtypeN")
	public static WebElement RoleType;
	
	@FindBy(how = How.ID, using = "btninsert")
	public static WebElement Submit_btn;
}
