package webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.Driverconnection;

public class T003_Webtable {
	public static void main(String[] args) {
		
		
		WebDriver driver = Driverconnection.connect("https://demoqa.com/webtables");
		
		String name = "Cierradsds";
		
		try {
			WebElement element = driver.findElement(By.xpath("//*[text()='"+name+"']"));
			if(element.isDisplayed())
			{
				driver.findElement(By.xpath("//*[text()='"+name+"']/following-sibling::div[6]/div/span[1]")).click();
			}
			else
			{
				System.out.println("Not visible");
			}
		
		} catch (Exception e) {
			System.out.println("name not found");
		}
		
	}
}
