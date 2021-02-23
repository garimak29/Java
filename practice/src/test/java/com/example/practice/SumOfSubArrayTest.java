package com.example.practice;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class SumOfSubArrayTest {

	@Test
	void test() {
		int[] a = {1, 2, 3, 4, 5};
		int B = 5;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int i =0;i<a.length;i++) {
			arr.add(a[i]);
		}
		ArrayList<Integer> expected = new ArrayList<Integer>();
		expected.add(2);
		expected.add(3);
		ArrayList<Integer> actual = new ArrayList<Integer>();
		actual = SumOfSubArray.solve(arr, B);
		assertEquals(expected, actual);
	}

}
