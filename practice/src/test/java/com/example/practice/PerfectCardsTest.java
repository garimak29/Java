package com.example.practice;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class PerfectCardsTest {

	@Test
	void test() {
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(1);
		A.add(1);
		A.add(2);
		A.add(2);
		A.add(3);
		String expected = "LOSE";
		String actual = PerfectCards.solve(A);
		assertEquals(expected, actual);
		
		
	}	@Test
	void test4() {
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(1);
		
		A.add(2);
		A.add(2);
		A.add(3);
		A.add(3);
		A.add(4);
		
		String expected = "LOSE";
		String actual = PerfectCards.solve(A);
		assertEquals(expected, actual);
		
		
	}
	@Test
	void test3() {
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(1);
		A.add(1);
		A.add(2);
		A.add(2);
		A.add(2);
		String expected = "LOSE";
		String actual = PerfectCards.solve(A);
		assertEquals(expected, actual);
		
		
	}

	
	@Test
	void test1() {
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(1);
		A.add(2);
		
		String expected = "WIN";
		String actual = PerfectCards.solve(A);
		assertEquals(expected, actual);
		
		
	}

@Test
void test5() {
	ArrayList<Integer> A = new ArrayList<Integer>();
	
	A.add(30);
	A.add(30);		A.add(30);
	A.add(30);		A.add(30);
	A.add(30);		A.add(30);
	A.add(30);		A.add(30);
	A.add(30);		A.add(30);
	A.add(30);		A.add(30);
	A.add(30);		A.add(30);
	A.add(30);		A.add(30);
	A.add(30);		A.add(30);
	A.add(30);		A.add(30);
	A.add(20);		A.add(20);
	A.add(20);		A.add(20);
	A.add(20);		A.add(20);
	A.add(20);		A.add(20);
	A.add(20);		A.add(20);
	A.add(20);		A.add(20);
	A.add(20);		A.add(20);
	A.add(20);		A.add(20);
	A.add(20);		A.add(20);
	A.add(20);		
		
	String expected = "LOSE";
	String actual = PerfectCards.solve(A);
	assertEquals(expected, actual);
	
	
}
}
