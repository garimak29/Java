package com.example.practice;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class MergeTwoSortedArrayTest {

	@Test
	void test() {
	//	System.out.println("Check this case");
		int[] a = {4, 7, 9};
		int[] b ={2 ,11, 19};
		int[] exp = {2, 4, 7, 9, 11, 19};
		ArrayList<Integer> A = new ArrayList<Integer>();
		A = TestingPack.convertToArrayList(a);
		ArrayList<Integer> B= new ArrayList<Integer>();
		B = TestingPack.convertToArrayList(b);
		ArrayList<Integer> expected = new ArrayList<Integer>();
		expected = TestingPack.convertToArrayList(exp);
		ArrayList<Integer> actual = new ArrayList<Integer>();
		actual = MergeTwoSortedArray.solve(A, B);
		assertEquals(expected , actual);
	}

}
