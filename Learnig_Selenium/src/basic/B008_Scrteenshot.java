package basic;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

import util.Driverconnection;

public class B008_Scrteenshot {
	public static void main(String[] args) {
		
		WebDriver driver = Driverconnection.connect("https://www.fb.com");
		
		Driverconnection.getScreenShot(driver, "xyz");
		
		driver.findElement(By.name("login")).click();
		
		Driverconnection.getScreenShot(driver, "err");
	}
}
