package mentor;

import java.util.ArrayList;
import java.util.HashSet;

/*3 Sum
Problem Description

Given an array A of N integers, find three integers in A such that the sum is closest to a given number B. Return the sum of those three integers.

Assume that there will only be one solution.



Problem Constraints
-108 <= B <= 108
1 <= N <= 104
-108 <= A[i] <= 108


Input Format
First argument is an integer array A of size N.

Second argument is an integer B denoting the sum you need to get close to.



Output Format
Return a single integer denoting the sum of three integers which is closest to B.



Example Input
Input 1:

A = [-1, 2, 1, -4]
B = 1
Input 2:

 
A = [1, 2, 3]
B = 6


Example Output
Output 1:

2
Output 2:

6


Example Explanation
Explanation 1:

 The sum that is closest to the target is 2. (-1 + 2 + 1 = 2)
Explanation 2:

 Take all elements to get exactly 6.
 * */
public class ThreeSum {

	public static boolean threeSum(ArrayList<Integer> arr , int target) {
		 for (int i = 0; i < arr.size() - 2; i++) {
			 
	            // Find pair in subarray A[i+1..n-1]
	            // with sum equal to sum - A[i]
	            HashSet<Integer> hashSet = new HashSet<Integer>();
	            int currentSum = target - arr.get(i);
	            for (int j = i + 1; j < arr.size(); j++)
	            {
	                if (hashSet.contains(currentSum - arr.get(j)))
	                {
	                    System.out.printf("Triplet is %d,%d, %d", 
	                    				arr.get(i),arr.get(j),
	                                       currentSum - arr.get(j));
	                    return true;
	                }
	                hashSet.add(arr.get(j));
	            }
		 }
		return false;
		
	}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

	}

}
