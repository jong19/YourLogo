package config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class PropertyConfig  {

	
	public static Properties property;
	public static File property_file;
	public static FileInputStream fis;
	
	
	
	public static WebDriver driver;
	

     
	public PropertyConfig(){
		
		try {
			
			
			property_file = new File("D:\\NINZO\\RC_automation_tests2\\YourLogo\\src\\files\\Repo.property");	
		
			fis = new FileInputStream(property_file);
			property = new Properties();
			property.load(fis);
			fis.close();
			
			 	
		} catch (Exception e) {
			System.out.println("Error at ConfigReader " + e.getMessage());
		}
	}
	
	
	
	
	
	public static String getAppUrl(){
		
		return property.getProperty("app_url");
	  	
	}
	
	
	public static WebDriver getChromeDriver(){
		
		System.setProperty("webdriver.chrome.driver", property.getProperty("path_chromeDriver"));
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		return driver;
		
		
	}
	
    public static String getGmailUrl(){
    	return property.getProperty("gmail_url");
    	
    	
    }
    
    public static String getLogReport(){
       return property.getProperty("path_extentReport");
    	
    	
    }
    
    public static String getExcelPath(){
    	return property.getProperty("path_excel");
   
    	
    }
    
}

