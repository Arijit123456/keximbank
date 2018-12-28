package step__definition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.pagelibrary.com.Admin;
import com.cucumber.pagelibrary.com.Loginpage;
import com.cucumber.pagelibrary.com.NewBranch;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import modules.Admin_m;
import modules.Login_m;
import modules.NewBranch_m;

public class Defination {
WebDriver driver;

public Defination() {
	this.driver=Hooks.driver;
}
	@Given("^launch the site$")
	public void launch_the_site(String Url) throws Throwable {
	    driver.get("//srssprojects.in/home.aspx");
	}

	@When("^Enter the data with \"([^\"]*)\" data and password with \"([^\"]*)\" and click on login btn$")
	public void Enter_the_data_with_data_and_password_with_and_click_on_login_btn(String user, String pass) throws Throwable {
	  
		PageFactory.initElements(driver, Loginpage.class);
		Login_m.login(user, pass);
		
	}

	@Then("^Branches shold be displayed$")
	public void Branches_shold_be_displayed() throws Throwable {
	   
		PageFactory.initElements(driver, Admin.class);
		   Admin_m.branch();
		
	}
	@Then("^click on newbranch and create the branch with \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void click_on_newbranch_and_create_the_branch_with_and_and_and_and_and(String branch_name, String address, String zipcode, String country, String state, String city) throws Throwable {
	
	    PageFactory.initElements(driver, NewBranch.class);
	    
	    NewBranch_m.NewBranch(branch_name,address,zipcode,)
	    
	}


	@Then("^close  site$")
	public void close_site() throws Throwable {
		driver.close();
	}


	
}
