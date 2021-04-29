package com.example.practice;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class AnotherRectangeCountTest {

	@Test
	void test() {
		int[] a = {1, 2};
		ArrayList<Integer> A = new ArrayList<Integer>();
		A = TestingPack.convertToArrayList(a);
		int expected = 4;
		int B = 5;
		System.out.println(A +" : "+B);
		int actual = AnotherRectangeCount.solve(A, B);
		assertEquals(expected, actual);
	}

	@Test
	void test1() {
		int[] a = {1, 2, 3, 4, 5};
		ArrayList<Integer> A = new ArrayList<Integer>();
		A = TestingPack.convertToArrayList(a);
		int expected = 8;
		int B = 5;
		System.out.println(A +" : "+B);
		int actual = AnotherRectangeCount.solve(A, B);
		assertEquals(expected, actual);
	}
}
