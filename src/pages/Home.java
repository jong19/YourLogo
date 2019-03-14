package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import repo.PageSections;

import org.junit.Assert;
import config.PageObjectConfig;


/**
 * Created by User on 7/14/2017.
 */

public class Home extends PageObjectConfig {


    @FindBy(how=How.LINK_TEXT, using="Sign in")
    private WebElement signin_link;
    
    
    // Women tab - When user is in the Home page then decided to go to WOMEN page
    
	@FindBy(how=How.XPATH, using="//*[@id=\"block_top_menu\"]/ul/li[1]/a")
	public static WebElement women_tab;
    
 


    public Home(WebDriver driver){
           super(driver);  
    }
    
    
    
   
    public void click_website_logo() {
    	

    	new PageSections(driver);
    	PageSections.Page_Header.website_logo(driver).click();
    	System.out.println("Website Logo clicked !");
   	
    }

    

	public boolean is_in_home(){
    	
    	try{
    		
    		
            //init_wdw();           
            Assert.assertEquals("My Store", get_page_title());
         
            
        }
    	
    	catch(Exception e){
    		System.out.println("============ ERROR UNDER locate_signin_link() ==============");
    		e.printStackTrace();
    	}
    	
    	return true;
    	
    }
	
	


    
    // still under the Landing Page. When user is about to click the Signin link
    
    public Authentication goto_authentication() throws InterruptedException{

        signin_link.click();
        System.out.println("Sign In link clicked");
        Thread.sleep(3000);
        
        return new Authentication(driver);

    }
    
    
    
    
    // from Homepage, if user wants to click and go to Womens page
    public AllProductsWomen goto_all_products_women() {
    	
    	new PageSections(driver);
    	
    	PageSections.women_tab.click();
    	
    	System.out.println("WOMEN tab clicked !");
    	
    	return new AllProductsWomen(driver);
    	
    	
    	
    }









}
