package com.example.practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TwoSumTest {

	private static final int B = 9;

	@Test
	void testTwoSumSimple() {
		//fail("Not yet implemented"); // TODO
		
		  int[] A = {2, 7, 11, 15}; 
		  int[] expected = {1,2}; 
		  int[] actual =TwoSum.twoSum(A,B); assertArrayEquals(expected, actual); 
		 
		
		
		
	}
	@Test
	void testTwoSumDuplicate() {
		 int[] B = { 4, 7,
				  -4, 2, 2, 2, 3, -5, -3, 9, -4, 9, -7, 7, -1, 9, 9, 4, 1, -4, -2, 3, -3, -5,
				  4, -7, 7, 9, -4, 4, -8}; 
				  int[] expected1= {4,8}; 
				  int[] actual1 =
				  TwoSum.twoSum(B, -3); assertArrayEquals(expected1, actual1);
				 
	}
	@Test
	void testTwoSumFirstIndex() {
		int[] C = {1, 1, 1 };
		int[] expected3 = {1 ,2 };
		int[] actual3 = TwoSum.twoSum(C, 2);
		assertArrayEquals(expected3,actual3);
		
	}
	@Test
	void testTwoSumNoAnswer() {
		int[] C = {-10, -10, -10  };
		int[] expected3 = {};
		int[] actual3 = TwoSum.twoSum(C, -5);
		assertArrayEquals(expected3,actual3);
		
	}

}
