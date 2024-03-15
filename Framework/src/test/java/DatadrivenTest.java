
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import util.Driverconnection;

public class DatadrivenTest {
	
	WebDriver driver = null;
	
	@BeforeClass
	public void setup()
	{
		 driver = Driverconnection.connect("https://www.fb.com");
	}
	
	@Test(dataProvider = "dp")
	public void login(String emaildata, String passdata)
	{
		
		WebElement email = driver.findElement(By.id("email"));
		WebElement pass = driver.findElement(By.id("pass"));
		email.clear();
		email.sendKeys(emaildata);
		pass.clear();
		pass.sendKeys(passdata);
		
	}
	
	@DataProvider(name="dp")
	public Object[][] getData()
	{
		
		
		ExcellReader rd = new ExcellReader("C:\\Users\\pc\\Desktop\\Test\\mytest.xlsx","login");
		int row = rd.rowCount();
		int col = rd.colCount();
		
		Object obj[][] = new Object[row-1][col];
		
		for(int i=1;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				String data = rd.getData(i, j);
				obj[i-1][j] = data;
			}
		}
		
		return obj;
		
	}
	
	@AfterClass
	public void finish()
	{
		
		driver.quit();
	}
}
