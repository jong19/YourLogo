package test;



import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import config.ExcelConfig;
import data.UserDetails;
import pages.CreateAccount;
import pages.Home;
import pages.MyAccount;
import repo.PageSections;
import pages.AllProductsWomen;
import pages.Authentication;


/**
 * Created by User on 7/12/2017.
 */


public class YourLogoTest extends TestConfig{
	


	@Test (priority = 1, enabled = true)
    public void register() throws InterruptedException{
		
		
      	hp = new Home(driver);
        ap = new Authentication(driver);
        cap = new CreateAccount(driver);
        map = new MyAccount(driver);
        apw = new AllProductsWomen(driver);
          
    
 
        firstname = ud.getFirstname();
     	lastname = ud.getLastname();
     	
     	
         username = dc.getUsername();
         email = dc.getEmail();
         password = dc.getPassword();
        
       // username = pc.getUsernameFromProperty();
       // email = pc.getEmailFromProperty();
        
     
        address = ud.getAddress();
        city = ud.getCity();
        postal = ud.getPostal();
        mobile = ud.getPhone();
        alias = ud.getAlias();
       
        
     
        // Website is launched. User is redirected to the Home page.

        hp.is_in_home();
        hp.goto_authentication();
        
        
        // User is redirected to Authentication page. 
        ap.is_in_authentication();
        ap.enter_email_address(email);
        ap.goto_create_account();
        
        
        // User in registration page.
        cap.is_in_create_account();
       // cap.select_title();
        cap.enter_firstname(firstname);
        cap.enter_lastname(lastname);
        cap.enter_email(email);
        cap.enter_password(password);
        cap.select_birthdate();
        cap.enter_address_firstname();
        cap.enter_address_lastname();
        cap.enter_address(address);
        cap.enter_city(city);
        cap.select_state();
        cap.enter_postal(postal);
        cap.select_country();
        cap.enter_mobile_number(mobile);
        cap.enter_reference(alias);
        cap.goto_my_account();
        
        
        // entered user info saved into excel
        
        ec.getSheet(0);
		ec.getNextRow();
		
		String details[] = {firstname, lastname, email, password};
		funcs.add_new_user(details);
	    ec.closeFile();
        
	    
	    // after successful registration, user is redirected to My Account page.
        map.is_in_my_account();
        map.logout();
        
        // user will logout and is redirected to Authentication page.
        ap.is_in_authentication();
     
         
    }
    
    
    
    
    @Test (dataProvider="loginCredits" , priority=2, enabled = true)
    public void login(String email, String password) throws InterruptedException {
    	
        // User will now login with the newly registered email and password.
    	    
    	 //  hp = new Home(driver);
    	 //  ap = new Authentication(driver);
    	 //  map = new MyAccount(driver);
    	   
    	
    	   hp.click_website_logo();
    	   hp.is_in_home();
    	   
    	   hp.goto_authentication();
    	   
    	   ap.is_in_authentication();
    	   ap.enter_login_email(email);
    	   ap.enter_login_password(password);
    	   ap.go_to_myaccount();
    	   
    	   map.is_in_my_account();
    	   map.logout();
    	   
    	   ap.is_in_authentication();
    	   hp.click_website_logo();
    	   
    	
  
    	
    }
    
    
	
	@DataProvider(name = "loginCredits")
	  public Object[][] loginDetails(){
		  
		  Object [][] loginData = null;
		  String email = "";
		  String password = "";

		 
		  try{
			  ec.getSheet(0);
			  int the_rows = ec.getAllRowCount();
			  
			  loginData  = new Object[1][2];
			  
		
			  for(int i=the_rows-1; i<the_rows; i++){
				   email = ec.readData(i, 2);
				   password = ec.readData(i, 4);
				  
				  loginData[i-i][0] = email;
				  loginData[i-i][1] = password;


			  }
			
		  }
		  catch(Exception e){
			  e.printStackTrace();
		  }
			  
		return loginData;
		  
		  
	  }
	
	
	@Test (priority = 3, enabled = false)
	public void order_product() {
		
		
		apw.is_in_all_women_products();
		hp.goto_all_products_women();
		
		
		
	
		

		
		
	}



}
