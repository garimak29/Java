package com.example.practice;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class UniqueElementsTest {

	@Test
	void test() {
		int[] a = {1 ,1 , 3};
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int i =0;i<a.length;i++) {
			arr.add(a[i]);
		}
		int expected = 1;
		int actual = UniqueElements.solve(arr);
		assertEquals(expected, actual);
	}
	@Test
	void test1() {
		int[] a = {2 ,4 , 5};
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int i =0;i<a.length;i++) {
			arr.add(a[i]);
		}
		int expected = 0;
		int actual = UniqueElements.solve(arr);
		assertEquals(expected, actual);
	}
	@Test
	void test2() {
		int[] a = {2 ,3, 3 ,4 , 5};
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int i =0;i<a.length;i++) {
			arr.add(a[i]);
		}
		int expected = 3;
		int actual = UniqueElements.solve(arr);
		assertEquals(expected, actual);
	}
}
