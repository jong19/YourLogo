package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import repo.PageSections;
import config.PageObjectConfig;

public class AllProductsWomen extends PageObjectConfig{
	

	

	public AllProductsWomen(WebDriver driver) {
		super(driver);
		
	}
	
	
	
	public boolean is_in_all_women_products(){
	    	
	      Assert.assertEquals(get_page_title(), get_page_title());
	        
	      return true;
	}
	
	
	

}
