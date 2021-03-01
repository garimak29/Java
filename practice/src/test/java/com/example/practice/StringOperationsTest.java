package com.example.practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringOperationsTest {

	@Test
	void test() {
		String A= "AbcaZeoB";
		String expected = "bc###bc###";
		String actual = StringOperations.solve(A);
		assertEquals(expected, actual);
	}

}
