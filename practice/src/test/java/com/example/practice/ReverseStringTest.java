package com.example.practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseStringTest {

	@Test
	void testSolve() {
		
		String  A = "the sky is blue";
		String expected = "blue is sky the";
		String actual = ReverseString.solve(A);
		assertEquals(expected, actual);
	}
	@Test
	void testSolve2() {
		
		String  A = "       fwbpudnbrozzifml osdt ulc jsx kxorifrhubk ouhsuhf sswz qfho dqmy sn myq igjgip iwfcqq";
		String expected = "iwfcqq igjgip myq sn dqmy qfho sswz ouhsuhf kxorifrhubk jsx ulc osdt fwbpudnbrozzifml";
		String actual = ReverseString.solve(A);
		assertEquals(expected, actual);
	}
	@Test
	void testSolve3() {
		
		String  A = "qxkpvo  f   w vdg t wqxy ln mbqmtwwbaegx   mskgtlenfnipsl bddjk znhksoewu zwh bd fqecoskmo";
		String expected = "fqecoskmo bd zwh znhksoewu bddjk mskgtlenfnipsl mbqmtwwbaegx ln wqxy t vdg w f qxkpvo";
		String actual = ReverseString.solve(A);
		assertEquals(expected, actual);
	}
	
	@Test
	void testSolve1() {
		
		String  A = "the";
		String expected = "the";
		String actual = ReverseString.solve(A);
		assertEquals(expected, actual);
	}

}
