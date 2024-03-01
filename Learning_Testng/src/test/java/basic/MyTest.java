package basic;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyTest {

		@Test(priority = 1)
		public void test()
		{
			System.out.println("runing test");
		}
		
		@Test(priority = 2,enabled = false)
		public void alpha()
		{
			System.out.println("runing alpha test");
		}
		
		@Test(priority = 3)
		public void beta()
		{
			System.out.println("Running beta");
		}
		
		
		@BeforeMethod
		public void beforemethod()
		{
			System.out.println("Running before every method");
		}
		
		@AfterMethod
		public void afterMethod()
		{
			System.out.println("Running after every method");
		}
		
		@BeforeClass
		public void beforeClass()
		{
			System.out.println("Runing before class");
		}
		
		@AfterClass
		public void afterclass()
		{
			System.out.println("Runing after class");
		}
		
		@BeforeTest
		public void beforeTest()
		{
			System.out.println("runing before test");
		}
		
		@AfterTest
		public void afterTest()
		{
			System.out.println("Runing after test");
		}
		
		@BeforeSuite
		public void beforesuitr()
		{
			System.out.println("running before suit");
		}
		
		@AfterSuite
		public void aftrSuite()
		{
			System.out.println("Runing after suit");
		}
}
