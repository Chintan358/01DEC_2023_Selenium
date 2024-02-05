package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.Driverconnection;

public class B005_LinkTest {
	public static void main(String[] args) {
		
		
		WebDriver driver = Driverconnection.connect("https://www.fb.com");
		
		//driver.findElement(By.linkText("Forgotten password?")).click();
		
		List<WebElement> links = driver.findElements(By.partialLinkText("Create"));
		for(WebElement link : links)
		{
			System.out.println(link.getText());
		}
		
	}
}
