package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
		WebDriver driver;
		public LoginPage(WebDriver driver) {
			this.driver = driver;
		}
		
		
		By email = By.id("email");
		By pass = By.id("pass");
		By login = By.name("login");
		
		
		public void enterEmail(String emaildata)
		{
			driver.findElement(email).sendKeys(emaildata);
		}
	
		public void enterPass(String passdata)
		{
			driver.findElement(pass).sendKeys(passdata);
		}
		
		public void clickLogin()
		{
			driver.findElement(login).click();	
		}
		
}
