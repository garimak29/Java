/*
 * 
 * 
 * A, B and Modulo
Problem Description

Given two integers A and B, find the greatest possible positive M, such that A % M = B % M.



Problem Constraints
1 <= A, B <= 109
A != B



Input Format
The first argument given is the integer, A.
The second argument given is the integer, B.



Output Format
Return an integer denoting greatest possible positive M.



Example Input
Input 1:

A = 1
B = 2
Input 2:

A = 5
B = 10


Example Output
Output 1:

1
Output 2:

5


Example Explanation
Explanation 1:

1 is the largest value of M such that A % M == B % M.
Explanation 2:

For M = 5, A % M = 0 and B % M = 0.

No value greater than M = 5, satisfies the condition.*/

package com.example.maths;

public class ABModulo {

	public static int solve(int A, int B) {
		int max = Math.max(A, B);
		int min = Math.min(A, B);
		int res = -1;

		res = max - min;
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solve(7939569, 7927328));
		System.out.println(solve(4611745, 4316416));
		System.out.println(solve(7471976, 6029155));

	}

}
