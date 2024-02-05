package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.Driverconnection;

public class T001_Table2 {
	public static void main(String[] args) {
		
		
		WebDriver driver = Driverconnection.connect("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		
		//Verify that there are only 4 structure values present in the table with Selenium

//		List<WebElement> struct = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr/th"));
//		if(struct.size()==4)
//		{
//			System.out.println("pass");
//		}
//		else
//		{
//			System.out.println("Failed");
//		}
		
				
		//Verify that the 6th row of the table (Last Row) has only two columns with Selenium
//		List<WebElement> a  = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tfoot/tr[1]/th"));
//		List<WebElement> b  = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tfoot/tr[1]/td"));
//
//		System.out.println(a.size()+b.size());
//		if((a.size()+b.size()) == 2)
//		{
//			System.out.println("pass");
//		}
//		else
//		{
//			System.out.println("Fail");
//		}
	
		//Find the tallest structure in the table with Selenium
		
		int max = 0;
		List<WebElement> heights  = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr/td[3]"));
		for(WebElement height : heights)
		{
				String dt = height.getText();
				String dtd = dt.substring(0,dt.length()-1);
				int num = Integer.parseInt(dtd);
				if(num>max)
				{
					max = num;
				}
		}
		System.out.println("MAx height is : "+max);
		
	}
}
