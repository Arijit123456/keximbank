package com.cucumber.pagelibrary.com;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Users {
	@FindBy(how = How.ID, using = "lst_branchS")
	public static WebElement Branch;
	
	@FindBy(how = How.ID, using = "lst_rolesS")
	public static WebElement Roles;
	
	@FindBy(how = How.ID, using = "btn_search")
	public static WebElement Search_btn;
	
	@FindBy(how = How.ID, using = "Btnuser")
	public static WebElement NewUser;

}
