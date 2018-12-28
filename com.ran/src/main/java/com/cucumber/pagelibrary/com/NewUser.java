package com.cucumber.pagelibrary.com;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NewUser {


		@FindBy(how = How.ID, using = "lst_Roles")
		public static WebElement Role;
		
		@FindBy(how = How.ID, using = "lst_Branch")
		public static WebElement Branch;
		
		@FindBy(how = How.ID, using = "DrCName")
		public static WebElement CustomerID;
		
		@FindBy(how = How.ID, using = "Lbc_name")
		public static WebElement CustomerName;
		
		@FindBy(how = How.ID, using = "txtUname")
		public static WebElement  UserName;
		
		@FindBy(how = How.ID, using = "txtLpwd")
		public static WebElement  LoginPassword;
		
		@FindBy(how = How.ID, using = "txtTpwd")
		public static WebElement  TransactionPassword;
		
		@FindBy(how = How.ID, using = "BtnSubmit")
		public static WebElement  Submit_btn;
		
		
}
