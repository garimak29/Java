package com.example.practice;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class LargestNumberTest {

	@Test
	void test() {
		int[] a =  {3, 30, 34, 5, 9,321};
		List<Integer> arr = new ArrayList<Integer>();
		for(int i =0;i<a.length;i++) {
			arr.add(a[i]);
		}
		String expected = "9534330";
		String actual = LargestNumber.largestNumber(arr);
		assertEquals(expected, actual);
	}

}
