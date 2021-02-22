package com.example.practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VowelItTest {

	@Test
	void test() {
		String A = "abcdye";
		String expected = "ae";
		String actual = VowelIt.solve(A);
		assertEquals(expected, actual);
	}@Test
	void test1() {
		String A = "abhishek";
		String expected = "aie";
		String actual = VowelIt.solve(A);
		assertEquals(expected, actual);
	}@Test
	void test2() {
		String A = "interviewbit";
		String expected = "ieiei";
		String actual = VowelIt.solve(A);
		assertEquals(expected, actual);
	}

}
