package com.pagelibrary.com.ranfordbank;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import excel.Excel_Class;

public class TestExecution extends Repository{
	@Parameters({"browser"})
	@Test(priority=-1)
	
		public void verify_launch(String brow) throws Exception
		{
			
			launch(brow);
		}

	@Test
	public void verify_login()
	{
		
		login();
	
	}
	@Test(priority=2)
	public void verify_Branches()
	{
		
		Branches();
	
	}
	@Test(priority=3)
	public void verify_srch_branches()
	{
		srch_branches();
		
	
	}
	
	
	@Test(priority=4)
	public void verify_new_branch()
	{
		Excel_Class.excelconnection("data.xls", "Sheet1");
		Excel_Class.outputexcelconnection("data.xls", "output.xls", "Sheet1");
		int c= Excel_Class.getcolumnscount();
		for(int r=1;r<Excel_Class.getrowcount();r++)
		{
			
			new_branch(Excel_Class.readdata(0, r),Excel_Class.readdata(1, r),Excel_Class.readdata(2, r),Excel_Class.readdata(3, r),Excel_Class.readdata(4, r),Excel_Class.readdata(5, r),Excel_Class.readdata(6, r),Excel_Class.readdata(7, r),Excel_Class.readdata(8, r));
			
			String text=driver.switchTo().alert().getText();
			
			driver.switchTo().alert().accept();
			
			if(text.contains("created successfuly"))
			{
				Excel_Class.writedata(c++, r, text);
				c--;
			}
			else if((text.contains("Already Exists")))
			{
				Excel_Class.writedata(c++, r, text);
			}
			else
			{
				Excel_Class.writedata(c++, r, "n/a");
				c--;
			}
		}
		Excel_Class.savewrkbook();
		
	
	}
}

	/*
	@Test(priority=5)
	public void verify_Roles()
	{
		Roles();
		
	}
	@Test(priority=6)
	public void verify_NewRole()
	{
		for(int r=1;r<Excel_Class.getrowcount();r++)
		{
			NewRole(Excel_Class.readdata(0, r),Excel_Class.readdata(1,r),Excel_Class.readdata(2, r));
		}

	
	
	
	}
	@Test(priority=7)
	public void verify_Users()
	{
		Users();
		
	
	}
	
	@Test(priority=8)
	public void verify_NewUser()
	{
		
		
			for(int r=1;r<Excel_Class.getrowcount();r++)
			{
				NewUser(Excel_Class.readdata(0, r),Excel_Class.readdata(1,r),Excel_Class.readdata(2, r));
			}
		
	}
	@Test(priority=9)
	public void verify_Employee()
	{
		Employee();
		
	}
	@Test(priority=10)
	public void verify_NewEmployee()
	{

		{
			for(int r=1;r<Excel_Class.getrowcount();r++)
			{
				NewEmployee(Excel_Class.readdata(0, r),Excel_Class.readdata(1,r),Excel_Class.readdata(2, r));
			}
		
		
	}
	
	


	

	
}
	*/
