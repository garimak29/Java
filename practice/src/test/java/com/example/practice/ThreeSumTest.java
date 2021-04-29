package com.example.practice;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class ThreeSumTest {

	@Test
	void test() {
		int[] a = {-1, 2, 1, -4};
		ArrayList<Integer> A = new ArrayList<Integer>();
		A = TestingPack.convertToArrayList(a);
		int expected = 2;
		int B =1;
		System.out.println(A +" : "+B);
		int actual = ThreeSum.threeSumClosest(A, B);
		assertEquals(expected, actual);
	}
	
	@Test
	void test1() {
		int[] a = {-1,-1,-1};
		ArrayList<Integer> A = new ArrayList<Integer>();
		A = TestingPack.convertToArrayList(a);
		int expected = -3;
		int B =1;
		System.out.println(A +" : "+B);
		int actual = ThreeSum.threeSumClosest(A, B);
		assertEquals(expected, actual);
	}

}
