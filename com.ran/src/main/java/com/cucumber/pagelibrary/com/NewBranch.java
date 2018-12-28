package com.cucumber.pagelibrary.com;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NewBranch {
	@FindBy(how = How.ID, using = "BtnNewBR")
	public static WebElement NewBranch;
	
	@FindBy(how = How.ID, using = "txtbName")
	public static WebElement BranchName;
	
	@FindBy(how = How.ID, using = "txtAdd1")
	public static WebElement Address1;

	@FindBy(how = How.ID, using = "Txtadd2")
	public static WebElement Address2;
	
	@FindBy(how = How.ID, using = "txtadd3")
	public static WebElement Address3;
	
	@FindBy(how = How.ID, using = "txtArea")
	public static WebElement Area;
	
	@FindBy(how = How.ID, using = "txtZip")
	public static WebElement ZipCode;
	
	@FindBy(how = How.ID, using = "lst_counrtyU")
	public static WebElement Country;	
	
	@FindBy(how = How.ID, using = "lst_stateI")
	public static WebElement State;
	
	@FindBy(how = How.ID, using = "lst_cityI")
	public static WebElement City;
	
	@FindBy(how = How.ID, using = "btn_insert")
	public static WebElement Submit_btn;
	


	
}
