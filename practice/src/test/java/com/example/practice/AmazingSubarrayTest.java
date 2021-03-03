package com.example.practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AmazingSubarrayTest {

	@Test
	void test() {
		String A = "ABEC";
		int expected = 6;
		int actual = AmazingString.solve(A);
		assertEquals(expected, actual);
	}

}
