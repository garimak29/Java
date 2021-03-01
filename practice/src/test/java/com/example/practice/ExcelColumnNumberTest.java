package com.example.practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExcelColumnNumberTest {

	@Test
	void test() {
		int expected = 28;
		String A = "AB";
		int actual = ExcelColumnNumber.titleToNumber(A);
		assertEquals(expected, actual);
	}

	@Test
	void test1() {
		int expected = 19010;
		String A = "ABCD";
		int actual = ExcelColumnNumber.titleToNumber(A);
		assertEquals(expected, actual);
	}
	
	

}
