package actionevent;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import util.Driverconnection;

public class A003_Keyboard {
	public static void main(String[] args) {
		
		WebDriver driver = Driverconnection.connect("https://www.google.com/");
		
		WebElement search = driver.findElement(By.name("q"));
		
		Actions builder = new Actions(driver);
		
		builder.click(search)
				.sendKeys("tops technologies")
				.pause(Duration.ofSeconds(5))
				.sendKeys(Keys.ARROW_DOWN)
				.sendKeys(Keys.ENTER)
				.build()
				.perform();
			
		
	}
}
