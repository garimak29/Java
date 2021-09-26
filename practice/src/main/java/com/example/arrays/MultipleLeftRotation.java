/*
 * Multiple left rotations of the array
Problem Description

Given an array of integers A and multiple values in B which represents number of times array A needs to be left rotated.

Find the rotated array for each value and return the result in the from of a matrix where i'th row represents the rotated array for the i'th value in B.



Problem Constraints
1 <= length of both arrays <= 2000 -10^9 <= A[i] <= 10^9 0 <= B[i] <= 2000


Input Format
The first argument given is the integer array A.
The second argument given is the integer array B.


Output Format
Return the resultant matrix.


Example Input
Input 1:
 
    A = [1, 2, 3, 4, 5]
    B = [2, 3]

Input 2:

  
    A = [5, 17, 100, 11]
    B = [1]




Example Output
Output 1:
 
    [ [3, 4, 5, 1, 2]
     [4, 5, 1, 2, 3] ]


Output 2:

    
    [ [17, 100, 11, 5] ]



Example Explanation
for input 1 -> B[0] = 2 which requires 2 times left rotations

1: [2, 3, 4, 5, 1]

2: [3, 4, 5, 1, 2]

B[1] = 3 which requires 3 times left rotation

1: [2, 3, 4, 5, 1]

2: [3, 4, 5, 1, 2]

2: [4, 5, 1, 2, 4]



 * */
package com.example.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MultipleLeftRotation {

	public static ArrayList<Integer> rotateArray(ArrayList<Integer> A, Integer rot) {
		// System.out.println(A);
		rot = rot % A.size();
		int temp = rot;
		int j = 0;
		ArrayList<Integer> newList = new ArrayList<Integer>();
		for (int i = 0; i < A.size(); i++) {
			if (temp < A.size()) {
				newList.add(A.get(temp));
				temp++;
			} else {
				if (j < rot) {
					newList.add(A.get(j));
					j++;
				}
			}
		}
		 System.out.println(newList);
		return newList;
	}

	public static ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < B.size(); i++) {
			res.add(rotateArray(A, B.get(i)));
		}
		return res;
	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		String AString = sc.nextLine();

		ArrayList A = new ArrayList<Integer>();
		String[] str = AString.split(",");
		for (int i = 0; i < str.length; i++) {
			A.add(Integer.parseInt(str[i]));
		}

		AString = sc.nextLine();
		str = null;
		str = AString.split(",");
		ArrayList B = new ArrayList<Integer>();
		for (int j = 0; j < str.length; j++) {
			B.add(Integer.parseInt(str[j]));
		}
		solve(A, B);
		// A = [1, 2, 3, 4, 5]
		// B = [2, 3]

	}

}
