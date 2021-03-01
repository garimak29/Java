package com.example.practice;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class IsAlphaTest {

	

	@Test
	void test() {
		ArrayList<Character> A = new ArrayList<Character> ();
		char[] a = {'S', 'c', 'a', 'l', 'e', 'r', 'A', 'c', 'a', 'd', 'e', 'm', 'y'};
	//	System.out.println(a[0]);
		for(int i =0;i<a.length;i++) {
			A.add(a[i]);
		}
		int expected = 1;
		int actual = IsAlpha.solve(A);
		assertEquals(expected, actual);
	}
	@Test
	void test1() {
		ArrayList<Character> A = new ArrayList<Character> ();
		char[] a = {'S', 'c', 'a', 'l', 'e', 'r', '#', '2', '0', '2', '0'};
		
		for(int i =0;i<a.length;i++) {
			A.add(a[i]);
		}
		int expected = 0;
		int actual = IsAlpha.solve(A);
		assertEquals(expected, actual);
	}

}
