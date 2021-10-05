/*
 *Divisor game
Problem Description

Scooby has 3 three integers A, B and C.

Scooby calls a positive integer special if it is divisible by B and it is divisible by C. You need to tell number of special integers less than or equal to A.



Problem Constraints
1 <= A, B, C <= 109



Input Format
First argument is a positive integer A
Second argument is a positive integer B
Third argument is a positive integer C



Output Format
One integer corresponding to the number of special integers less than or equal to A.



Example Input
Input 1:

 A = 12
 B = 3
 C = 2
Input 2:

 A = 6
 B = 1
 C = 4


Example Output
Output 1:

 2
Output 2:

 1


Example Explanation
Explanation 1:

 The two integers divisible by 2 and 3 and less than or equal to 12 are 6,12.
Explanation 2:

 Only 4 is a positive integer less than equal to 6 which is divisible by 1 and 4.

 
 * 
 * */

package com.example.maths;

public class DivisorGame {

	// not so simple , we need to calculate lcm
	public static int solve(int A, int B, int C) {
		int res = 0;

		for (long i = (B * C); i <= A; i++) {
			if (A % i == 0)
				res++;
		}
		return res;
	}

	/*
	 * Euclidean algo states that lcm = b*c/gcd(b , c) gcd = (b%c , c) where b is
	 * biggervalue and c is smaller value
	 */

	public static int gcd(int b, int c) {
		if (b == 0 || c == 0) {
			return b + c; // why b+C coz 1 number will be 0 and gcd will be the other one
		} else {
			b = Math.abs(b);
			c = Math.abs(c);
			int big = Math.max(c, b);
			int small = Math.min(c, b);

			return gcd(big % small, small);
		}
	}

	public static int lcm(int b, int c) {
		System.out.println("gcd" + gcd(b, c));
		int res = (b * c) / gcd(b, c);
		return res;
	}

	public static int solve1(int A, int B, int C) {
		int res = 0;
		int lcm = lcm(B, C);
		System.out.println(lcm);
		for (long i = lcm; i <= A;) {
			if (i % lcm == 0) {
				res++;
				i = i+lcm;
			}
			else
				i++;
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solve1(81991, 2549, 7));

	}

}

/*
 * 
 * public class Solution {
    public int gcd(int x, int y) {
        if (x == 0)
            return y;
        return gcd(y % x, x);
    }
    public int solve(int A, int B, int C) {
        long lcm = (long) B * C / gcd(B, C);
        if (lcm > A)
            return 0;
        return (int)(A / lcm);
    }
}
 * 
 * */
 