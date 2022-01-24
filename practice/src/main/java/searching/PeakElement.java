/*
 * 
 * Find a peak element
Problem Description

Given an array of integers A, find and return the peak element in it. An array element is peak if it is NOT smaller than its neighbors.

For corner elements, we need to consider only one neighbor. We ensure that answer will be unique.

NOTE: Users are expected to solve this in O(log(N)) time.



Problem Constraints
1 <= |A| <= 100000

1 <= A[i] <= 109



Input Format
The only argument given is the integer array A.



Output Format
Return the peak element.



Example Input
Input 1:

A = [1, 2, 3, 4, 5]
Input 2:

A = [5, 17, 100, 11]


Example Output
Output 1:

 5
Output 2:

 100


Example Explanation
Explanation 1:

 5 is the peak.
Explanation 2:

 100 is the peak.
 * 
 * */

package searching;

import java.util.ArrayList;

public class PeakElement {
	
	
	public static int solve(ArrayList<Integer> A) {
		if(A.size() == 1)
			return A.get(0);
		
	
		int start = 0;
		int end = A.size()-1;
		int mid;
		int flag =-1;
		while(start < end && A.size() > 2) {
			mid = start + ( end- start)/2;
			System.out.println("mid "+A.get(mid));
			System.out.println("mid - 2 and + 2 = "+(mid-2)+" : "+(mid+2));
			if(( (mid+1)!= A.size() && (mid-1)!= -1 && A.get(mid) >= A.get(mid+1) ) && (A.get(mid) >= A.get(mid-1) ))
				return A.get(mid);
			else if(A.get(mid) < A.get(mid+1) ) // right
			{	
				if((mid+2)!= (A.size()) && A.get(mid+1) > A.get(mid+2) )
					return A.get(mid+1);
				start = mid+1;
				flag = 0;
				
			}
			else if(A.get(mid) < A.get(mid-1) ) // left{
			{	
				if((mid-2)!= (-1) && A.get(mid-1) > A.get(mid-2) )
					return A.get(mid-1);
				end = mid-1;
				flag=0;
			}
		}
		
		if(flag == 0 || A.size()==2) {
			if(A.get(0) > A.get(A.size()-1))
				return A.get(0);
			else
				return A.get(A.size()-1);
		}
		
		
		return 0;
	}
	
	
	public static int solve1(ArrayList<Integer> A) {
		int res =-1,max = Integer.MIN_VALUE;
		for(int i =0;i<A.size()-1;i++) {
			if(A.get(i)>A.get(i+1)) {
				return A.get(i);
			}
			if(A.get(i)>max) {
				max = A.get(i);
			}
		}
		
		if(A.get(A.size()-1) > max)
			max = A.get(A.size()-1);
		
		return max;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] A = {1, 1000000000, 1000000000 };
		//int[] A = {1,2,3,4,5};
		int[] A = {5,17,100, 4};
		ArrayList<Integer> a = new ArrayList<Integer>();
		for(int i =0;i<A.length;i++) {
			a.add(A[i]);
		}
		
		System.out.println(solve1(a));

	}

}
/*

 * 
 * public class Solution {
  public int solve(int[] A) {
    // Try to think when will the unique answer exists, 
    //Unique answer only exists when the elements first increases and then decreases.
    // Check is first or last element is the answer.
    int n = A.length;
    //base cases
    if (n == 1)
      return A[0];
    if (A[1] <= A[0])
      return A[0];
    if (A[n - 1] >= A[n - 2])
      return A[n - 1];
    int low = 1, high = n - 2;
    while (low <= high) {
      int mid = (high - low) / 2 + low;
      if (A[mid] >= A[mid - 1] && A[mid] >= A[mid + 1])
        return A[mid];
      else if (A[mid] >= A[mid - 1])
        low = mid + 1;
      else
        high = mid - 1;
    }
    return -1;
  }
}
 * 
 * */
 