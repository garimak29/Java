package com.example.practice;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class ToLowerTest {

	@Test
	void test() {
		char[] a = {'S', 'c', 'A', 'l', 'e', 'r', 'A', 'c', 'a', 'D', 'e', 'm', 'y'};
			
		ArrayList<Character> A = new ArrayList<Character>();
		for (int i =0;i<a.length;i++) {
			A.add(a[i]);
			
		}
		char[] e = {'s', 'c', 'a', 'l', 'e', 'r', 'a', 'c', 'a', 'd', 'e', 'm', 'y'};
		
		ArrayList<Character> expected = new ArrayList<Character>();
		for (int i =0;i<e.length;i++) {
			expected.add(e[i]);
			
		}
		ArrayList<Character> actual = ToLower.to_lower(A);
		assertEquals(expected, actual);
		
	}
	
	@Test
	void test1() {
		char[] a = {'S', 'c', 'a', 'L', 'e', 'r', '#', '2', '0', '2', '0'};
			
		ArrayList<Character> A = new ArrayList<Character>();
		for (int i =0;i<a.length;i++) {
			A.add(a[i]);
			
		}
		char[] e = {'s', 'c', 'a', 'l', 'e', 'r', '#', '2', '0', '2', '0'};
		
		ArrayList<Character> expected = new ArrayList<Character>();
		for (int i =0;i<e.length;i++) {
			expected.add(e[i]);
			
		}
		ArrayList<Character> actual = ToLower.to_lower(A);
		assertEquals(expected, actual);
		
	}

}
