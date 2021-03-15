package com.example.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class PairSumDivisibleByMTest {

	@Test
	void test() {
		int[] a = {1, 2, 3, 4, 5};
		ArrayList<Integer> A = new ArrayList<Integer>();
		for(int i =0;i<a.length;i++) {
			A.add(a[i]);
		}
	//	System.out.println(A.size());
		int B = 2;
		int expected = 4;
		int actual = PairSumDivisibleByM.solve(A, B);
		assertEquals(expected, actual);
	}
	
	@Test
	void test1() {
		int[] a = {5, 17, 100, 11};
		ArrayList<Integer> A = new ArrayList<Integer>();
		for(int i =0;i<a.length;i++) {
			A.add(a[i]);
		}
	//	System.out.println(A.size());
		int B = 28;
		int expected = 1;
		int actual = PairSumDivisibleByM.solve(A, B);
		assertEquals(expected, actual);
	}
@Test
	void test3() {
		System.out.println("check this case");
		
		int[] a = { 69, 50, 9, 94, 94, 100, 11, 30, 57, 83, 71, 40, 75, 53, 12, 62, 15, 38, 30, 78, 10, 42, 74, 31, 42, 13, 20, 66, 74, 15, 67, 23, 50, 71, 3, 86, 9, 52, 56, 92, 60, 55, 30, 87, 2 };
		ArrayList<Integer> A = new ArrayList<Integer>();
		for(int i =0;i<a.length;i++) {
			A.add(a[i]);
		}
	//	System.out.println(A.size());
		int B = 21;
		int expected = 52;
		int actual = PairSumDivisibleByM.solve(A, B);
		assertEquals(expected, actual);
	}
	@Test
	void test2() {
		int[] a = {93, 9, 46, 79, 56, 24, 10, 26, 9, 93, 31, 93, 75, 7, 4, 80, 19, 67, 49, 84, 62, 100, 17, 40, 35, 84, 14, 81, 99, 31, 100, 66, 70, 2, 11, 84, 60, 89, 13, 57, 47, 60, 59, 60, 42, 67, 89, 29, 85, 83, 42, 47, 66, 80, 88, 85, 83, 82, 16, 23, 21, 55, 26, 2, 21, 92, 85, 26, 46, 3, 7, 95, 50, 22, 84, 52, 57, 44, 4, 23, 25, 55, 41, 49};
		ArrayList<Integer> A = new ArrayList<Integer>();
		for(int i =0;i<a.length;i++) {
			A.add(a[i]);
		}
	//	System.out.println(A.size());
		int B = 37;
		int expected = 84;
		int actual = PairSumDivisibleByM.solve(A, B);
		assertEquals(expected, actual);
	}

	
	
}
