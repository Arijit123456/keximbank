package testbase;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Base {

	public static WebDriver driver;
	
  static Properties  property;
	
	public static void loadproperty()
	{
	    	try {
				File f=new File(".\\src\\main\\java\\configuration\\OR.properties");
				
				FileReader  fr=new FileReader(f);
				
				 property=new Properties();
				
				property.load(fr);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
	}
	public static  By  getelement(String key)
	{
		loadproperty();
		By loc=null;
		 String value= property.getProperty(key);
		 
		          String loctype=  value.split(":")[0];
		          String locvalue=  value.split(":")[1];
		          
		          switch(loctype)
		          {
		          case "id":
		        	  loc=By.id(locvalue);
		        	  break;
		          case "name":
		        	  loc=By.name(locvalue);
		        	  break;
		          case "xpath":
		        	  loc=By.xpath(locvalue);
		        	  break;
		          }
				return loc;
	}
	
	public static void loadproperty2()
	{
	    	try {
				File f=new File(".\\src\\main\\java\\configuration\\config.properties");
				
				FileReader  fr=new FileReader(f);
				
				 property=new Properties();
				
				property.load(fr);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
	}
	public static  String  getconfig(String key)
	{
		loadproperty2();
		 String x=   property.getProperty(key);
		return x;
	}
	
	
	
	
	
}
