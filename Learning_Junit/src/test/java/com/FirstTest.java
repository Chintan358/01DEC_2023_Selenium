package com;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class FirstTest {
	
		@Test
		public void test()
		{
			System.out.println("Running test...");
		}
		
		//@Ignore
		@Test
		public void alpha()
		{
			System.out.println("runing alpha test");
			
		}
		
		@Test
		public void beta()
		{
			System.out.println("Running beta test");
		}
		
		@Before
		public void home()
		{
			System.out.println("Home page checked");
		}
		
		@After
		public void title()
		{
			System.out.println("title checked");
		}
	
		@BeforeClass
		public static void setup()
		{
			System.out.println("Setup");
		}
		
		@AfterClass
		public static void close()
		{
			System.out.println("closed");
		}
}
