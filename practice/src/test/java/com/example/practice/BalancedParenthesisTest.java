package com.example.practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BalancedParenthesisTest {

	@Test
	void test() {
		String A = "))))))))";
		int expected = 0;
		int actual = BalancedParenthesis.solve(A);
		assertEquals(expected, actual);
	}

}
