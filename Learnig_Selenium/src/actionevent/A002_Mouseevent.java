package actionevent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import util.Driverconnection;

public class A002_Mouseevent {
	public static void main(String[] args) {
		
		
		WebDriver driver = Driverconnection.connect("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement from = driver.findElement(By.xpath("//div[@id='products']/div/ul/li[5]"));
		
		WebElement to = driver.findElement(By.xpath("//ol[@id='bank']/li"));
		
		Actions builder = new Actions(driver);
		
		builder.clickAndHold(from).moveToElement(to).release().build().perform();
		
		
	}
}
