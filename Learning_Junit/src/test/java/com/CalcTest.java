package com;

import static org.junit.Assert.assertEquals;

import org.Calc;
import org.junit.Test;

public class CalcTest {
	
	@Test
	public void addTest()
	{
		Calc c = new Calc();
		int actual = c.add(10, 20);
		int expected = 30;
		
//		if(actual==expected)
//		{
//			System.out.println("pass");
//		}
//		else
//		{
//			System.out.println("Fail");
//		}
		
		assertEquals(expected, actual);
	}
}
