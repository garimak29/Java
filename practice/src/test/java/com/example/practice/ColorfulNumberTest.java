package com.example.practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ColorfulNumberTest {

	@Test
	void test() {
		int A = 23;
		int expected =1;
		int actual  = ColorfulNumber.colorful(A);
		assertEquals(expected, actual);
	}

	
	@Test
	void tes1t() {
		int A = 3245;
		int expected =1;
		int actual  = ColorfulNumber.colorful(A);
		assertEquals(expected, actual);
	}
	
	@Test
	void test2() {
		int A = 236;
		int expected =0;
		int actual  = ColorfulNumber.colorful(A);
		assertEquals(expected, actual);
	}
	
	@Test
	void tes13() {
		int A = 3;
		int expected =1;
		int actual  = ColorfulNumber.colorful(A);
		assertEquals(expected, actual);
	}
}
