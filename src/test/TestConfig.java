package test;

import data.UserDetails;
import defined.Functions;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import repo.PageSections;

import pages.CreateAccount;
import pages.Home;
import pages.MyAccount;

import pages.AllProductsWomen;
import pages.Authentication;

import config.DataConfig;
import config.PageObjectConfig;
import config.ExcelConfig;
import config.PropertyConfig;


/**
 * Created by User on 7/21/2017.
 */
public class TestConfig {


	protected WebDriver driver;

    protected PropertyConfig pc;
    protected UserDetails ud;
    protected ExcelConfig ec;
    protected DataConfig dc;
    protected Functions funcs;
    
    
    protected Home hp;
    protected Authentication ap;
    protected CreateAccount cap;
    protected MyAccount map;
    protected AllProductsWomen apw;
    
    
     
    protected String email = "";
    protected String username = "";
    protected String firstname = "";
    protected String lastname = "";
    protected String password = "";
    protected String address = "";
    protected String city = "";
    protected String postal = "";
    protected String mobile = "";
    protected String alias = "";
     

    
    @BeforeTest
    public void setup(){
    	
     	  pc = new PropertyConfig();
          ud = new UserDetails();
          ec = new ExcelConfig();
          dc = new DataConfig();
          funcs = new Functions();
         
          
          driver = PropertyConfig.getChromeDriver();
          driver.get(PropertyConfig.getAppUrl());
          

    }

   
    
    @AfterTest
    public void closeBrowser(){
       driver.quit();
    }
    
    
    

}


