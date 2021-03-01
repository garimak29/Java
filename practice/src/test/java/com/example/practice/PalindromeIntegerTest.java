package com.example.practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalindromeIntegerTest {

	@Test
	void test() {
		int A = 12121;
		int expected = 1;
		int actual =PalindromeInteger.isPalindrome(A);
	}
	
	@Test
	void test1() {
		int A = 123;
		int expected = 0;
		int actual =PalindromeInteger.isPalindrome(A);
	}

	
	@Test
	void test2() {
		int A = 2147447412;
		int expected = 1;
		int actual =PalindromeInteger.isPalindrome(A);
	}

}
