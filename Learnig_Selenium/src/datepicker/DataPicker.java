package datepicker;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.Driverconnection;

public class DataPicker {
	public static void main(String[] args) {
		
		
		WebDriver driver = Driverconnection.connect("https://www.globalsqa.com/demo-site/datepicker/");
		
		
		
		WebElement frame = driver.findElement(By.xpath("//div[@class='resp-tabs-container']/div[1]/p/iframe"));
		driver.switchTo().frame(frame);
		
		driver.findElement(By.id("datepicker")).click();
		
		String myYear = "2020";
		String myMonth = "May";
		String myDate = "23";
		
		String currentYear = driver.findElement(By.className("ui-datepicker-year")).getText();
		int a = Integer.parseInt(currentYear);
		int b = Integer.parseInt(myYear);
		
		
		while((!driver.findElement(By.className("ui-datepicker-year")).getText().equals(myYear)) || (!driver.findElement(By.className("ui-datepicker-month")).getText().equals(myMonth)))
		{
			if(a>b)
			{
				driver.findElement(By.xpath("//a[@title='Prev']/span")).click();
			}
			else
			{
			driver.findElement(By.xpath("//a[@title='Next']/span")).click();
			}
		}
		
		
		
		
		List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));
		for(WebElement date  :dates)
		{
			String dt = date.getText();
			if(dt.equals(myDate))
			{
				date.click();
				break;
			}
		}
		
		
		
		
		
		
		
	}
}
