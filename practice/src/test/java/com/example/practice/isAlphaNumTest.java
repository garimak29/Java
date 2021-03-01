package com.example.practice;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class isAlphaNumTest {

	@Test
	void test() {
		ArrayList<Character> A = new ArrayList<Character> ();
		char[] a = {'S', 'c', 'a', 'l', 'e', 'r', 'A', 'c', 'a', 'd', 'e', 'm', 'y', '2', '0', '2', '0'};
	//	System.out.println(a[0]);
		for(int i =0;i<a.length;i++) {
			A.add(a[i]);
		}
		int expected = 1;
		int actual = isAlphaNum.solve(A);
		assertEquals(expected, actual);
	}

	@Test
	void tes1() {
		ArrayList<Character> A = new ArrayList<Character> ();
		char[] a = {'S', 'c', 'a', 'l', 'e', 'r', '#', '2', '0', '2', '0'};
	//	System.out.println(a[0]);
		for(int i =0;i<a.length;i++) {
			A.add(a[i]);
		}
		int expected = 0;
		int actual = isAlphaNum.solve(A);
		assertEquals(expected, actual);
	}

	@Test
	void tes2() {
		ArrayList<Character> A = new ArrayList<Character> ();
		char[] a = {'s', 'g', '7', 'A', 'd', 'v', 't', 'W', '4', 'A', '4', '2' , '9', '8', 'f', 'h', 'B', 'p', 'h', '7', '0', 'v', 'q', 'w', '9', 'o'};
	//	System.out.println(a[0]);
		for(int i =0;i<a.length;i++) {
			A.add(a[i]);
		}
		int expected = 1;
		int actual = isAlphaNum.solve(A);
		assertEquals(expected, actual);
	}
}
