package basic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import util.Driverconnection;

public class B004_Registration {
	public static void main(String[] args) throws InterruptedException {
		
		
		
		
		WebDriver driver =  Driverconnection.connect("https://www.fb.com");
		
		driver.findElement(By.linkText("Create new account")).click();
		
		
		
		driver.findElement(By.name("firstname")).sendKeys("test");
		driver.findElement(By.name("lastname")).sendKeys("tech");
		driver.findElement(By.name("reg_email__")).sendKeys("9088566352");
		driver.findElement(By.id("password_step_input")).sendKeys("test123");
		
		WebElement day = driver.findElement(By.id("day"));
		Select days = new Select(day);
		days.selectByVisibleText("17");
		
		
		WebElement month = driver.findElement(By.id("month"));
		Select months = new Select(month);
		months.selectByValue("7");
		
		WebElement year = driver.findElement(By.id("year"));
		Select years = new Select(year);
		years.selectByIndex(10);
		
		List<WebElement>  gender = driver.findElements(By.name("sex"));
		gender.get(1).click();
		
		driver.findElement(By.name("websubmit")).click();
		Thread.sleep(5000);
		driver.close();
		
	}
}
