package com.example.practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExcelColumnTileTest {

	@Test
	void test() {
		int A = 28;
		String expected = "AB";
		String actual = ExcelColumnTile.convertToTitle(A);
		assertEquals(expected, actual);
	}

	@Test
	void test1() {
		int A = 3;
		String expected = "C";
		String actual = ExcelColumnTile.convertToTitle(A);
		assertEquals(expected, actual);
	}
	
	@Test
	void test2() {
		int A = 943566;
		String expected = "BAQTZ";
		String actual = ExcelColumnTile.convertToTitle(A);
		assertEquals(expected, actual);
	}
	
	@Test
	void test3() {
		int A = 468096;
		String expected = "ZPKR";
		String actual = ExcelColumnTile.convertToTitle(A);
		assertEquals(expected, actual);
	}

}
