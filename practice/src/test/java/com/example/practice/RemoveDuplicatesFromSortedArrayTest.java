package com.example.practice;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class RemoveDuplicatesFromSortedArrayTest {

	@Test
	void test() {
		int[] a = {1,1,2};
		int  expected = 2;
		ArrayList<Integer> A = new ArrayList<Integer>();
		A = TestingPack.convertToArrayList(a);
		int actual = RemoveDuplicatesFromSortedArray.removeDuplicates1(A);
		assertEquals(expected , actual);
	}
	
	@Test
	void test56() {
		int[] a = {2,3,3};
		int  expected = 2;
		ArrayList<Integer> A = new ArrayList<Integer>();
		A = TestingPack.convertToArrayList(a);
		int actual = RemoveDuplicatesFromSortedArray.removeDuplicates1(A);
		assertEquals(expected , actual);
	}
	@Test
	void test2() {
		int[] a = {1,2,2,3,3};
		int  expected = 3;
		ArrayList<Integer> A = new ArrayList<Integer>();
		A = TestingPack.convertToArrayList(a);
		int actual = RemoveDuplicatesFromSortedArray.removeDuplicates1(A);
		assertEquals(expected , actual);
	}
	
	@Test
	void test3() {
		int[] a = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3 };
		int  expected = 4;
		ArrayList<Integer> A = new ArrayList<Integer>();
		A = TestingPack.convertToArrayList(a);
		int actual = RemoveDuplicatesFromSortedArray.removeDuplicates1(A);
		assertEquals(expected , actual);
	}
	
	@Test
	void test4() {
		int[] a = {5000, 5000, 5000};
		int  expected = 1;
		ArrayList<Integer> A = new ArrayList<Integer>();
		A = TestingPack.convertToArrayList(a);
		int actual = RemoveDuplicatesFromSortedArray.removeDuplicates1(A);
		assertEquals(expected , actual);
	}
	
	@Test
	void test5() {
		int[] a = {0};
		int  expected = 1;
		ArrayList<Integer> A = new ArrayList<Integer>();
		A = TestingPack.convertToArrayList(a);
		int actual = RemoveDuplicatesFromSortedArray.removeDuplicates1(A);
		assertEquals(expected , actual);
	}

}
