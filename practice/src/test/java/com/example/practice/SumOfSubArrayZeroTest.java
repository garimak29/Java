package com.example.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class SumOfSubArrayZeroTest {

	@Test
	void test() {
		int[] a = {1, 2, 3, 4, 5};
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int i =0;i<a.length;i++) {
			arr.add(a[i]);
		}
		int expected = 0;
		int actual = SumOfSubArrayZero.solve(arr);
		assertEquals(expected, actual);
	}
	@Test
	void test2() {
		int[] a = {862, -411, -552, -549, 918, 434, 29, -437, 121, -640, -168, -961, 929, -427, 372, 984, 488, -756, 674, -149, 945, 566, 391, -970, -44, 689, -128, -326, 43, -312, 469, 817, -349, 260, 590, -106, -700, 484, -735, -423, 660, 450, -1148, -237, -844, 62, 513, 506, 382, 77, 244, 335 };
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int i =0;i<a.length;i++) {
			arr.add(a[i]);
		}
		int expected = 1;
		int actual = SumOfSubArrayZero.solve(arr);
		assertEquals(expected, actual);
	}
	
	@Test
	void test1() {
		int[] a = {1,-1};
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int i =0;i<a.length;i++) {
			arr.add(a[i]);
		}
		int expected = 1;
		int actual = SumOfSubArrayZero.solve(arr);
		assertEquals(expected, actual);
	}

}
