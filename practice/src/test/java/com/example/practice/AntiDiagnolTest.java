package com.example.practice;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AntiDiagnolTest {

	@Test
	void test() {
		int[][] expected = {
			     {1},
			     {2,4,7},
			     {3,5},
			     {6,8},
			     {9}
			};
		int[][] res = {
				{1,2,3},{4,5,6},{7,8,9}
		};
		int[][] actual = AntiDiagnol.diagonal(res);
		assertEquals(actual, expected);
	}

}
