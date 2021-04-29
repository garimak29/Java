package com.example.practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DivisorGameTest {

	@Test
	void test() {
		int A = 12 , B = 2, C=3;
		int expected = 2;
		int actual = DivisorGame.solve1(A, B, C);
		assertEquals(expected, actual);
				
	}
	
	@Test
	void test1() {
		int A = 12 , B = 1, C=1;
		int expected = 12;
		int actual = DivisorGame.solve1(A, B, C);
		assertEquals(expected, actual);
				
	}
	
	@Test
	void test2() {
		int A = 6 , B = 1, C=4;
		int expected = 1;
		int actual = DivisorGame.solve1(A, B, C);
		assertEquals(expected, actual);
				
	}
	
	@Test
	void test3() {
		int A = 81991 , B = 2549, C=7;
		int expected = 4;
		int actual = DivisorGame.solve1(A, B, C);
		assertEquals(expected, actual);
				
	}

}
