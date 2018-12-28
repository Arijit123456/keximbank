package com.cucumber.pagelibrary.com;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Roles {

	@FindBy(how = How.ID, using = "btnRoles")
	public static WebElement NewRole;
	
}
