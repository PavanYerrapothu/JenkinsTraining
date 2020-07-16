package com.jenkins;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculateTest {

	@Test
	public void addTest() {
		Calculate calc = new Calculate();
		assertEquals(10, calc.addTwoNumbers(5, 5));
	}
	
	@Test
	public void subTest() {
		Calculate calc = new Calculate();
		assertEquals(15, calc.subTwoNumbers(20, 5));
	}
}
