package com.example.practice;

public class SumOfDigitsRecurssion {
	 public static int solve(int A) {
		 if(A ==0)
			 return 0;
		 else
			 return solve(A/10)+A%10;
	    }

}
