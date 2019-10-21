package com.traning.myapp.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.traning.myapp.Factorial;

public class FactorialTest {

	@Test
	public void TestWithTwoPositiveNumbers(){
		assertEquals(120, Factorial.Fact(5));
		
	}

}
