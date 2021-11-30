/*
 * Problem Description

You are climbing a stair case and it takes A steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?



Problem Constraints
1 <= A <= 36



Input Format
The first and the only argument contains an integer A, the number of steps.



Output Format
Return an integer, representing the number of ways to reach the top.



Example Input
Input 1:

 A = 2
Input 2:

 A = 3


Example Output
Output 1:

 2
Output 2:

 3


Example Explanation
Explanation 1:

 Distinct ways to reach top: [1, 1], [2].
Explanation 2:

 Distinct ways to reach top: [1 1 1], [1 2], [2 1].
 * 
 * */

package dynamicProgramming;

public class Stairs {
	
	public static int[] initializeArray(int num) {
		int[] arr = new int[num+1];
		for(int i =0;i<num+1;i++) {
			arr[i]=0;
		}
		return arr;
	}

	
	 public static int climbStairs(int A) {
		 int res = 0;
		 int[] arr = initializeArray(A);
		 res = mainFunction(A,arr);
		 
		 return res;
	    }
	 
	 
	 public static int mainFunction(int num , int[] arr) {
			//base case
		// 	System.out.println(num);
		 	if(num < 3 )
		 		return num ;
		 	//main condition
		 	arr[num] = mainFunction(num-1 , arr) + mainFunction(num-2 , arr);
		 	return arr[num];
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(climbStairs(2));

	}

}
