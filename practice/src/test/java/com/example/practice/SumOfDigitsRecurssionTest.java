package com.example.practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumOfDigitsRecurssionTest {

	@Test
	void test() {
		int A = 46;
		int expected = 10;
		int actual = SumOfDigitsRecurssion.solve(A);
		assertEquals(expected, actual);
	}
	
	@Test
	void test1() {
		int A = 11;
		int expected = 2;
		int actual = SumOfDigitsRecurssion.solve(A);
		assertEquals(expected, actual);
	}
	
	@Test
	void test2() {
		int A = 9;
		int expected = 9;
		int actual = SumOfDigitsRecurssion.solve(A);
		assertEquals(expected, actual);
	}

}
