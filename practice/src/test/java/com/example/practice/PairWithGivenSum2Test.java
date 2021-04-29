package com.example.practice;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class PairWithGivenSum2Test {

	@Test
	void tes3() {
		int[] a = {1, 1, 1};
		ArrayList<Integer> A = new ArrayList<Integer>();
		A = TestingPack.convertToArrayList(a);
		int expected = 3;
		int B = 2;
		System.out.println(A +" : "+B);
		int actual = PairWithGivenSum2.solve(A, B);
		assertEquals(expected, actual);
	}
	
	@Test
	void tes2() {
		int[] a = {1, 1};
		ArrayList<Integer> A = new ArrayList<Integer>();
		A = TestingPack.convertToArrayList(a);
		int expected = 1;
		int B = 2;
		System.out.println(A +" : "+B);
		int actual = PairWithGivenSum2.solve(A, B);
		assertEquals(expected, actual);
	}
	
	@Test
	void tes4() {
		int[] a = {2, 3, 3, 5, 7, 7, 8, 9, 9, 10, 10 };
		ArrayList<Integer> A = new ArrayList<Integer>();
		A = TestingPack.convertToArrayList(a);
		int expected = 4;
		int B =11;
		System.out.println(A +" : "+B);
		int actual = PairWithGivenSum2.solve(A, B);
		assertEquals(expected, actual);
	}
	
	@Test
	void tes5() {
		int[] a = {1, 2, 3, 3, 4, 6, 7 };
		ArrayList<Integer> A = new ArrayList<Integer>();
		A = TestingPack.convertToArrayList(a);
		int expected = 1;
		int B =13;
		System.out.println(A +" : "+B);
		int actual = PairWithGivenSum2.solve(A, B);
		assertEquals(expected, actual);
	}
	
	@Test
	void tes6() {
		int[] a = {2, 4, 4, 5, 6, 8, 10 };
		ArrayList<Integer> A = new ArrayList<Integer>();
		A = TestingPack.convertToArrayList(a);
		int expected = 2;
		int B =6;
		System.out.println(A +" : "+B);
		int actual = PairWithGivenSum2.solve(A, B);
		assertEquals(expected, actual);
	}
	
	@Test
	void tes7() {
		int[] a = {1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 9, 10 };
		ArrayList<Integer> A = new ArrayList<Integer>();
		A = TestingPack.convertToArrayList(a);
		int expected = 6;
		int B =5;
		System.out.println(A +" : "+B);
		int actual = PairWithGivenSum2.solve(A, B);
		assertEquals(expected, actual);
	}
}
