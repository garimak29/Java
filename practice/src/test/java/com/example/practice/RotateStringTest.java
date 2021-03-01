package com.example.practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RotateStringTest {

	@Test
	void test() {
		String A = "scaler";
		int B = 2;
		String expected = "erscal";
		String actual = RotateString.solve(A, B);
		assertEquals(expected, actual);
	}
	
	@Test
	void test1() {
		String A = "academy";
		int B = 7;
		String expected = "academy";
		String actual = RotateString.solve(A, B);
		assertEquals(expected, actual);
	}
	@Test
	void test2() {
		String A = "a";
		int B = 7;
		String expected = "a";
		String actual = RotateString.solve(A, B);
		assertEquals(expected, actual);
	}
	@Test
	void test3() {
		String A = "jadgbxjesitcdbnbkftdv";
		int B = 29;
		String expected = "bnbkftdvjadgbxjesitcd";
		String actual = RotateString.solve(A, B);
		assertEquals(expected, actual);
	}

}
