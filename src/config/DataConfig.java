package config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

//import org.apache.commons.lang3.RandomStringUtils;

public class DataConfig{
	
	public static Properties property;
	public static File property_file;
	public static FileInputStream fis;
	public static FileOutputStream fos;
	
	
	
	public DataConfig(){
		
		 
		try {
			
			property_file = new File("D:\\NINZO\\RC_automation_tests2\\YourLogo\\src\\files\\Repo.property");	
		    			
			fis = new FileInputStream(property_file);
			property = new Properties();
			property.load(fis);
			fis.close();
			
			
			
			
			 	
		} 
		catch (Exception e) {
			System.out.println("Error at ConfigReader " + e.getMessage());
		}
		
	
	}
	
	
	

	
	public String getEmail(){
		
		String new_email = "";
		
		try{
	

			fos = new FileOutputStream(property_file);
			String email_prefix = new String(property.getProperty("user_prefix"));
			String email_count = new String(property.getProperty("user_count"));
			String email_suffix = new String(property.getProperty("email_suffix"));
			
			
	
		    new_email = email_prefix + email_count + email_suffix;

			System.out.println("New Email >>>> " + new_email);
			
			property.store(fos, null);
			
			fos.close();
			
			
			
			
		}
		catch(Exception e){
			System.out.println("Error is " + e.getMessage());
			
		}
		
		return new_email;
		
		
	}
	
	
	
	public String getUsername(){
		
		String new_username = "";
		
		try{
		
		
			fos = new FileOutputStream(property_file);
			String uname_prefix = new String(property.getProperty("user_prefix"));
			String uname_count = new String(property.getProperty("user_count"));
			
			int count_toInt = Integer.parseInt(uname_count);
			int count_incremented = count_toInt + 1;
			
			String count_toString = String.valueOf(count_incremented);
			
			new_username = uname_prefix + count_toString;
			
			System.out.println("New username >>>> " + new_username);
			
			property.setProperty("user_count", count_toString);
			property.store(fos, null);
			fos.close();
			
			
		}
		catch(Exception e){
			System.out.println("Error is " + e.getMessage());
			
		}
		
		return new_username;
		
		
	}
	
	
	public String getPassword() {
		
		
		/*
		
		String new_password = "";
		
		String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String character = "!@#$%^&*-_=+|;:,<.>/?";
		
		new_password = RandomStringUtils.random( 15, upper+character);
		
		
		*/
		
	
		
	
		
		return "F@GBDY%%FFD@21";
	}
	
	

}
