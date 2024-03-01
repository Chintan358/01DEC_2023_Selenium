package com;

import java.util.Arrays;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.Driverconnection;

@RunWith(Parameterized.class)
public class FbLogin {
	
	String uname;
	String pass;
	
	
	public FbLogin(String uname, String pass) {
		super();
		this.uname = uname;
		this.pass = pass;
	}
	
	static WebDriver driver = null;
	
	@BeforeClass
	public static void setup()
	{
		 driver = Driverconnection.connect("https://www.fb.com");
	}

	@Test
	public void loginTest()
	{
		WebElement username =  driver.findElement(By.id("email"));
		username.clear();
		username.sendKeys(uname);
		WebElement password =  driver.findElement(By.id("pass"));
		password.clear();
		password.sendKeys(pass);
	}
	
	@Parameters
	public static List<Object[]> getdata()
	{
		Object obj[][] = new Object[4][2];
		
		obj[0][0] = "xyz@gmail.com";
		obj[0][1] = "xyz123";
		
		obj[1][0] = "abc@gmail.com";
		obj[1][1] = "abx123";
		
		obj[2][0] = "tops@gmail.com";
		obj[2][1] = "tops123";
		
		obj[3][0] = "test@gmail.com";
		obj[3][1] = "test123";
		
		return Arrays.asList(obj);
	}
}
