package com.example.practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TrailingZeroFactorialTest {

	@Test
	void test() {
		int A = 5;
		int expected = 1;
		int actual = TrailingZeroFactorial.trailingZeroes(A);
	}
	
	@Test
	void test1() {
		int A = 6;
		int expected = 1;
		int actual = TrailingZeroFactorial.trailingZeroes(A);
	}

}
