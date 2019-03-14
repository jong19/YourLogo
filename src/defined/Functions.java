package defined;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;

import test.TestConfig;
import config.ExcelConfig;

public class Functions extends TestConfig{
	
	
	// function that adds firstname, lastname, email and password to Excel
	



	public void add_new_user(String details[]){
		
	    String fn = details[0];
	    String ln = details[1];
	    String em = details[2];
	    String pw = details[3];
	    
	    
		ExcelConfig.cell = ExcelConfig.row.createCell(0);
		ExcelConfig.cell.setCellValue(fn);
		
		ExcelConfig.cell = ExcelConfig.row.createCell(1);
		ExcelConfig.cell.setCellValue(ln);
		
		ExcelConfig.cell = ExcelConfig.row.createCell(2);
		ExcelConfig.cell.setCellValue(em);

		ExcelConfig.cell = ExcelConfig.row.createCell(4);
		ExcelConfig.cell.setCellValue(pw);
		
		
		
	}
	
	

	
	

}
