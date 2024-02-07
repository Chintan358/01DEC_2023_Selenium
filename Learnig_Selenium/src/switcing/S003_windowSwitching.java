package switcing;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.Driverconnection;

public class S003_windowSwitching {
	public static void main(String[] args) {
		
		WebDriver driver = Driverconnection.connect("https://demoqa.com/browser-windows");
		
		String mainWin  =  driver.getWindowHandle();
		//System.out.println("Main win : "+mainWin);
		
		driver.findElement(By.id("tabButton")).click();
		
		Set<String> wins =  driver.getWindowHandles();
		for(String win : wins)
		{
			if(!win.equals(mainWin))
			{
				driver.switchTo().window(win);
			}
		}
		
		String text =  driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(text);
//		driver.close();
//		driver.switchTo().window(mainWin);
//		driver.close();
		
		driver.quit();
		
	}
}
