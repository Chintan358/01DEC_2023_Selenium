package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory {
	
	WebDriver driver;
	public LoginPageFactory(WebDriver driver) {
			this.driver = driver;
		 PageFactory.initElements(this.driver, this);
	}
	
	@FindBy(id="email")
	WebElement email;
	
	@FindBy(id = "pass")
	WebElement pass;
	
	@FindBy(name="login")
	WebElement login;
	
	public void enterEmail(String emaildata)
	{
	   email.sendKeys(emaildata);
	}
	
	public void enterPass(String passdata)
	{
		pass.sendKeys(passdata);
	}
	
	public void clickLogin()
	{
		login.click();	
	}
	
}
