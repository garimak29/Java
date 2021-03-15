package com.example.practice;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class MaximumPositiveTest {

	@Test
	void test() {
		int[] a = {1,2,-3,7,6};
		ArrayList<Integer> A = new ArrayList<Integer>();
		for(int i =0;i<a.length;i++) {
			A.add(a[i]);
		}
	//	System.out.println(A.size());
		
		int[] exp = {1,2};
		ArrayList<Integer> expected = new ArrayList<Integer>();
		for(int i =0;i<exp.length;i++) {
			expected.add(exp[i]);
		}
		ArrayList<Integer> actual = new ArrayList<Integer>();
		actual = MaximumPositive.solve(A);
		assertEquals(expected, actual);
	}
	
	@Test
	void test1() {
		int[] a = {1,-2,3,7,6,9,-4,-9,2,3};
		ArrayList<Integer> A = new ArrayList<Integer>();
		for(int i =0;i<a.length;i++) {
			A.add(a[i]);
		}
	//	System.out.println(A.size());
		
		int[] exp = {3,7,6,9};
		ArrayList<Integer> expected = new ArrayList<Integer>();
		for(int i =0;i<exp.length;i++) {
			expected.add(exp[i]);
		}
		ArrayList<Integer> actual = new ArrayList<Integer>();
		actual = MaximumPositive.solve(A);
		assertEquals(expected, actual);
	}
	@Test
	void test3() {
		int[] a = {1,2,3,4,5,6};
		ArrayList<Integer> A = new ArrayList<Integer>();
		for(int i =0;i<a.length;i++) {
			A.add(a[i]);
		}
	//	System.out.println(A.size());
		
		int[] exp = {1,2,3,4,5,6};
		ArrayList<Integer> expected = new ArrayList<Integer>();
		for(int i =0;i<exp.length;i++) {
			expected.add(exp[i]);
		}
		ArrayList<Integer> actual = new ArrayList<Integer>();
		actual = MaximumPositive.solve(A);
		assertEquals(expected, actual);
	}
	
	@Test
	void test4() {
		int[] a = {-1,-2,3,4,-5,6,-5,5,34,1};
		ArrayList<Integer> A = new ArrayList<Integer>();
		for(int i =0;i<a.length;i++) {
			A.add(a[i]);
		}
	//	System.out.println(A.size());
		
		int[] exp = {5,34,1};
		ArrayList<Integer> expected = new ArrayList<Integer>();
		for(int i =0;i<exp.length;i++) {
			expected.add(exp[i]);
		}
		ArrayList<Integer> actual = new ArrayList<Integer>();
		actual = MaximumPositive.solve(A);
		assertEquals(expected, actual);
	}
}
