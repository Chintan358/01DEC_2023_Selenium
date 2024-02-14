package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.Driverconnection;

public class B007_Scroll {
	public static void main(String[] args) {
		
		
		WebDriver driver = Driverconnection.connect("https://www.fb.com");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement element = driver.findElement(By.linkText("About"));
		//js.executeScript("window.scrollBy(0,100)");
		// js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		js.executeScript("arguments[0].scrollIntoView();", element);
	}
}
