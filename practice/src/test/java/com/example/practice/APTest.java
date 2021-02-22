package com.example.practice;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class APTest {

	@Test
	void test() {
		 ArrayList<Integer> A = new ArrayList<Integer>();
		int expected =1;
		
		 A.add(3);
		 A.add(5);
		 A.add(1);
		
		 
		int actual = AP.solve(A);
		 assertEquals(expected, actual);
		 
	}

	@Test
	void test1() {
		 ArrayList<Integer> A = new ArrayList<Integer>();
		int expected =0;
		
		 A.add(2);
		 A.add(4);
		 A.add(1);
		
		 
		int actual = AP.solve(A);
		 assertEquals(expected, actual);
		 
	}
}
