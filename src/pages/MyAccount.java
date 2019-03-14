package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;


import config.PageObjectConfig;

public class MyAccount extends PageObjectConfig {
	
	
	@FindBy(how=How.XPATH, using="/html/body/div/div[2]/div/div[3]/div/div/div[1]/ul/li[4]/a/span")
	private WebElement my_personal_info_btn;
	
	
	@FindBy(how=How.LINK_TEXT, using="Sign out")
	private WebElement sign_out_link;
	
	
	
	
	public MyAccount(WebDriver driver){
		super(driver);
	}
	
	
	public boolean is_in_my_account(){
		
		 //init_wdw();               
         Assert.assertEquals("My account - My Store", get_page_title());
         
        
         return true;
	}
	
	
	public Authentication logout() throws InterruptedException {
		
	    sign_out_link.click();
	    Thread.sleep(3000);
	    
		return new Authentication(driver);
	}
	
	
	
	
	

	
	
	
}
