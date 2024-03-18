package com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyDemo {
	
	public static void main(String[] args) {
		
		
		try {
			FileInputStream fis = new FileInputStream("C:\\Chintan_work\\java\\04_Dec_Selenium\\Learning_PageObject\\src\\test\\resources\\data.properties");
			Properties prop  = new Properties();
			
			prop.load(fis);
			
			String name =  prop.getProperty("name");
			System.out.println(name);
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
