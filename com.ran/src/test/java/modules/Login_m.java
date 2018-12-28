package modules;

import com.cucumber.pagelibrary.com.Loginpage;

public class Login_m {
	
	public static void login(String u, String p)
	{
		Loginpage.username.sendKeys(u);
		Loginpage.password.sendKeys(p);
		Loginpage.Loginbutton.click();
	}

}
