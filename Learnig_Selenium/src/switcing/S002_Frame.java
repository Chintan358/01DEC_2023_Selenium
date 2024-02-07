package switcing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.Driverconnection;

public class S002_Frame {
	public static void main(String[] args) {
		
		WebDriver driver = Driverconnection.connect("https://demoqa.com/frames");
		
//		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
//		System.out.println(frames.size());
		
		WebElement f = driver.findElement(By.id("frame1"));
		
		//driver.switchTo().frame(1);
		//driver.switchTo().frame("abc");
		driver.switchTo().frame(f);
		String text =  driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(text);
		
		
	}
}
