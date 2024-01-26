package basic;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class B001_BrowserDemo {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Chintan_work\\seleniumdata\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		System.setProperty("webdriver.gecko.driver", "C:\\Chintan_work\\seleniumdata\\geckodriver.exe");
		WebDriver driver1 = new FirefoxDriver();
		
		System.setProperty("webdriver.edge.driver", "C:\\Chintan_work\\seleniumdata\\msedgedriver.exe");
		WebDriver driver2 = new EdgeDriver();
		
		driver.get("https://www.google.com");
		driver1.get("https://www.google.com");
		driver2.get("https://www.google.com");
		driver.manage().window().maximize();
		
		
	}
}
