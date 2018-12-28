package modules;
import com.cucumber.pagelibrary.com.NewBranch;

public class NewBranch_m {
	public void NewBranch(String branch_name, String address, String zipcode, String country, String state, String city ) 
	{
		NewBranch.NewBranch.click();
	    NewBranch.BranchName.sendKeys(branch_name);
	    NewBranch.Address1.sendKeys(address);
	    NewBranch.ZipCode.sendKeys(zipcode);
	    NewBranch.Country.sendKeys(country);
	    NewBranch.State.sendKeys(state);
	    NewBranch.City.sendKeys(city);
	    NewBranch.Submit_btn.click();
	
	
	}
	

}
