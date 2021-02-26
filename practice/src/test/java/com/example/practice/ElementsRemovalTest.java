package com.example.practice;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class ElementsRemovalTest {

	@Test
	void test() {
		int[] a = {2 ,1};
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int i =0;i<a.length;i++) {
			arr.add(a[i]);
		}
		int expected = 4;
		int actual = ElementsRemoval.solve(arr);
		assertEquals(expected, actual);
	}
	@Test
	void test1() {
		int[] a = {5};
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int i =0;i<a.length;i++) {
			arr.add(a[i]);
		}
		int expected = 5;
		int actual = ElementsRemoval.solve(arr);
		assertEquals(expected, actual);
	}

}
