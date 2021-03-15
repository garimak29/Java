package com.example.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class MajorityElementTest {

	@Test
	void test() {
		int[] a = {2,1,2};
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr=TestingPack.convertToArrayList(a);
		int expected = 2;
		int actual = MajorityElement.majorityElement(arr);
		assertEquals(expected, actual);
	}
	
	@Test
	void test1() {
		int[] a = {2,1,1};
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr=TestingPack.convertToArrayList(a);
		int expected = 1;
		int actual = MajorityElement.majorityElement(arr);
		assertEquals(expected, actual);
	}

}
