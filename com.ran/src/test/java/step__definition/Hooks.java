package step__definition;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	
	public static WebDriver driver;
	
	@Before
	public void launchbrowser()
	{
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	@After
	public void takescreen(Scenario s)
	{
		if(s.isFailed())
		{
			TakesScreenshot screen=(TakesScreenshot)driver;
			byte[] bi=screen.getScreenshotAs(OutputType.BYTES);
			
			s.embed(bi, "image/png");
		}
	}
	
}