package com.example.practice;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class RearrangeArrayTest {

	@Test
	void test() {
		int[] a = {4, 0, 2, 1, 3};
		ArrayList<Integer> A = TestingPack.convertToArrayList(a);
		RearrangeArray.arrange(A);
	}

}
