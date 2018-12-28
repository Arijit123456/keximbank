package validation;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;

import testbase.Base;

public class Validation extends Base{

	public static boolean isTextPresent(String data)
	{
	boolean b=	driver.getCurrentUrl().contains(data);
		return b;
	}
	
	public static boolean isTitlePresent(String data)
	{
	boolean b=	driver.getTitle().contains(data);
		return b;
	}
	
	public static boolean isAlertPresent(String data)
	{
	boolean b=	driver.switchTo().alert().getText().contains(data);
		return b;
	}
	public static void screenshort(String screenshortname)
	{
		try {
			Robot r=new Robot();
			BufferedImage bi=r.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));	
			
			ImageIO.write(bi, "png", new File("./screen/"+screenshortname+".png"));
		} catch (Exception e) {
			
			e.printStackTrace();
		} 
	}
	
	
	
	
	
	
}



