package modules;

import com.cucumber.pagelibrary.com.Admin;

public class Admin_m {
	
	public static void branch()
	{
		if(Admin.Branches.isDisplayed())
		{
			System.out.println("branchpage will display");
			
			Admin.Branches.click();
		}
	}

}
