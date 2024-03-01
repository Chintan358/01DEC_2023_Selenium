package basic;

import org.testng.annotations.Test;

public class ExceptionHandling {
		
		@Test(expectedExceptions = ArithmeticException.class)
		public void test()
		{
			int a = 10;
			int b = a/0;
		}
		
		@Test(expectedExceptions = ArrayIndexOutOfBoundsException.class)
		public void test1()
		{
			int a[] = new int[2];
			
			a[3] = 10;
		}
}
