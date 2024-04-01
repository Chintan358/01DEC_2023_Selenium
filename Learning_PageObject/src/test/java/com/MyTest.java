package com;

import org.openqa.selenium.WebDriver;

import pageobject.LoginPage;
import pageobject.LoginPageFactory;
import util.Driverconnection;

public class MyTest extends Driverconnection {
	
	public void login()
	{
		 driver = connect();
		//LoginPage login  = new LoginPage(driver);
		
		LoginPageFactory login = new LoginPageFactory(driver);
		
		login.enterEmail("test@gmial.com");
		login.enterPass("test");
		login.clickLogin();
		
	}
}
