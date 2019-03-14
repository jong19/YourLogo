package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import config.PageObjectConfig;


public class CreateAccount extends PageObjectConfig {
	
	@FindBy(how=How.CLASS_NAME, using="page-heading")
	private WebElement page_heading;
	
	@FindBy(how=How.ID, using="id_gender1")
	private WebElement title_mr;
	
	@FindBy(how=How.ID, using="customer_firstname")
	private WebElement custo_fname;
	
	@FindBy(how=How.ID, using="customer_lastname")
	private WebElement custo_lname;
	
	@FindBy(how=How.ID, using="email")
	private WebElement em;
	
	@FindBy(how=How.ID, using="passwd")
	private WebElement pword;
	
	@FindBy(how=How.ID, using="days")
	private WebElement days;
	
	@FindBy(how=How.ID, using="months")
	private WebElement months;
	
	@FindBy(how=How.ID, using="years")
	private WebElement years;
	
	@FindBy(how=How.ID, using="firstname")
	private WebElement address_firstname;
	
	@FindBy(how=How.ID, using="lastname")
	private WebElement address_lastname;
	
	@FindBy(how=How.ID, using="address1")
	private WebElement address1;
	
	@FindBy(how=How.ID, using="city")
	private WebElement city;
	
	@FindBy(how=How.ID, using="id_state")
	private WebElement states;
	
	@FindBy(how=How.ID, using="postcode")
	private WebElement postal;
	
	@FindBy(how=How.ID, using="id_country")
	private WebElement countries;
	
	@FindBy(how=How.ID, using="phone_mobile")
	private WebElement mobile_phone;
	
	@FindBy(how=How.ID, using="alias")
	private WebElement alias_address;
	
	@FindBy(how=How.ID, using="submitAccount")
	private WebElement register_btn;
	
	
	public String firstname = "";
	public String lastname = "";
	public String email = "";
	
	

	public CreateAccount(WebDriver driver){
		super(driver);
	}
	
	
	public boolean is_in_create_account(){
		
		// init_wdw();   
         Assert.assertEquals("Login - My Store", get_page_title());
        
         return true;
			
	}
	
	
	public CreateAccount select_title(){
		
		init_wdw().until(ExpectedConditions.visibilityOf(title_mr));
		title_mr.click();
		
		return this;
	}
	
	
	public CreateAccount enter_firstname(String fname){
		
		firstname = fname;
		
		custo_fname.sendKeys(firstname);
		
		System.out.println("----------------------------------");
		System.out.println("Customer Firstname => " + firstname);
		
		return this;
	}
	
	
	public CreateAccount enter_lastname(String lname){
		
		lastname = lname;
		
		custo_lname.sendKeys(lastname);
		
		System.out.println("Customer Lastname => " + lastname);
		
		return this;
	}
	
	
	public CreateAccount enter_email(String email){
		
		String pasted_email = em.getAttribute("value");
		
		Assert.assertEquals(pasted_email, email);
		
		System.out.println("Email 2 => " + pasted_email);
		
		
		return this;
	}
	
	
	public CreateAccount enter_password(String pass) throws InterruptedException{
		
		pword.sendKeys(pass);
		
		System.out.println("Password => " + pass);
		
		
		return this;
	}
	
	
   public CreateAccount select_birthdate() throws InterruptedException{
	   

	   
	   Select day = new Select(days);
	   Select month = new Select(months);
	   Select year = new Select(years);
	   
	   
	   /*
	    
	   List<WebElement> day_list = day.getOptions();
	   
	
	    for(WebElement options : day_list){
	    	String i = options.getText();
	    	System.out.println(i);
	    }
		
	 */
	   
	  String d = "21";
	  String m = "5";
	  String y = "1990";
	   
	  day.selectByValue(d);
	  
      month.selectByValue(m);
	   
	  year.selectByValue(y);
	   
	 System.out.println("Birthdate => " + d + "/" + m + "/" + y);
	 

	 return this;

	    
	    
	    
	}
   
   
   // for address
   
   public CreateAccount enter_address_firstname(){
		
	    String pasted_firstname = address_firstname.getAttribute("value");
		Assert.assertEquals(pasted_firstname, firstname);
		System.out.println("Address Firstname => " + pasted_firstname);
	   
		return this;
 	}
   
   
   public CreateAccount enter_address_lastname(){
	   
	    String pasted_lastname = address_lastname.getAttribute("value");
		Assert.assertEquals(pasted_lastname, lastname);	
		System.out.println("Address Lastname => " + pasted_lastname);
		
		return this;
	}
   
   public CreateAccount enter_address(String address){
	   
	    address1.sendKeys(address);
	    System.out.println("Address => " + address);
		
	    return this;
 	}
   
   
   public CreateAccount enter_city(String cty){
	   
	    city.sendKeys(cty);
	    System.out.println("City => " + cty);
		
	    return this;
	}
 	
 
   public CreateAccount select_state(){
	   
	    Select state = new Select(states);
	    
	    String st = "Delaware";
	    
	    state.selectByVisibleText(st);
	    
	    System.out.println("State => " + st);
	    
	    
	    return this;
 	}
   
   
   public CreateAccount enter_postal(String pstl){
	   
	    postal.sendKeys(pstl);
	    
	    System.out.println("Postal => " + pstl);
		
	    return this;
	}
   
   
   public CreateAccount select_country(){
	   
	    Select country = new Select(countries);
	    
	    String cntry = "United States";
	    
	    
	    country.selectByVisibleText(cntry);
	    
	    System.out.println("Country => " + cntry);
		
	    return this;
	}
   
   
   
   public CreateAccount enter_mobile_number(String phone){
		
	    mobile_phone.sendKeys(phone);
	    
	    System.out.println("Mobile Phone => " + phone);
	   
	    return this;
 	}
    
   
   public CreateAccount enter_reference(String alias){
		
	    alias_address.clear();
	   
	    alias_address.sendKeys(alias);
	    
	    System.out.println("Address Alias => " + alias);
	   
	    return this;
 	}
   
   
   public MyAccount goto_my_account() throws InterruptedException{
	   
	    register_btn.click();
	    Thread.sleep(3000);
		
 		return new MyAccount(driver);
 	}
    
 	
  	
	
	
	

}
