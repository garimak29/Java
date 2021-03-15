package com.example.practice;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class LittlePonyExtraQuestionTest {

	@Test
	void test() {
		int[] a = {36,75, 87, 60,36,91,96};
		ArrayList<Integer> A = new ArrayList<Integer>();
		for(int i =0;i<a.length;i++) {
			A.add(a[i]);
		}
	//	System.out.println(A.size());
		
		int[] exp = {2 , 7};
		ArrayList<Integer> expected = new ArrayList<Integer>();
		for(int i =0;i<exp.length;i++) {
			expected.add(exp[i]);
		}
		ArrayList<Integer> actual = new ArrayList<Integer>();
		actual = LittlePonyExtraQuestion.solve(A);
		assertEquals(expected, actual);
	}
	@Test
	void test1() {
		int[] a = {27,27,61,59,33,27,62,27,27,27};
		ArrayList<Integer> A = new ArrayList<Integer>();
		for(int i =0;i<a.length;i++) {
			A.add(a[i]);
		}
	//	System.out.println(A.size());
		
		int[] exp = {3 , 5};
		ArrayList<Integer> expected = new ArrayList<Integer>();
		for(int i =0;i<exp.length;i++) {
			expected.add(exp[i]);
		}
		ArrayList<Integer> actual = new ArrayList<Integer>();
		actual = LittlePonyExtraQuestion.solve(A);
		assertEquals(expected, actual);
	}

	@Test
	void test2() {
		int[] a = {83 , 94 , 33 ,45, 72,33};
		ArrayList<Integer> A = new ArrayList<Integer>();
		for(int i =0;i<a.length;i++) {
			A.add(a[i]);
		}
	//	System.out.println(A.size());
		
		int[] exp = {1 ,3};
		ArrayList<Integer> expected = new ArrayList<Integer>();
		for(int i =0;i<exp.length;i++) {
			expected.add(exp[i]);
		}
		ArrayList<Integer> actual = new ArrayList<Integer>();
		actual = LittlePonyExtraQuestion.solve(A);
		assertEquals(expected, actual);
	}@Test
	void test3() {
		int[] a = {25,25,25,25,25,25};
		ArrayList<Integer> A = new ArrayList<Integer>();
		for(int i =0;i<a.length;i++) {
			A.add(a[i]);
		}
	//	System.out.println(A.size());
		
		int[] exp = {1 ,1};
		ArrayList<Integer> expected = new ArrayList<Integer>();
		for(int i =0;i<exp.length;i++) {
			expected.add(exp[i]);
		}
		ArrayList<Integer> actual = new ArrayList<Integer>();
		actual = LittlePonyExtraQuestion.solve(A);
		assertEquals(expected, actual);
	}

}
