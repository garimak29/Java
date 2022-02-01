package com.example.practice;

//import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.Test;

class AnagramsTest {

	@Test
	void test() {
		List<String> A = new ArrayList<String>();
		A.add("cat");
		A.add("dog");
		A.add("god");
		A.add("tca");
		ArrayList<ArrayList<Integer>> expected = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> expected1 = new ArrayList<Integer>() ;
		ArrayList<Integer> expected2 = new ArrayList<Integer>();
		expected1.add(1);
		expected1.add(4);
		expected2.add(2);
		expected2.add(3);
		expected.add(expected1);
		expected.add(expected2);
		ArrayList<ArrayList<Integer>> actual = Anagrams.anagrams((java.util.List<String>) A);
		assertEquals(expected , actual);
	}
	
	@Test
	void test2() {
		List A = new ArrayList();
		A.add("rat");
		A.add("tar");
		A.add("art");
		
		ArrayList<ArrayList<Integer>> expected = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> expected1 = new ArrayList<Integer>();
		ArrayList<Integer> expected2 = new ArrayList<Integer>();
		expected1.add(1);
		expected1.add(2);
		expected1.add(3);
		expected.add(expected1);
		
		ArrayList<ArrayList<Integer>> actual = Anagrams.anagrams((java.util.List<String>) A);
		assertEquals(expected , actual);
	}
	
	@Test
	void test3() {
		List A = new ArrayList();
		A.add("cde");
		A.add("bee");
		ArrayList<ArrayList<Integer>> expected = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> expected1 = new ArrayList<Integer>();
		ArrayList<Integer> expected2 = new ArrayList<Integer>();
		expected1.add(1);
		expected2.add(2);
		expected.add(expected1);
		expected.add(expected2);
		ArrayList<ArrayList<Integer>> actual = Anagrams.anagrams((java.util.List<String>) A);
		assertEquals(expected , actual);
	}

}
