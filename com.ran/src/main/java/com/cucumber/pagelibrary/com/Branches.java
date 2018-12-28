package com.cucumber.pagelibrary.com;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Branches {

	@FindBy(how = How.ID, using = "lst_countryS")
	public static WebElement Country;
	
	@FindBy(how = How.ID, using = "lst_stateS")
	public static WebElement State;
	
	@FindBy(how = How.ID, using = "lst_cityS")
	public static WebElement City;
	
	@FindBy(how = How.ID, using = "btn_search")
	public static WebElement Search;
	
	@FindBy(how = How.ID, using = "BtnNewBR")
	public static WebElement NewBranch;
	
	
}
