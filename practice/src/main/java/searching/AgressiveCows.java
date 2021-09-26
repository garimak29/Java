/*
 * Aggressive cows
Problem Description

Farmer John has built a new long barn, with N stalls. Given an array of integers A of size N where each element of the array represents the location of the stall, and an integer B which represent the number of cows.

His cows don't like this barn layout and become aggressive towards each other once put into a stall. To prevent the cows from hurting each other, John wants to assign the cows to the stalls, such that the minimum distance between any two of them is as large as possible. What is the largest minimum distance?



Problem Constraints
2 <= N <= 100000
0 <= A[i] <= 109
2 <= B <= N



Input Format
The first argument given is the integer array A.
The second argument given is the integer B.



Output Format
Return the largest minimum distance possible among the cows.



Example Input
Input 1:

A = [1, 2, 3, 4, 5]
B = 3
Input 2:

A = [1, 2]
B = 2


Example Output
Output 1:

 2
Output 2:

 1


Example Explanation
Explanation 1:

 
John can assign the stalls at location 1,3 and 5 to the 3 cows respectively.
So the minimum distance will be 2.
Explanation 2:

 
The minimum distance will be 1.

 * */
package searching;

import java.util.ArrayList;
import utilPackage.*;

public class AgressiveCows {

	public static int solve(ArrayList<Integer> A, int B) {
		
		int max = A.get(A.size() - 1) - A.get(0);
	
		ArrayList<Integer> answerSpace = new ArrayList<Integer>();
		answerSpace.add(0);
		answerSpace.add(max);
		int mid = 0, temp = B;
		int possibleAnswer = 0;
		int start = 0, end = max, j = 0;
		ArrayList<Integer> cowPos = new ArrayList<Integer>();
		while (start < end) {
			temp = B;
			mid = start + (end - start) / 2;
			if (cowPos.size() == 0) {
				System.out.println(" in " + cowPos.size() + " : " + j);
				cowPos.add(A.get(j));
			}

			for (int i = 1; i < A.size() ; i++) {
				System.out.println(mid + cowPos.get(j) +" -- >"+ A.get(i));
				if (mid + cowPos.get(j) <= A.get(i)) {
					System.out.println(" in  ");
					
					j++;
					temp--;
					cowPos.add(A.get(i ));

				}

			}
			System.out.println("final size"+cowPos.size());
			if (cowPos.size() == B) {
				if (mid > possibleAnswer)
					possibleAnswer = mid;
				System.out.println(possibleAnswer +" ---");
				start = mid + 1;

			} else {
				end = mid - 1;
			}
			j = 0;
			cowPos.removeAll(cowPos);
			System.out.println("mid : " + mid);

		}
		if(A.size() == B)
			possibleAnswer = B;
		return possibleAnswer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 5, 17, 100, 11 };
		int B = 2;

		System.out.println(solve(UtilClass.ArrayToArrayList(a), B));

	}

}
