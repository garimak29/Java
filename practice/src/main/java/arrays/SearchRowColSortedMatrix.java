/*
 * Search in a row wise and column wise sorted matrix
Problem Description

Given a matrix of integers A of size N x M and an integer B.
In the given matrix every row and column is sorted in increasing order. Find and return the position of B in the matrix in the given form:
If A[i][j] = B then return (i * 1009 + j)
If B is not present return -1.

Note 1: Rows are numbered from top to bottom and columns are numbered from left to right.
Note 2: If there are multiple B in A then return the smallest value of i*1009 +j such that A[i][j]=B.


Problem Constraints
1 <= N, M <= 1000
-100000 <= A[i] <= 100000
-100000 <= B <= 100000


Input Format
The first argument given is the integer matrix A.
The second argument given is the integer B.


Output Format
Return the position of B and if it is not present in A return -1 instead.


Example Input
A = [ [1, 2, 3]
          [4, 5, 6]
          [7, 8, 9] ]
B = 2


Example Output
1011


Example Explanation
A[1][2]= 2
1*1009 + 2 =1011

 * 
 * */
package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class SearchRowColSortedMatrix {
	public int solve(ArrayList<ArrayList<Integer>> A, int B) {
		int r = A.size();
		int c = A.get(0).size();
		int totalSize = r*c;
		int pos = -1;
		for(int i =0;i<r;i++) {
			for(int j =0;j<c;j++) {
				if(A.get(i).get(j) == B) {
					pos = j;
					break;
				}
			}
		}
		
		return pos;
	}
	
	public static int solve1(ArrayList<ArrayList<Integer>> A, int B) {
		for(int i =0;i<A.size();i++) {
			for(int j=0;j<A.get(i).size();j++) {
				if(A.get(i).get(j) == B) {
					System.out.println(i+" - "+j);
					i++;
					j++;
					return i*1009+j;
				}
			}
		}
		return -1;
		
	}
	
	public static void main(String args[]) {
		/*
		 * ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();
		 * A.add(new ArrayList<Integer>()); A.get(0).add(1,2); A.add(new
		 * ArrayList<Integer>()); A.get(1).add(3,4); System.out.println(solve1(A,2));
		 */
		
		 ArrayList<ArrayList<Integer> > x
         = new ArrayList<ArrayList<Integer> >();

   
     x.add(
         new ArrayList<Integer>(Arrays.asList(1,2,3)));

     
     x.add( new ArrayList<>(Arrays.asList(4,5,6)));
     x.add( new ArrayList<>(Arrays.asList(7,8,9)));
     // Adding values to R3
    System.out.println(x);
  System.out.println(solve1(x,3));
	}

}
