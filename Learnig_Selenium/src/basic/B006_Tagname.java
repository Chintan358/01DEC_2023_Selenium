package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.Driverconnection;

public class B006_Tagname {
	public static void main(String[] args) {
		
		
		
		WebDriver driver = Driverconnection.connect("https://www.fb.com");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		//System.out.println(links.size());
		String str[] = new String[links.size()];
		int count = 0;
		for(WebElement link : links)
		{
			//System.out.println(link.getText());
			if(link.getText()!="")
			{
			str[count] = link.getText();
			count++;
			}
		}
		
		
		for(String s  :str)
		{
			System.out.println(s);
			//driver.findElement(By.linkText(s)).click();
			//driver.navigate().back();
		}
		
		
		
		
		driver.close();
		
	}
}
