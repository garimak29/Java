package com.example.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class DeleteElementsTest {

	@Test
	void test() {
	int[] A = {7, 2, 5};
	ArrayList<Integer> Ar = new ArrayList<Integer>();
	for(int i =0;i<A.length;i++) {
		Ar.add(A[i]);
	}
	int expected =0;
	int actual = DeleteElements.solve(Ar);
	assertEquals(expected, actual);
	}
	
	@Test
	void test1() {
	int[] A = {2,4,6};
	ArrayList<Integer> Ar = new ArrayList<Integer>();
	for(int i =0;i<A.length;i++) {
		Ar.add(A[i]);
	}
	int expected =-1;
	int actual = DeleteElements.solve(Ar);
	assertEquals(expected, actual);
	}

}
