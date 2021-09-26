/*
 * Sliding Window Maximum
Problem Description

Given an array of integers A. There is a sliding window of size B which is moving from the very left of the array to the very right. You can only see the B numbers in the window. Each time the sliding window moves rightwards by one position. You have to find the maximum for each window.

Return an array C, where C[i] is the maximum value in the array from A[i] to A[i+B-1].

Refer to the given example for clarity.

NOTE: If B > length of the array, return 1 element with the max of the array.



Problem Constraints
1 <= |A|, B <= 106



Input Format
The first argument given is the integer array A.

The second argument given is the integer B.



Output Format
Return an array C, where C[i] is the maximum value of from A[i] to A[i+B-1].



Example Input
Input 1:

 A = [1, 3, -1, -3, 5, 3, 6, 7]
 B = 3
Input 2:

 A = [1, 2, 3, 4, 2, 7, 1, 3, 6]
 B = 6


Example Output
Output 1:

 [3, 3, 5, 5, 6, 7]
Output 2:

 [7, 7, 7, 7]


Example Explanation
Explanation 1:

 Window position     | Max
 --------------------|-------
 [1 3 -1] -3 5 3 6 7 | 3
 1 [3 -1 -3] 5 3 6 7 | 3
 1 3 [-1 -3 5] 3 6 7 | 5
 1 3 -1 [-3 5 3] 6 7 | 5
 1 3 -1 -3 [5 3 6] 7 | 6
 1 3 -1 -3 5 [3 6 7] | 7
Explanation 2:

 Window position     | Max
 --------------------|-------
 [1 2 3 4 2 7] 1 3 6 | 7
 1 [2 3 4 2 7 1] 3 6 | 7
 1 2 [3 4 2 7 1 3] 6 | 7
 1 2 3 [4 2 7 1 3 6] | 7
 * 
 * */

package queue;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class SlidingWindowMaximum {

	public static ArrayList<Integer> slidingMaximum(final List<Integer> A, int B) {

		ArrayList<Integer> res = new ArrayList<Integer>();
		Deque<Integer> dequeue = new LinkedList<Integer>();
		int i;
		for (i = 0; i < B; i++) {
			if (dequeue.isEmpty()) {

				dequeue.add(i);
			} else {
				System.out.println(dequeue.peekLast() + ": " + A.get(dequeue.peekLast()));
				if (A.get(dequeue.peekLast()) <= A.get(i)) {
					dequeue.removeLast();
					dequeue.add(i);
				}
			}

		}
		int j =0;
		res.add(A.get(dequeue.getFirst()));
		System.out.println(dequeue);
		for (; i < A.size(); i++) {
			if (dequeue.isEmpty()) {
				dequeue.add(i);
				System.out.print(dequeue + " ");
				System.out.println(i + " ");
				System.out.println(j++);
			}

			
			  else if (i - dequeue.getFirst() == B  && !(dequeue.isEmpty())) {
			 
			  System.out.print(dequeue + "  inside "+(i - dequeue.getFirst())); 
			  System.out.println(i+ " ");
			  dequeue.removeFirst(); 
			  // System.out.println(i - dequeue.getLast()); 
			  System.out.println(j++);
			  
			  }
			 else {

				if (A.get(dequeue.peekLast()) <= A.get(i)) {
					dequeue.removeLast();
					dequeue.add(i);
					System.out.print(dequeue + " ");
					System.out.println(i + " ");
					System.out.println(j++);
				}
			}
			if (!dequeue.isEmpty())
				res.add(A.get(dequeue.getFirst()));
		}
		System.out.println(res);
		return res;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 3, -1, -3, 5, 3, 6, 7 };
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			arr.add(a[i]);
		}
		slidingMaximum(arr, 3);
	}

}
