package basic;

import org.testng.annotations.Test;

public class Payment {
		@Test
		public void debitCard()
		{
			System.out.println("Running debitcard");
		}
		@Test(groups = "smoke")
		public void creditcard()
		{
			System.out.println("runing credit card");
		}
		@Test(groups = "sanity")
		public void cod()
		{
			System.out.println("running cod");
		}
}
