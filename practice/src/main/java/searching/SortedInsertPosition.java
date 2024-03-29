/*Sorted Insert Position
Problem Description

Given a sorted array A of size N and a target value B, return the index (0-based indexing) if the target is found.
If not, return the index where it would be if it were inserted in order.

NOTE: You may assume no duplicates in the array. Users are expected to solve this in O(log(N)) time.



Problem Constraints
1 <= N <= 106



Input Format
First argument is an integer array A of size N.
Second argument is an integer B.



Output Format
Return an integer denoting the index of target value.



Example Input
Input 1:

A = [1, 3, 5, 6]
 B = 5
Input 2:

A = [1]
 B = 1


Example Output
Output 1:

2
Output 2:

0


Example Explanation
Explanation 1:

The target value is present at index 2.
Explanation 2:

The target value is present at index 0.
 * */
package searching;

public class SortedInsertPosition {
	public static int searchInsert(int[] A, int B) {
		return binarySearchPosition(A, B, A.length - 1, 0);
	}

	public static int binarySearchPosition(int[] arr, int key, int high, int low) {
		int ans = -1; // no index found to be inserted
		int mid = low + ((low + high) / 2); // to avoid overflow

		System.out.println("inside bs");
		while (low <= high && low != arr.length) {
			 mid = low + ( high- low) / 2;
				/*
				 * System.out.println("low: "+low+" high:"+high); System.out.println("mid"+mid);
				 */// here since we need to insert the key , we will not find key == arr[mid]
			if (arr[mid] >= key) // valid part{
			{
				ans = mid;
				high = mid - 1;
			} else // invalid part
			{
				low = mid + 1;

			}
			
		}
		// edge cases

		if (ans == -1) { // case if key is greater than the last element of the array
			ans = arr.length;
		}
	
		return ans;
	}

	public static void main(String[] args) {
		int[] a = {1, 3, 5, 6};
			int 	 B = 0;
			System.out.println("inside");
			System.out.println(searchInsert(a, B));

	}

}
