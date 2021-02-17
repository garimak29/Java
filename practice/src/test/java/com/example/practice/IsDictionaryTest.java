package com.example.practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IsDictionaryTest {

	@Test
	void test() {
		String[] A = {"hello", "scaler", "interviewbit"};
				String B = "adhbcfegskjlponmirqtxwuvzy";
				int expected = 1;
				int actual = IsDictionary.solve(A, B);
				assertEquals(expected, actual);
	}
	
	@Test

	void test1() {
		String[] A = {"fine", "none", "no"};
				String B = "qwertyuiopasdfghjklzxcvbnm";
				int expected = 0;
				int actual = IsDictionary.solve(A, B);
				assertEquals(expected, actual);
	}
	@Test

	void test2() {
		String[] A = {"ipial", "qjqgt", "vfnue", "vjqfp", "eghva", "ufaeo", "atyqz", "chmxy", "ccvgv", "ghtow"};
				String B = "nbpfhmirzqxsjwdoveuacykltg";
				int expected = 1;
				int actual = IsDictionary.solve(A, B);
				assertEquals(expected, actual);
	}
	
	
}
