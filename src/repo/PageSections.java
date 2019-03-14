package repo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import config.PageObjectConfig;


/*
Header elements

	1. Click Website Logo
	2. WOMEN, DRESSES and T-SHIRTS tab
	3. Search field
	4. Cart button
	5. Contact us
	6. Sign in link
	7. GET SAVINGS NOW button
	
	
Product Listing Page elements
	1. Category Dropdown
	2. CATALOG checkboxes
	3. INFORMATION dropdowns
	4. Sort By dropdown
	5. View - by Grid, by List
	6. Compare button
	7. List of Products - to be hovered to display Quick View and Add To Cart button

*/



public class PageSections extends PageObjectConfig {
	
	
	@FindBy(how=How.XPATH, using="//*[@id=\"header_logo\"]/a/img")
	public static WebElement logo;
	
	
	@FindBy(how=How.XPATH, using="//*[@id=\"block_top_menu\"]/ul/li[1]/a")
	public static WebElement women_tab;
	
	


	public PageSections(WebDriver driver) {
		super(driver);
		
	}
	

	public static class Page_Header{
		
	
		public static WebElement website_logo(WebDriver driver) {
			
			try {
				init_wdw();
				wdw.until(ExpectedConditions.visibilityOf(logo));
				
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
			return logo;
		}
		
		
		public static WebElement women_tab(WebDriver driver) {
			
			
			try {
				init_wdw();
				wdw.until(ExpectedConditions.visibilityOf(women_tab));
				
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
			
			
			return women_tab;
			
		}
		
		
		
		
		
	}
	
	
	
	public static class Product_Listing{
		
		
	}
	
	
	public static class Page_Footer{
		
		
	}
	
	
	

}
