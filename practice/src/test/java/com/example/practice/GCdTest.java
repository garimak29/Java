package com.example.practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GCdTest {

	@Test
	void test() {
		int a = 2, b =6;
		int expected = 2;
		int actual = GCd.gcd(a, b);
		assertEquals(expected, actual);
	}

}
