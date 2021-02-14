package com.example.practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LongestConsecutiveTest {

	@Test
	void test() {
		int[] A = {100, 4, 200, 1, 3, 2};
		int expected = 4;
		int actual = LongestConsecutive.longestConsecutive(A);
		assertEquals(expected, actual);
				
	
	
	}
	
	@Test
	void test1() {
		int[] A = {2,1};
		int expected = 2;
		int actual = LongestConsecutive.longestConsecutive(A);
		assertEquals(expected, actual);
				
	
	
	}


}
