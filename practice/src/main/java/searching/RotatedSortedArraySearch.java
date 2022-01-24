/*
 * Rotated Sorted Array Search
Problem Description

Given a sorted array of integers A of size N and an integer B.

array A is rotated at some pivot unknown to you beforehand.

(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2 ).

You are given a target value B to search. If found in the array, return its index, otherwise return -1.

You may assume no duplicate exists in the array.

NOTE: Users are expected to solve this in O(log(N)) time.



Problem Constraints
1 <= N <= 1000000

1 <= A[i] <= 10^9

all elements in A are disitinct.



Input Format
The first argument given is the integer array A.

The second argument given is the integer B.



Output Format
Return index of B in array A, otherwise return -1



Example Input
Input 1:

A = [4, 5, 6, 7, 0, 1, 2, 3]
B = 4
Input 2:

A = [1]
B = 1


Example Output
Output 1:

 0
Output 2:

 0


Example Explanation
Explanation 1:

 
Target 4 is found at index 0 in A.
Explanation 2:

 
Target 1 is found at index 0 in A.
 * */

package searching;

import java.util.ArrayList;

public class RotatedSortedArraySearch {
	public static int search(final int[] A, int B) {
		int low = 0, high = A.length - 1, mid;
		while (low <= high) {
			mid = low + (high - low) / 2;
			if (A[mid] == B)
				return mid;
			else if (A[high] == B)
				return high;
			else if (A[low] == B)
				return low;
			else if ((A[mid] < B && A[high] < B && A[low] < B) || (A[mid] > B && A[low] > B)) {
				// left
				high = mid - 1;
			} else if (A[mid] < B && A[high] > B) {
				// right
				low = mid + 1;
			}

		}

		return -1;
	}

	public static int search1(final int[] A, int B) {
		int pivot = 1;
		ArrayList<Integer> A1 = new ArrayList<Integer>();
		ArrayList<Integer> A2 = new ArrayList<Integer>();
		for (int i = 0; i < A.length - 1; i++) {
			if (A[i] > A[i + 1]) {
				break;
			} else
				pivot++;
		}

		System.out.println(pivot);

		int temp = pivot;

		for (int i = 0; i < A.length; i++) {
			if (temp > 0) {
				A1.add(A[i]);
				temp--;
			} else
				A2.add(A[i]);
		}

		System.out.println(A1); // larger
		System.out.println(A2); // smaller
		int resA = binarySearch(A1, B);
		int resB = binarySearch(A2, B);
		if (resA != -1) {
			System.out.println("A1");
			return resA;
		} else if (resB != -1) {
			// System.out.println("A2"+binarySearch(A2 , B));
			return (resB + pivot);
		}
		return -1;
	}

	public static int binarySearch(ArrayList<Integer> A, int B) {
		int low = 0, high = A.size() - 1;
		// int mid = low +(high-low)/2;
		while(low<=high) {
			
			int mid = low + (high - low) / 2;
		//	System.out.println(mid);
			if (A.get(mid) == B) {
				return mid;
			} else if (A.get(mid) < B) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 4, 5, 6, 7, 0, 1, 2, 3 };
		int b = 0;
		System.out.println(search1(a, b));

	}

}
/*
 * 
 * public class Solution {
	// DO NOT MODIFY THE LIST
	public int search(final List<Integer> A, int B) {
	    int mid;
	    int start, end;
	    int count;
	    int num;
	    int n = A.size();
	    count = n;
	    // find the index of minimum element
	    int pivot = getMinElementIndex(A);
	    // Now we can binary search in two parts 0 - pivot and pivot to n-2
	    start = pivot;
	    end = n - 1;
	    int res = binarySearch(A, start, end, B);
	    if (res == -1) {
	        start = 0;
	        end = pivot - 1;
	        res = binarySearch(A, start, end, B);
	    }
	    return res;
	}
	
	public int binarySearch(final List<Integer> A, int start, int end, int B) {
	    int count = end - start + 1;
	    int num, mid;
	    while (count > 0) {
	        mid = start + (end - start) / 2;
	        num = A.get(mid);
	        if (B == num)
	            return mid;
	        if (B < num)
	            end = mid - 1;
	        else
	            start = mid + 1;
	        count /= 2;
	    }
        return -1;
	}
	public int getMinElementIndex(final List<Integer> A) {
	    int first, last, start, end;
	    int count, num, n;
	    int mid;
	    int next, prev;
	    n = A.size();
	    count = n;
	    first = A.get(0);
	    last = A.get(n - 1);
	    start = 0;
	    end = n - 1;
	    while (count > 0) {
	        mid = start + (end - start) / 2;
	        num = A.get(mid);
	        next = A.get((mid + 1) % n);
	        prev = A.get((mid - 1 + n) % n);
	        if (num < prev && num < next) {
	            return mid;
	        }
	        if (num > first && num > last)
	            start = mid + 1;
	        else 
	            end = mid - 1;
	        count /= 2;
        }
	    return -1;
	}
}
 * */
 