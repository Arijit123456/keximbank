package com.cucumber.pagelibrary.com;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class Loginpage {
@FindBy(how=How.ID,using="txtuId")
public static WebElement username;// we r hiding data in feature file not property file

@FindBy(how=How.ID,using="txtPword")
public static WebElement password;

@FindBy(how=How.ID,using="login")
public static WebElement Loginbutton;


}
