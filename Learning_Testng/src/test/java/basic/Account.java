package basic;

import org.testng.annotations.Test;

public class Account {
	
		@Test(groups = "sanity")
		public void savingAccount()
		{
			System.out.println("running saving account");
		}
		
		@Test(groups = {"smoke","sanity"})
		public void currentAccount()
		{
			System.out.println("running current account");
		}
		
		@Test
		public void laonAccount()
		{
			System.out.println("Running loan account");
		}
}
