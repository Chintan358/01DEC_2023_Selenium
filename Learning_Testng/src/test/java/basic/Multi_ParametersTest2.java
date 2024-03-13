package basic;


import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import util.Driverconnection;

public class Multi_ParametersTest2 {
	
	WebDriver driver;
	@BeforeClass
	public void setup()
	{
		 driver = Driverconnection.connect("https://www.fb.com");
	}
	
	@Test(dataProvider = "dp")
	public void login(String username, String password)
	{
		
		WebElement e =  driver.findElement(By.id("email"));
		e.clear();
		e.sendKeys(username);
		WebElement p =  driver.findElement(By.id("pass"));
		p.clear();
		p.sendKeys(password);
		driver.findElement(By.name("login")).click();
		
		assertEquals(driver.getTitle(), "Log in to Facebook1");
		
		driver.navigate().back();
	}
	
	@DataProvider(name="dp")
	public Object[][] getDate()
	{
		Object obj[][] = new Object[4][2];
		
		
		obj[0][0] = "test@gmail.com";
		obj[0][1] = "test";
		
		obj[1][0] = "demo@gmail.com";
		obj[1][1] = "demo";
		
		obj[2][0] = "tech@gmail.com";
		obj[2][1] = "tech";
		
		obj[3][0] = "abc@gmail.com";
		obj[3][1] = "abc";
		
		return obj;
	
	}
	
	@AfterClass
	public void finish()
	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}
}
