package com.example.practice;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class SubArrayWithGivenSumTest {


	@Test
	void test() {
		int[] a = {1, 2, 3, 4, 5};
		ArrayList<Integer> A = new ArrayList<Integer>();
		A = TestingPack.convertToArrayList(a);
		ArrayList<Integer> Expected = new ArrayList<Integer>();
		int[] expected = {2, 3};
		Expected = TestingPack.convertToArrayList(expected);
		int B = 5;
		System.out.println(A +" : "+B);
		ArrayList<Integer> actual = new ArrayList<Integer>(); 
		actual= SubArrayWithGivenSum.solve(A, B);
		assertEquals(Expected, actual);
	}
	
	@Test
	void tes1() {
		int[] a = {5, 10, 20, 100, 105 };
		ArrayList<Integer> A = new ArrayList<Integer>();
		A = TestingPack.convertToArrayList(a);
		ArrayList<Integer> Expected = new ArrayList<Integer>();
		int[] expected = {-1};
		Expected = TestingPack.convertToArrayList(expected);
		int B = 110;
		System.out.println(A +" : "+B);
		ArrayList<Integer> actual = new ArrayList<Integer>(); 
		actual= SubArrayWithGivenSum.solve(A, B);
		assertEquals(Expected, actual);
	}

	@Test
	void tes2() {
		int[] a = {12, 1, 50, 39, 32, 23, 22, 44, 17, 5, 9, 12, 10, 50, 26, 5, 23, 38, 31, 5, 34, 8, 21, 11, 24, 44, 18, 19, 6, 31, 3, 47, 5, 2, 33, 44, 14, 9  };
		ArrayList<Integer> A = new ArrayList<Integer>();
		A = TestingPack.convertToArrayList(a);
		ArrayList<Integer> Expected = new ArrayList<Integer>();
		int[] expected = {44 , 14};
		Expected = TestingPack.convertToArrayList(expected);
		int B = 58;
		System.out.println(A +" : "+B);
		ArrayList<Integer> actual = new ArrayList<Integer>(); 
		actual= SubArrayWithGivenSum.solve(A, B);
		assertEquals(Expected, actual);
	}

	@Test
	void tes3() {
		int[] a = {1 , 100000};
		ArrayList<Integer> A = new ArrayList<Integer>();
		A = TestingPack.convertToArrayList(a);
		ArrayList<Integer> Expected = new ArrayList<Integer>();
		int[] expected = {100000};
		Expected = TestingPack.convertToArrayList(expected);
		int B = 100000;
		System.out.println(A +" : "+B);
		ArrayList<Integer> actual = new ArrayList<Integer>(); 
		actual= SubArrayWithGivenSum.solve(A, B);
		assertEquals(Expected, actual);
	}

}
