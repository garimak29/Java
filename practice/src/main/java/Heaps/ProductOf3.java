/*
 * Problem Description

Given an integer array A of size N.

You have to find the product of the 3 largest integers in array A from range 1 to i, where i goes from 1 to N.

Return an array B where B[i] is the product of the largest 3 integers in range 1 to i in array A. If i < 3, then the integer at index i is -1.



Problem Constraints

1 <= N <= 105
0 <= A[i] <= 103



Input Format

First and only argument is an integer array A.



Output Format

Return an integer array B. B[i] denotes the product of the largest 3 integers in range 1 to i in array A.



Example Input

Input 1:

 A = [1, 2, 3, 4, 5]
Input 2:

 A = [10, 2, 13, 4]


Example Output

Output 1:

 [-1, -1, 6, 24, 60]
Output 2:

 [-1, -1, 260, 520]


Example Explanation

Explanation 1:

 For i = 1, ans = -1
 For i = 2, ans = -1
 For i = 3, ans = 1 * 2 * 3 = 6
 For i = 4, ans = 2 * 3 * 4 = 24
 For i = 5, ans = 3 * 4 * 5 = 60

 So, the output is [-1, -1, 6, 24, 60].
 
Explanation 2:

 For i = 1, ans = -1
 For i = 2, ans = -1
 For i = 3, ans = 10 * 2 * 13 = 260
 For i = 4, ans = 10 * 13 * 4 = 520

 So, the output is [-1, -1, 260, 520].
 
 * 
 * */

package Heaps;

import java.util.ArrayList;

public class ProductOf3 {

	 public static ArrayList<Integer> solve(ArrayList<Integer> A) {
		 ArrayList<Integer> res =  new ArrayList<Integer>();
		  int prod = 1;
		 if(A.size() > 3)
		 {
			 prod = A.get(0) * A.get(1) * A.get(2);
			 res.add(-1);
			 res.add(-1);
			 res.add(prod);
		 }
		 /*
		  * 2 pointer
		  * 1 2 3 4 5
		  * i   j
		  * */
		 for(int i =3;i<A.size();i++) {
			prod = prod/(A.get(i-3));
			prod *= A.get(i);
			res.add(prod);
		 }
		 
		 return res;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4,5};
		ArrayList<Integer> A = utilPackage.UtilClass.ArrayToArrayList(a);
		System.out.println(solve(A));
	}

}
