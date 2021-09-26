/*Rotation Game
Problem Description

You are given an integer array A and an integer B. You have to print the same array after rotating it B times towards right.

NOTE: You can use extra memory.



Problem Constraints
1 <= |A| <= 106

1 <= A[i] <= 109

1 <= B <= 109



Input Format
First line begins with an integer |A| denoting the length of array, and then |A| integers denote the array elements.
Second line contains a single integer B



Output Format
Print an array of integers which is the Bth right rotation of input array A, on a separate line.



Example Input
Input 1:

 4 1 2 3 4
 2
Input 2:

 3 1 2 2
 3


Example Output
Output 1:

 3 4 1 2
Output 2:

 1 2 2


Example Explanation
Explanation 1:

 [1,2,3,4] => [4,1,2,3] => [3,4,1,2]

Explanation 2:


 [1,2,2] => [2,1,2] => [2,2,1] => [1,2,2]

See Expected Output
 * */
package com.example.arrays;

import java.util.Scanner;

public class RotationGame {

	public static int[] solve(int[] A, int n, int rot) {
		rot = rot % n;
		int temp = rot;
		int[] B = new int[n];
		for (int i = 0; i < n; i++) {
			if (temp > 0) {
				B[i] = A[n - temp];
				temp--;
			} else
				B[i] = A[i - rot];

		}
		for (int j = 0; j < n; j++)
			System.out.print(B[j] + " ");
		return B;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();

		int[] A = new int[length];
		for (int i = 0; i < length; i++) {
			A[i] = sc.nextInt();
		}
		int rot = sc.nextInt();
		int[] B = new int[length];
		B = solve(A, length, rot);
		// System.out.println(solve(A , n , rot));

	}

}
