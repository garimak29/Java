package com.example.practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CountOccuranceTest {

	//@Test
	void test() {
		String A = "abobc";
		int expected = 1;
		int actual = CountOccurance.solve(A);
		assertEquals(expected, actual);
	}
	@Test
	void test1() {
		String A = "bobob";
		int expected = 2;
		int actual = CountOccurance.solve(A);
		assertEquals(expected, actual);
	}
}
