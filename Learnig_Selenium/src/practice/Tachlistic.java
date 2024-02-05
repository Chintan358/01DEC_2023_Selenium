package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.Driverconnection;

public class Tachlistic {
	public static void main(String[] args) {
		
		WebDriver driver = Driverconnection.connect("https://www.techlistic.com/p/selenium-practice-form.html");
		
		
		driver.findElement(By.name("firstname")).sendKeys("test");
		driver.findElement(By.name("lastname")).sendKeys("tech");
		driver.findElement(By.id("sex-1")).click();
		driver.findElement(By.id("exp-1")).click();
		
		driver.findElement(By.id("photo")).sendKeys("C:\\Users\\pc\\Downloads\\img\\bat.jpg");
	}
}
