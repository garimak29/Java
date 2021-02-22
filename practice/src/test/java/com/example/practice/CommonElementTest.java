package com.example.practice;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class CommonElementTest {

	@Test
	void test() {
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(1);
		A.add(2);
		A.add(2);
		A.add(1);
		ArrayList<Integer> B = new ArrayList<Integer>();
		B.add(1);
		B.add(2);
		B.add(3);
		B.add(2);
		ArrayList<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		expected.add(2);
		expected.add(2);
		ArrayList<Integer> actual = new ArrayList<Integer>();
		actual = CommonElement.solve(A, B);
		assertEquals(expected, actual);
		
		
		
		
		
	}@Test
	void test1() {
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(2);
		A.add(1);
		A.add(4);
		A.add(10);
		ArrayList<Integer> B = new ArrayList<Integer>();
		B.add(3);
		B.add(6);
		B.add(2);
		B.add(10);
		B.add(10);
		ArrayList<Integer> expected = new ArrayList<Integer>();
	
		expected.add(2);
		expected.add(10);
		ArrayList<Integer> actual = new ArrayList<Integer>();
		actual = CommonElement.solve(A, B);
		assertEquals(expected, actual);
		
		
		
		
		
	}

}
