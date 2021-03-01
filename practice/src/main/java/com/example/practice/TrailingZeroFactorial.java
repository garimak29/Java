package com.example.practice;

public class TrailingZeroFactorial {
	 public static int trailingZeroes(int A) {
		 int res = 0;
		 
		 while(A>0) {
			 System.out.println(A);
			 res+=(A/5);
			 A = A/5;
		 }
		 return res;
		 
	    }

}
