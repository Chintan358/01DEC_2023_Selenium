package actionevent;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import util.Driverconnection;

public class A001_MouseEvent {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = Driverconnection.connect("https://www.globalsqa.com/demo-site/draganddrop/");
		
		WebElement f = driver.findElement(By.xpath("//div[@class='resp-tabs-container']/div[1]/p/iframe"));
		driver.switchTo().frame(f);
		
		
		List<WebElement> img = driver.findElements(By.xpath("//ul[@id='gallery']/li"));
		
		WebElement trash = driver.findElement(By.id("trash"));
		
		
		Actions builder = new Actions(driver);
		
		//builder.dragAndDrop(img.get(0), trash).build().perform();
		
		
		Action e1 =  builder.clickAndHold(img.get(0)).moveToElement(trash).release().build();
		Action e2 =  builder.clickAndHold(img.get(1)).moveToElement(trash).release().build();
		Action e3 =  builder.clickAndHold(img.get(2)).moveToElement(trash).release().build();
		Action e4 =  builder.clickAndHold(img.get(3)).moveToElement(trash).release().build();
		
		e1.perform();
		Thread.sleep(2000);
		e2.perform();
		Thread.sleep(2000);
		e3.perform();
		Thread.sleep(2000);
		e4.perform();
		
		
	}
}
