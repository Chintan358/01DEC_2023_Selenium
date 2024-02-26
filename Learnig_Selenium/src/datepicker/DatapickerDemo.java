package datepicker;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.Driverconnection;

public class DatapickerDemo {
	public static void main(String[] args) {
		
		WebDriver driver = Driverconnection.connect("https://www.ixigo.com/");
		
		driver.findElement(By.xpath("//p[@data-testid='departureDate']")).click();
		
//		List<WebElement> dates = driver.findElements(By.xpath("//div[@class='react-calendar__month-view__days']/button"));
//		
//		for(int i=1;i<=dates.size();i++)
//		{
//			String str = dates.get(i).getAttribute("disabled");
//			
//			if(str==null)
//			{
//				System.out.println(i);
//				String dt = driver.findElement(By.xpath("//div[@class='react-calendar__month-view__days']/button["+i+"]/abbr")).getText();
//				if(dt.equals("24"))
//				{
//					driver.findElement(By.xpath("//div[@class='react-calendar__month-view__days']/button["+i+"]/abbr")).click();
//				}
//			}
//			
//			
//		}
		
		List<WebElement> dates = driver.findElements(By.xpath("//div[@class='react-calendar__month-view__days']/button/abbr"));
		
		for(WebElement date : dates)
		{
			if(date.getText().equals("28"))
			{
				date.click();
				break;
			}
		}
	}
}
