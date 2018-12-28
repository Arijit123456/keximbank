package com.pagelibrary.com.ranfordbank;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import testbase.Base;
import validation.Validation;


public class Repository extends Base {
	public static ExtentReports report;
	public static ExtentTest test; 
	
	@BeforeSuite
	public void report()
	{
		
		report=new ExtentReports(".\\ExtentReports\\report.html",true);
		
	}
	
@BeforeMethod
public void beforemethod(Method method)
{
	{
		   test= report.startTest((this.getClass().getSimpleName()+ ":: "+method.getName()));
		   
		   test.assignCategory("regression");
		   test.assignAuthor("shiva");
	}
}
@AfterSuite
public void aftermethod()
{
	report.flush();
}

	public void login() {
		Loginpage.UserName_editbox().sendKeys(getconfig("username"));
		Loginpage.pass_editbox().sendKeys(getconfig("pass"));
		Loginpage.login_btn().click();
	}


	public void launch(String brow) throws Exception {
		
		/*ATUTestRecorder recorder=new ATUTestRecorder("E:\\workspace\\com.ranfordbank\\Record", "xyz", false);
		
		recorder.start();*/
		if(brow.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(brow.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		/*switch (getconfig("browser")) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver=new FirefoxDriver();
			break;
		
		}*/
		

		driver.get(getconfig("build2"));
		driver.manage().window().maximize();
		
		
		if(Validation.isTextPresent(getconfig("build2")))
		{
			test.log(LogStatus.PASS, "exp  "+getconfig("build2")+" is matching with my "+driver.getCurrentUrl());
			test.log(LogStatus.INFO, "site is navigated");
		}
		else
		{
			test.log(LogStatus.FAIL, "exp  "+getconfig("build2")+" is  not matching with my "+driver.getCurrentUrl());
			test.log(LogStatus.INFO, "site is not navigated");
		
		}
		
		//recorder.stop();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
	


	public void Branches() {
		if(Admin.Branches().isDisplayed())
		{
			test.log(LogStatus.PASS, "branches is displayed successfully");
			
			Admin.Branches().click();
		}
		else
		{
			test.log(LogStatus.FAIL, "branches is not dispplayed successfully");
		}
	}
		


	public void srch_branches() {

		Generic.dropdown_handle(Branches.country_dp()).selectByVisibleText(getconfig("Country"));
		Generic.dropdown_handle(Branches.state_dp()).selectByVisibleText(getconfig("State"));
		Generic.dropdown_handle(Branches.city_dp()).selectByVisibleText(getconfig("City"));
		Branches.search().click();
		
		
	}


	public void new_branch(String bname,String address,String address2,String Address3, String Area,String Zipcode,String Country_brn,String state_brn,String City_brn) {
		Branches.NewBranch().click();
		
		NewBranch.Branchname().sendKeys(bname);
		NewBranch.Address1().sendKeys(address);
		NewBranch.Address2().sendKeys(address2);
		NewBranch.Address3().sendKeys(Address3);
		NewBranch.Area().sendKeys(Area);
		NewBranch.Zipcode().sendKeys(Zipcode);
		Generic.dropdown_handle(NewBranch.Country_dp()).selectByVisibleText(Country_brn);
		Generic.dropdown_handle(NewBranch.State_dp()).selectByVisibleText(state_brn);
		Generic.dropdown_handle(NewBranch.City_dp()).selectByVisibleText(City_brn);
		NewBranch.Submit().click();
		/*Alert alert = driver.switchTo().alert();
		alert.accept();
		if(Validation.isAlertPresent(getconfig("alerttext_branches")))
				
				{
			test.log(LogStatus.PASS,"exp"+getconfig("alerttext_branches")+"is matching with my alert"+driver.switchTo().alert().getText());
			
			
				}
		else
		{
			
			test.log(LogStatus.FAIL, "exp"+getconfig("alerttext_branches")+"is not matching my alert"+driver.switchTo().alert().getText());
		}

		*/
	}


	public void Roles() {
		Roles.NewRole().click();
	}


	public void NewRole(String rolename,String roledesc,String roletype) {

		Roles.NewRole().click();
		NewRole.RoleName().sendKeys("rolename");
		NewRole.RoleDesc().sendKeys("roledesc");
		Generic.dropdown_handle(NewRole.RoleType()).selectByVisibleText(getconfig("roletype"));
		NewRole.Submit().click();
		
		if(Validation.isAlertPresent(getconfig("alerttext_newrole")))
		{
			test.log(LogStatus.PASS,"exp"+getconfig("alerttext_newrole")+"is matching with my alert"+driver.switchTo().alert().getText());
			
		}
		else
		{
			Validation.screenshort("newrole");
			test.log(LogStatus.FAIL,"exp"+getconfig("alerttext_newrole")+"is not matching with my alert "+driver.switchTo().alert().getText());
			
		
		}
		Alert alert = driver.switchTo().alert();
		alert.accept();

	}

	public void Users() {
		Admin.Users().click();
		Generic.dropdown_handle(Users.Branch()).selectByVisibleText(getconfig("branch_user"));
		Generic.dropdown_handle(Users.Roles()).selectByVisibleText(getconfig("roles_user"));
		Users.Search().click();
	}

	public void NewUser(String cname,String user_name,String login_pwd,String transaction_pwd) {

		Users.NewUser().click();
		Generic.dropdown_handle(NewUser.Role()).selectByVisibleText(getconfig("Roles_user"));
		Generic.dropdown_handle(NewUser.Branch()).selectByVisibleText(getconfig("branchs_user"));
		Generic.dropdown_handle(NewUser.CustomerId()).selectByVisibleText("cid");
		NewUser.CustomerName().sendKeys("cname");
		NewUser.UserName().sendKeys("user_name");
		NewUser.LoginPassword().sendKeys("login_pwd");
		NewUser.TransactionPassword().sendKeys("transaction_pwd");
		NewUser.Submit().click();

	}

	public void Employee() {

		Admin.Employee().click();

	}


	public void NewEmployee(String Empname,String loginpass) {
		Employee.NewEmployee().click();
		NewEmployee.EmployerName().sendKeys("Empname");
		NewEmployee.LoginPassword().sendKeys("loginpass");
		Generic.dropdown_handle(NewEmployee.Role()).selectByVisibleText(getconfig("roleemp"));
		Generic.dropdown_handle(NewEmployee.Branch()).selectByVisibleText(getconfig("branchemp"));
		NewEmployee.Submit().click();

	}
}
