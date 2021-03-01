package com.example.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class LongestCommonPrefixTest {

	@Test
	void test() {
		ArrayList<String> A = new ArrayList<String>();
		String[] a = {"abcdefgh", "aefghijk", "abcefgh"};
		for(int i =0;i<a.length;i++)
			A.add(a[i]);
		String expected = "a";
		String actual = LongestCommonPrefix.longestCommonPrefix(A);
		assertEquals(expected, actual);
	}

}
