package com.example.practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RedundantBracesTest {

	@Test
	void test() {
		String A = "(a)";
		int expected = 1;
		int actual = RedundantBraces.braces(A);
		assertEquals(expected, actual);
	}

}
