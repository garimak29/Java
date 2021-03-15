package com.example.practice;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class SortUnsortedArrayTest {

	@Test
	void test() {
		int[] a = {0, 1, 15, 25, 6, 7, 30, 40, 50};
		int  expected = 4;
		ArrayList<Integer> A = new ArrayList<Integer>();
		A = TestingPack.convertToArrayList(a);
		int actual = SortUnsortedArray.solve(A);
		assertEquals(expected , actual);
	}

	
	@Test
	void test1() {
		int[] a = {-355071087, -679308132, 398052175, 755454983, 814022370, 889267058};
		int  expected = 2;
		ArrayList<Integer> A = new ArrayList<Integer>();
		A = TestingPack.convertToArrayList(a);
		int actual = SortUnsortedArray.solve(A);
		assertEquals(expected , actual);
	}
	
	@Test
	void test2() {
		int[] a = {-146316343, 179840175, 760528516};
		int  expected = 0;
		ArrayList<Integer> A = new ArrayList<Integer>();
		A = TestingPack.convertToArrayList(a);
		int actual = SortUnsortedArray.solve(A);
		assertEquals(expected , actual);
	}

}
