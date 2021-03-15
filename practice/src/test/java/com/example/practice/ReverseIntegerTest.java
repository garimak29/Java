package com.example.practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseIntegerTest {

	@Test
	void test() {
		int x = 123;
		int expected = 321 ;
		int actual = ReverseInteger.reverse(x);
		assertEquals(expected, actual);
	}
	@Test
	void test1() {
		int x = -123;
		int expected = -321 ;
		int actual = ReverseInteger.reverse(x);
		assertEquals(expected, actual);
	}
	
	@Test
	void test2() {
		int x = -1146467285;
		int expected = 0 ;
		int actual = ReverseInteger.reverse(x);
		assertEquals(expected, actual);
	}
	

}
