package com.traning.myapp.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.traning.myapp.Greet;
import com.traning.myapp.addition;

public class MyappTest {

	@Test
	public void AdditionWithTwoPOsitiveNumbers()
	{
		assertEquals(15, addition.add(10,5));
		
	}
	@Test
		public void AdditionWithOnePostitveAndOneNegativeNumber()
		{
			assertEquals(0, addition.add(-10, 10));
		}
	@Test
	public void AdditionWithOnePositveAndOneNegativeNumber()
	{
		assertEquals(5 ,addition.add(10,-5));
	}
	@Test 
	public void ToPrintHelloWorld()
	{
		assertEquals ("Hello World",Greet.message("Hello World") );
	}
	}




