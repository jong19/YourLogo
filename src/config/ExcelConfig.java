package config;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelConfig {
	
	public static FileInputStream fis;
	public static FileOutputStream fos;
	public static XSSFWorkbook wb;
	public static XSSFSheet sh;
	public static XSSFRow row;
	public static XSSFCell cell;
	
	int lastRow = 0;
	
    	
	public ExcelConfig(){
		
		
		  try {
			fis = new FileInputStream(PropertyConfig.getExcelPath());
			wb = new XSSFWorkbook(fis);
		   } 
		  
		   catch (Exception e) {
			System.out.println("Error at ExcelConfig " + e.getMessage());
		   }
		
		
	}
	
	
	public int getSheet(int sheetIndex){
		  sh = wb.getSheetAt(sheetIndex);
		  return sheetIndex;
		 
	}
	
	public int getCurrentRow(){
		
        int currRow = sh.getLastRowNum();
        row = sh.getRow(currRow);
        System.out.println("Current Row is: " + currRow);
		return currRow;
		
		
	}
	
	
	public int getNextRow(){
		  
		  lastRow = sh.getLastRowNum();			  
          lastRow++;
		  System.out.println("Last Row Number is: " + lastRow);
		  row = sh.createRow(lastRow);
		  
		  return lastRow;
		  	
	}
	
	public int getAllRowCount(){
		
		int r = sh.getLastRowNum();
		r++;
		System.out.println("Number of rows in sheet: " + lastRow);

		return r;
	}
	
	
		
	public void addNewPassword(String pw, int colNo){
		  cell = row.createCell(colNo);
		  cell.setCellValue(pw);
		  	
	}
	
	
	public String readData(int rowNo, int colNo){
		String entry = sh.getRow(rowNo).getCell(colNo).getStringCellValue();
		return entry;
		
	}
	

	
	public void closeFile(){
		try {
			 fos = new FileOutputStream(PropertyConfig.getExcelPath());
			 wb.write(fos);
			 fos.close();
		} 
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		 
		
	}
				
		

}
