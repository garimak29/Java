package com.example.practice;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class ContigousArrayTest {

	@Test
	void test() {
		int[] a = {1, 0, 1, 0, 1};
		ArrayList<Integer> A = new ArrayList<Integer>();
		for(int i =0;i<a.length;i++) {
			A.add(a[i]);
		}
	//	System.out.println(A.size());
		
		int expected = 4;
		int actual = ContigousArray.solve(A);
		assertEquals(expected, actual);
	}
	
	@Test
	void test1() {
		System.out.println("check this case");
		
		int[] a = {1, 1, 1, 0};
		ArrayList<Integer> A = new ArrayList<Integer>();
		for(int i =0;i<a.length;i++) {
			A.add(a[i]);
		}
	//	System.out.println(A.size());
		
		int expected = 2;
		int actual = ContigousArray.solve(A);
		assertEquals(expected, actual);
	}
	@Test
	void test2() {
		int[] a = {0, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1 };
		ArrayList<Integer> A = new ArrayList<Integer>();
		for(int i =0;i<a.length;i++) {
			A.add(a[i]);
		}
	//	System.out.println(A.size());
		
		int expected = 10;
		int actual = ContigousArray.solve(A);
		assertEquals(expected, actual);
	}
}
