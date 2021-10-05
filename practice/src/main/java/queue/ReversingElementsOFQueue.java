/*Reversing Elements Of Queue
Problem Description

Given an array of integers A and an integer B. We need to reverse the order of the first B elements of the array, leaving the other elements in the same relative order.

NOTE: You are required to first insert elements into an auxiliary queue then perform Reversal of first B elements.



Problem Constraints
1 <= B <= length of the array <= 500000
1 <= A[i] <= 100000



Input Format
The argument given is the integer array A and an integer B.



Output Format
Return an array of integer after reversing the first B elements of A using queue.



Example Input
Input 1:

 A = [1, 2, 3, 4, 5]
 B = 3
Input 2:

 A = [5, 17, 100, 11]
 B = 2


Example Output
Output 1:

 [3, 2, 1, 4, 5]
Output 2:

 [17, 5, 100, 11]


Example Explanation
Explanation 1:

 Reverse first 3 elements so the array becomes [3, 2, 1, 4, 5]
Explanation 2:

 Reverse first 2 elements so the array becomes [17, 5, 100, 11]
 * 
 * */

package queue;

import java.util.ArrayList;

import utilPackage.UtilClass;

public class ReversingElementsOFQueue {

	public static ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
		B = B % A.size() - 1;
		int revIndex = B, j = B + 1;
		System.out.println(revIndex);
		int len = A.size();
		ArrayList<Integer> res = new ArrayList<Integer>();
		// if (B - 1 >= 0 ) {
		if (B == -1) {
			revIndex = A.size() - 1;
			j = A.size();
		}
		while (len > 0) {
			if (revIndex >= 0) {
				res.add(A.get(revIndex));
				revIndex--;
			} else if (j < A.size()) {

				res.add(A.get(j));
				j++;
			}
			len--;
		}

		for (Integer integer : res) {
			System.out.println(res);

		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 43, 35, 25, 5, 34, 5, 8, 7 };
		// int[] a = {1 ,2 ,3,4,5 };
		ArrayList<Integer> arr = UtilClass.ArrayToArrayList(a);
		solve(arr, 8);

	}

}
/*
 * public int[] solve(int[] A, int B) {
        Deque < Integer > q = new ArrayDeque < Integer > (A.length);
        int i = 0;
        // Insert first B elements in queue
        for (i = 0; i < B; i++)
            q.addLast(A[i]);
        // Reverse the first B elements in the array A
        while (q.size() > 0) {
            i--;
            A[i] = q.getFirst();
            q.removeFirst();
        }
        return A;
    }
 * */
 