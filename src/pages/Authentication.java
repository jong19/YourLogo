package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import config.PageObjectConfig;


/**
 * Created by User on 7/17/2017.
 */
public class Authentication extends PageObjectConfig {
	

    @FindBy(how= How.ID, using="email_create")
    private WebElement create_email;
    
    @FindBy(how=How.ID, using="SubmitCreate")
    private WebElement create_account_btn;
    
    
    
    @FindBy(how= How.ID, using="email")
    private WebElement login_email;
    
    @FindBy(how=How.ID, using="passwd")
    private WebElement login_password;
    
    @FindBy(how=How.ID, using="SubmitLogin")
    private WebElement signin_btn;
    
    


    public Authentication(WebDriver driver){
        super(driver);

    }


    public boolean is_in_authentication(){
    	
    	 //init_wdw();   
         Assert.assertEquals("Login - My Store", get_page_title());
        
        return true;
    }

    
    // create

    public Authentication enter_email_address(String email){

        create_email.sendKeys(email);
        
        System.out.println("Email 1 => " + email);
        
        return this;

    }
    
    public CreateAccount goto_create_account() throws InterruptedException{
    	
    	create_account_btn.click();
    	Thread.sleep(3000);
    	
    	return new CreateAccount(driver);
    	
    	
    }
    
    
    // login
    
    
   public Authentication enter_login_email(String email){

       login_email.sendKeys(email);
       
       System.out.println("Login email is > "  + email);
          
       return this;

   }
   
   public Authentication enter_login_password(String password){
   	
	   login_password.sendKeys(password);
	   
	   System.out.println("Login email is > "  + password);
       
       return this;
   	
  
   }
   
   
   public MyAccount go_to_myaccount() throws InterruptedException {
	   
	   signin_btn.click();
	   
	   Thread.sleep(3000);
	   
	   return new MyAccount(driver);
   }




}
