/*Inversion count in an array
Problem Description

Given an array of integers A. If i < j and A[i] > A[j] then the pair (i, j) is called an inversion of A. Find the total number of inversions of A modulo (109 + 7).



Problem Constraints
1 <= length of the array <= 100000

1 <= A[i] <= 10^9



Input Format
The only argument given is the integer array A.



Output Format
Return the number of inversions of A modulo (109 + 7).



Example Input
Input 1:

A = [3, 2, 1]
Input 2:

A = [1, 2, 3]


Example Output
Output 1:

3
Output 2:

0


Example Explanation
Explanation 1:

 All pairs are inversions.
Explanation 2:

 No inversions.
*/
package com.example.practice;

import java.util.ArrayList;
import java.util.Collections;

public class InversionCount {
	public static int naive(ArrayList<Integer> A) {
		double count = 0;

		for (int i = 0; i < A.size(); i++) {
			for (int j = i; j < A.size(); j++) {
				if (A.get(i) > A.get(j))
					count++;
			}
		}

		return (int) ((count) % (Math.pow(10, 9) + 7));
	}

	public static int mine(ArrayList<Integer> A) {
		double count = 0;
	System.out.println("starting");
		switch(2) {
		case 1:System.out.println(1);
		case 2:
		case 3:System.out.println(3);
		}
		System.out.println("starting");
		return (int) ((count) % (Math.pow(10, 9) + 7));
	}

	public static int optimal(ArrayList<Integer> A) {
		double count = 0;

		for (int i = 0; i < A.size(); i++) {
			for (int j = i; j < A.size(); j++) {
				if (A.get(i) > A.get(j))
					count++;
			}
		}

		return (int) ((count) % (Math.pow(10, 9) + 7));
	}

	public static void main(String[] args) {
		int[] a = { 3, 2, 1 };
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			arr.add(a[i]);
		}

		System.out.println(naive(arr));
		System.out.println(mine(arr));
		System.out.println(optimal(arr));
	}
}
