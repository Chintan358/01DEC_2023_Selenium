package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B002_titlecheck {
	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Chintan_work\\seleniumdata\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		
		String actualTitle =  driver.getTitle();
		//System.out.println(actualTitle);
		String expectedTtile = "Google";
		
		if(expectedTtile.equals(actualTitle))
		{
			System.out.println("passed");
		}
		else
		{
			System.out.println("Failed");
		}
		
		
		
		driver.close();
	}
}
