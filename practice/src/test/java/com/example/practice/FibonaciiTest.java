package com.example.practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FibonaciiTest {

	@Test
	void test() {
		int A = 2;
		int expected = 1;
		int actual = Fibonacii.findAthFibonacci(A);
		assertEquals(expected, actual);
	}

	@Test
	void test1() {
		int A = 9;
		int expected = 34;
		int actual = Fibonacii.findAthFibonacci(A);
		assertEquals(expected, actual);
	}

}
