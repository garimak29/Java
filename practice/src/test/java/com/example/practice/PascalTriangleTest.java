package com.example.practice;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class PascalTriangleTest {

	@SuppressWarnings("deprecation")
	@Test
	public void test() {
		//fail("Not yet implemented"); // TODO
		
		int[][] expected = {
			     {1},
			     {1,1},
			     {1,2,1},
			     {1,3,3,1},
			     {1,4,6,4,1}
			};
		int[][] actual = PascalTriangle.solve(5);
		assertEquals(actual, expected);
	}

}
