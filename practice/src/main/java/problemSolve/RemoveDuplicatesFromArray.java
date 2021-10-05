/*Remove Duplicates from Sorted Array
Problem Description

Given a sorted array A consisting of duplicate elements.

Your task is to remove all the duplicates and return a sorted array of distinct elements consisting of all distinct elements present in A.

NOTE: The input format has been changed from previous versions.



Problem Constraints
1 <= |A| <= 106

1 <= A[i] <= 2*109



Input Format
First and only argurment containing the integer array A.



Output Format
Return an array/vector from the function as per the question.



Example Input
Input 1:

A = [1, 1, 2]
Input 2:

A = [1, 2, 2, 3, 3]


Example Output
Output 1:

[1, 2]
Output 2:

[1, 2, 3]


Example Explanation
Explanation 1:

Updated Array: [1, 2] after removing the 2nd element.
Explanation 2:

Updated Array: [1, 2, 3] after removing the 3rd and 5th element.*/

package problemSolve;

import java.util.ArrayList;
import java.util.HashMap;

public class RemoveDuplicatesFromArray {
	
	 
	  public static ArrayList<Integer> solve1(ArrayList<Integer> A) {
		  int  i =0 , j =1;
		  ArrayList<Integer> res = new ArrayList<Integer>();
		 while(j<A.size()) {
			  
			  
				 
				if((A.get(i).longValue()) != (A.get(j).longValue()) ) {
					System.out.println("A "+A.get(i)+" -- >"+A.get(j));  
					res.add(A.get(i));
					  i=j;
					  j++;
				  }
				else {
					j++;
				}
				  
			  }
		 if((res.size() == 0 ) || res.size() > 0 && A.get(A.size()-1) != res.get(res.size()-1)) {
			 res.add(A.get(A.size()-1));
		 }
		
	       
		  return res;
	    }
	  

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	int[] a = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,00,1 ,2 ,3 ,3, 3 ,4};
	//	int[] a = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3};
	//	int[] a = {4000,4000,4000};
		int[] a = {0,0,0,0,1,1,1,2};
		System.out.println(solve1(utilPackage.UtilClass.ArrayToArrayList(a)).toString());

	}

}
/*
 *  public ArrayList<Integer> solve(ArrayList<Integer> A) {
        int index = 1;
	    int n = A.size();
	    
	    for (int i = 1; i < n; i++) {
	        
	        if (A.get(i).intValue() != A.get(i - 1).intValue()) {
	            int temp = A.get(index);
	            A.set(index, A.get(i));
	            index++;
	        }
	    }
	    ArrayList<Integer> arr = new ArrayList<Integer>();
	    for (int i = 0; i < index; i++) {
	        arr.add(A.get(i));
	        
	    }
	    return arr;
    }
 
*/