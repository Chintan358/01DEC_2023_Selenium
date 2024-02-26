package com;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class assertionDemo {
	
	@Test
	public void test()
	{
		int a = 10;
		int b = 0;
		
		//assertEquals(a, b);
		//assertNotEquals(b, a);
		//assertTrue(a>b);
		//assertFalse(a>b);
		//assertNull(a);
		//assertNotNull(b);
		
		int i[] = {10,20,30,40,50,60};
		int j[] = {10,20,30,40,50,70};
		
		//assertArrayEquals(i, j);
		
		
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		
		//assertSame(s1, s2);
		//assertEquals(s1, s2);
		
		
		
	}
}
