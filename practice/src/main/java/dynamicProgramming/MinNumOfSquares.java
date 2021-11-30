/*Given an integer A. Return minimum count of numbers, 
 * sum of whose squares is equal to A.



Problem Constraints
1 <= A <= 105



Input Format
First and only argument is an inetegr A.



Output Format
Return an integer denoting the minimum count.



Example Input
Input 1:

 A = 6
Input 2:

 A = 5


Example Output
Output 1:

 3
Output 2:

 2


Example Explanation
Explanation 1:

 Possible combinations are : (12 + 12 + 12 + 12 + 12 + 12) and (12 + 12 + 22).
 Minimum count of numbers, sum of whose squares is 6 is 3. 
Explanation 2:

 We can represent 5 using only 2 numbers i.e. 12 + 22 = 5
 * 
 * 
 * */

package dynamicProgramming;

public class MinNumOfSquares {
	
	public static int[] initializeArray(int num) {
		int[] arr = new int[num+1];
		for(int i=0;i< num+1;i++) {
			arr[i] =0;
		}
		return arr;
	}
	
	 public static int countMinSquares(int A) {
		 	int res = 0;
		 	int[] arr = initializeArray(A);
		 	res = mainfunction(A, arr);
		 	return res;
	    }
	 
	 public static int mainfunction(int num , int[] arr) {
		 //base condition 
		// System.out.println(arr.length);
		 if(num == 0)
			 return num;
		 if(arr[num] > 0) {
			 return arr[num];
		 }
		 // recurssive condition
		 arr[num] = num;
		 for(int i =0;i*i<=num;i++)
		 { // System.out.println("arr"+arr[num]);

			 arr[num] = Math.min(arr[num] , mainfunction((int)(num-Math.pow(i, 2)), arr)+1);
		 
		 }return arr[num];
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countMinSquares(5));
	}

}
/*
 * 
 * public class Solution {
  public int countMinSquares(int n) {
    int[] dp = new int[n + 1];

    // simple base case assignment
    dp[0] = 0;
    dp[1] = 1;

    //finding optimal answer for every 2<=i<=N in bottom-up manner
    for (int i = 2; i <= n; i++) {

      //for i answer will be always less than equal to i.
      //maximum possible number of squares : i = (1^1+1^1+1^1+.....+1^1, i times)
      dp[i] = i;

      //Now identify from which number we have to make a direct jump to N so that the required answer is minimised.
      //do this by considering every possible direct jump
      //number of iterations will be <= sqrt(i)
      for (int x = 1; x * x <= i; x++) {
        dp[i] = Math.min(dp[i], 1 + dp[i - x * x]);
      }
    }

    //here we get our optimal answer
    return dp[n];
  }
}
 * 
 * 
 * 
 * */
 