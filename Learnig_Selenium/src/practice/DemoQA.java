package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import util.Driverconnection;

public class DemoQA {
	public static void main(String[] args) {
		
		String myYear = "2025";
		String myMonth = "May";
		String myDay = "27";
		
		
		WebDriver driver = Driverconnection.connect("https://demoqa.com/automation-practice-form");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		driver.findElement(By.id("firstName")).sendKeys("test");
		driver.findElement(By.id("lastName")).sendKeys("tech");
		driver.findElement(By.id("userEmail")).sendKeys("test@gmail.com");
		driver.findElement(By.xpath("//label[@for='gender-radio-1']")).click();
		driver.findElement(By.id("userNumber")).sendKeys("8596857485");
		
		driver.findElement(By.id("dateOfBirthInput")).click();
		
		WebElement month = driver.findElement(By.className("react-datepicker__month-select"));
		Select months = new Select(month);
		months.selectByVisibleText(myMonth);
		
		WebElement year = driver.findElement(By.className("react-datepicker__year-select"));
		Select years= new Select(year);
		years.selectByVisibleText(myYear);

		List<WebElement> days = driver.findElements(By.xpath("//div[@class='react-datepicker__week']/div"));
		for(WebElement day  :days)
		{
			if(day.getText().equals(myDay))
			{
				if(day.getAttribute("aria-label").contains(myMonth))
				{
					day.click();
					break;
				}
			}
		}
		
		WebElement sub = driver.findElement(By.id("subjectsContainer"));
		
		Actions builder = new Actions(driver);
		
		builder.click(sub)
				.sendKeys("Maths")
				.sendKeys(Keys.ARROW_DOWN)
				.sendKeys(Keys.ENTER)
				.build()
				.perform();
		
		
		
		driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']")).click();
		
		
		driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\pc\\Downloads\\img\\bat.jpg");
		
		driver.findElement(By.id("currentAddress")).sendKeys("Surat,gujarat");
			
		
		
		
		
		
		
		
	}
}
