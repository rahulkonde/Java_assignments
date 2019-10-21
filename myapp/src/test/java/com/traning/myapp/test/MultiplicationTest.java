package com.traning.myapp.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.traning.myapp.Multiplication;

public class MultiplicationTest {

	@Test
	public void testWithTwoPositiveNUmbers() {
		assertEquals(12, Multiplication.mul(4,3));
	}
	

}
