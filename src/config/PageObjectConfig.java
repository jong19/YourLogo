package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;



public class PageObjectConfig{
	
	
	protected static WebDriver driver;
	protected static WebDriverWait wdw; 
	
	protected static final long timeInSeconds = 30;
	protected String page_title;
	
	
   
	public PageObjectConfig(WebDriver driver){
		
	       PageObjectConfig.driver = driver;
	 
	       PageFactory.initElements(driver, this);
	      
	     
	}
	
	
	

	public static WebDriverWait init_wdw(){
		
		
		try{
			
			wdw = new WebDriverWait(driver, timeInSeconds);
			System.out.println("get_wdw() => " + wdw);
					
		}
		catch(Exception e){
			System.out.println("========= ERROR UNDER get_wdw() =============");
			e.printStackTrace();
		}
		
		return wdw;
	}
	
	
	
    public static WebDriver get_driver() {
    	return driver;
    }
    
	

	public String get_page_title(){
		
		page_title = driver.getTitle();
		
		return page_title;
	}
	
	
	  
    public void go_to_home(){
		
		driver.get(PropertyConfig.getAppUrl());
		
	}
    
    

    

	
	
	
	


	
}

