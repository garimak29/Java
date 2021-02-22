package com.example.practice;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

class KthSmallestElementTest {

	@Test
	void test() {
		List<Integer> a = new ArrayList<Integer>();
		a.add(2);
		a.add(1);
		a.add(4);
		a.add(3);
		a.add(2);
		
		int expected =2;
		int actual = KthSmallestElement.kthsmallest(a, 3);
		assertEquals(expected, actual);
		
		
	}

}
