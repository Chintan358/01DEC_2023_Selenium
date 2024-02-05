package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.Driverconnection;

public class T001_Table1 {
	public static void main(String[] args) {
		
		
		WebDriver driver = Driverconnection.connect("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		
//		String data =  driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[5]/td[2]")).getText();
//		System.out.println(data);
		
		
		
//		List<WebElement> alldata = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
//		for(WebElement data : alldata)
//		{
//			System.out.println(data.getText());
//		}
		
		
		List<WebElement> row = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		
		List<WebElement> head = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[1]/th"));
		for(WebElement h : head)
		{
			System.out.print(h.getText()+" ");
		}
		System.out.println();
		for(int i=2;i<=row.size();i++)
		{
			List<WebElement> cols = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr["+i+"]/td"));
			for(WebElement c  :cols)
			{
				System.out.print(c.getText()+" ");
			}
			System.out.println();
		}
	
	}
}
