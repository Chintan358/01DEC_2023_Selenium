package basic;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class DependancyTest {
	
		@Test(priority = 1)
		public void login()
		{
			System.out.println("running login test");
			//assertTrue(false);
		}
		
		@Test(priority = 2,dependsOnMethods = "login")
		public void home()
		{
			System.out.println("Running home tesyt");
		}
		
		@Test(priority = 3,dependsOnMethods = "home")
		public void logout()
		{
			System.out.println("Runing logout test");
		}
}
