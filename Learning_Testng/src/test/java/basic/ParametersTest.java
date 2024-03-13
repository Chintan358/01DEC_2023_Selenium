package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import util.Driverconnection;

public class ParametersTest {
	
	@Parameters({"uname","pass"})
	@Test
	public void login(String username, String password)
	{
		WebDriver driver = Driverconnection.connect("https://www.fb.com");
		
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
	}
}
