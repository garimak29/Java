package com.example.practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PallindromeRecurssiveTest {

	@Test
	void test() {
		String A = "naman";
		int expected = 1;
		int actual = PallindromeRecurssive.solve(A);
		assertEquals(expected, actual);
	}

	@Test
	void test1() {
		String A = "strings";
		int expected = 0;
		int actual = PallindromeRecurssive.solve(A);
		assertEquals(expected, actual);
	}

}
