package com.example.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class IntersectionOfSortedArrayTest {

	@Test
	void test() {
		int[] a = {1,2,3,3,4,5,6};
		int[] b = {3,3,5};
		int[] exp = {3,3,5};
		ArrayList<Integer> A = new ArrayList<Integer>();
		A = TestingPack.convertToArrayList(a);
		ArrayList<Integer> B= new ArrayList<Integer>();
		B = TestingPack.convertToArrayList(b);
		ArrayList<Integer> expected = new ArrayList<Integer>();
		expected = TestingPack.convertToArrayList(exp);
		ArrayList<Integer> actual = new ArrayList<Integer>();
		actual = IntersectionOfSortedArray.intersect(A, B);
		assertEquals(expected , actual);
	}
	@Test
	void test1() {
	//	System.out.println("Check this case");
		int[] a = {1, 3, 8, 10, 13, 13, 16, 16, 16, 18, 21, 23, 24, 31, 31, 31, 33, 35, 35, 37, 37, 38, 40, 41, 43, 47, 47, 48, 48, 52, 52, 53, 53, 55, 56, 60, 60, 61, 61, 63, 63, 64, 66, 67, 67, 68, 69, 71, 80, 80, 80, 80, 80, 80, 81, 85, 87, 87, 88, 89, 90, 94, 95, 97, 98, 98, 100, 101 };
		int[] b = {5, 7, 14, 14, 25, 28, 28, 34, 35, 38, 38, 39, 46, 53, 65, 67, 69, 70, 78, 82, 94, 94, 98};
		int[] exp = {35,38,53,67,69,94,98};
		ArrayList<Integer> A = new ArrayList<Integer>();
		A = TestingPack.convertToArrayList(a);
		ArrayList<Integer> B= new ArrayList<Integer>();
		B = TestingPack.convertToArrayList(b);
		ArrayList<Integer> expected = new ArrayList<Integer>();
		expected = TestingPack.convertToArrayList(exp);
		ArrayList<Integer> actual = new ArrayList<Integer>();
		actual = IntersectionOfSortedArray.intersect(A, B);
		assertEquals(expected , actual);
	}
	
	@Test
	void test2() {
	//	System.out.println("Check this case");
		int[] a = {10000000 };
		int[] b = 	 {10000000 };
		int[] exp =  {10000000 };
		ArrayList<Integer> A = new ArrayList<Integer>();
		A = TestingPack.convertToArrayList(a);
		ArrayList<Integer> B= new ArrayList<Integer>();
		B = TestingPack.convertToArrayList(b);
		ArrayList<Integer> expected = new ArrayList<Integer>();
		expected = TestingPack.convertToArrayList(exp);
		ArrayList<Integer> actual = new ArrayList<Integer>();
		actual = IntersectionOfSortedArray.intersect(A, B);
		assertEquals(expected , actual);
	}
	@Test
	void test3() {
	//	System.out.println("Check this case");
		int[] a = {  1, 5, 7, 8, 9, 10, 10, 14, 16, 16, 17, 19, 20, 20, 20, 20, 21, 23, 26, 27, 29, 30, 30, 30, 31, 32, 33, 33, 34, 35, 35, 36, 37, 39, 39, 41, 42, 43, 43, 44, 44, 45, 46, 46, 47, 49, 51, 52, 53, 55, 55, 56, 57, 58, 59, 60, 65, 66, 66, 68, 68, 69, 69, 70, 70, 70, 71, 73, 75, 75, 75, 79, 80, 80, 81, 82, 85, 87, 91, 92, 98, 98, 98, 99, 100, 101};
		int[] b = 	 {4, 7, 10, 10, 15, 17, 19, 20, 24, 27, 27, 30, 31, 35, 40, 41, 42, 46, 48, 49, 50, 51, 54, 57, 62, 62, 63, 66, 67, 68, 69, 70, 71, 73, 74, 78, 80, 81, 92, 94, 99, 101  };
		int[] exp =  {7,10,10,17,19,20,27,30,31,35,41,42,46,49,51,57,66,68,69,70,71,73,80,81,92,99,101 };
		ArrayList<Integer> A = new ArrayList<Integer>();
		A = TestingPack.convertToArrayList(a);
		ArrayList<Integer> B= new ArrayList<Integer>();
		B = TestingPack.convertToArrayList(b);
		ArrayList<Integer> expected = new ArrayList<Integer>();
		expected = TestingPack.convertToArrayList(exp);
		ArrayList<Integer> actual = new ArrayList<Integer>();
		actual = IntersectionOfSortedArray.intersect(A, B);
		assertEquals(expected , actual);
	}
	
	@Test
	void test4() {
	//	System.out.println("Check this case");
		int[] a = {  2, 3, 3, 4, 4, 6, 8, 8, 9, 9, 10, 10, 11, 14, 14, 15, 16, 18, 20, 21, 23, 23, 24, 25, 28, 29, 33, 33, 35, 35, 37, 38, 38, 40, 41, 42, 42, 44, 44, 47, 47, 49, 49, 52, 53, 56, 58, 61, 62, 62, 63, 64, 65, 65, 66, 67, 67, 67, 68, 69, 72, 74, 76, 76, 79, 80, 82, 82, 83, 83, 83, 84, 85, 85, 85, 85, 87, 91, 93, 94, 94, 94, 95, 96, 101, 101 };
		int[] b = 	 {12, 12, 20, 39, 42, 44, 47, 73, 77};
		int[] exp = {20 ,42, 44, 47};
		ArrayList<Integer> A = new ArrayList<Integer>();
		A = TestingPack.convertToArrayList(a);
		ArrayList<Integer> B= new ArrayList<Integer>();
		B = TestingPack.convertToArrayList(b);
		ArrayList<Integer> expected = new ArrayList<Integer>();
		expected = TestingPack.convertToArrayList(exp);
		ArrayList<Integer> actual = new ArrayList<Integer>();
		actual = IntersectionOfSortedArray.intersect(A, B);
		assertEquals(expected , actual);
	}
	
	@Test
	void test5() {
	//	System.out.println("Check this case");
		int[] a = {  12, 30, 41, 51, 56, 58, 63, 67, 82, 90, 93};
		int[] b = 	 {7, 9, 17, 17, 19, 21, 26, 34, 65, 65, 67, 68, 71, 75, 92};
		int[] exp = {67};
		ArrayList<Integer> A = new ArrayList<Integer>();
		A = TestingPack.convertToArrayList(a);
		ArrayList<Integer> B= new ArrayList<Integer>();
		B = TestingPack.convertToArrayList(b);
		ArrayList<Integer> expected = new ArrayList<Integer>();
		expected = TestingPack.convertToArrayList(exp);
		ArrayList<Integer> actual = new ArrayList<Integer>();
		actual = IntersectionOfSortedArray.intersect(A, B);
		assertEquals(expected , actual);
	
}
	
	@Test
	void test6() {
	//	System.out.println("Check this case");
		int[] a = {  1 , 12, 14, 17, 18, 18, 27, 31, 31, 32, 33, 38, 39, 45, 46, 46, 47, 49, 50, 54, 54, 55, 56, 58, 61, 65, 65, 67, 68, 70, 72, 75, 76, 79, 80, 81, 84, 88, 88, 88, 89, 90, 94, 96, 96, 98, 100};
		int[] b ={2, 3, 4, 5, 5, 6, 7, 7, 9, 10, 17, 22, 24, 27, 27, 30, 31, 33, 33, 36, 37, 40, 41, 43, 45, 45, 47, 47, 48, 51, 54, 54, 54, 61, 65, 65, 67, 67, 68, 68, 74, 76, 80, 81, 86, 87, 90, 92, 95, 97, 97, 98, 98, 98, 101 };
		int[] exp = {17,27,31,33,45,47,54,54,61,65,65,67,68,76,80,81,90,98};
		ArrayList<Integer> A = new ArrayList<Integer>();
		A = TestingPack.convertToArrayList(a);
		ArrayList<Integer> B= new ArrayList<Integer>();
		B = TestingPack.convertToArrayList(b);
		ArrayList<Integer> expected = new ArrayList<Integer>();
		expected = TestingPack.convertToArrayList(exp);
		ArrayList<Integer> actual = new ArrayList<Integer>();
		actual = IntersectionOfSortedArray.intersect(A, B);
		assertEquals(expected , actual);
	
}
	
	@Test
	void test7() {
		System.out.println("Check this case");
		int[] a = { 4, 5, 5, 5, 8, 9, 10, 10, 10, 11, 11, 12, 13, 14, 14, 15, 18, 20, 21, 21, 22, 22, 26, 26, 28, 29, 30, 30, 35, 35, 36, 37, 38, 38, 41, 41, 45, 45, 47, 47, 49, 50, 50, 50, 50, 53, 62, 66, 67, 70, 72, 74, 75, 75, 77, 79, 79, 81, 85, 91, 92, 92, 96, 99, 99 };
		int[] b ={1, 4, 4, 8, 10, 13, 18, 19, 21, 21, 24, 24, 24, 24, 24, 25, 26, 28, 28, 29, 30, 31, 32, 33, 36, 38, 39, 51, 52, 53, 56, 56, 57, 58, 59, 60, 61, 62, 64, 67, 67, 70, 70, 72, 72, 74, 77, 77, 78, 79, 80, 83, 85, 86, 86, 93, 93, 96, 97, 97, 97, 98, 98, 99, 101 };
		int[] exp = {4,8,10,13,18,21,21,26,28,29,30,36,38,53,62,67,70,72,74,77,79,85,96,99};
		ArrayList<Integer> A = new ArrayList<Integer>();
		A = TestingPack.convertToArrayList(a);
		ArrayList<Integer> B= new ArrayList<Integer>();
		B = TestingPack.convertToArrayList(b);
		ArrayList<Integer> expected = new ArrayList<Integer>();
		expected = TestingPack.convertToArrayList(exp);
		ArrayList<Integer> actual = new ArrayList<Integer>();
		actual = IntersectionOfSortedArray.intersect(A, B);
		assertEquals(expected , actual);
	
}

}