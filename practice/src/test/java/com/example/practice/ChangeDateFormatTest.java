package com.example.practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ChangeDateFormatTest {

	@Test
	void test() {
		String str = "16th Mar 2068";
		String expected = "2068-03-16";
		String actual = ChangeDateFormat.solve(str);
		assertEquals(expected, actual);
	}
	
	@Test
	void test1() {
		String str = "6th Jun 1933";
		String expected = "1933-06-06";
		String actual = ChangeDateFormat.solve(str);
		assertEquals(expected, actual);
	}

}
