package com.example.practice;

public class Fibonacii {

	 public static int findAthFibonacci(int A) {
		 if( A == 0 ) // failsafe condition
			 return 0;
		 else if (A == 1) // failsafe condition
			 return 1;
		 else
			 return findAthFibonacci(A-1) + findAthFibonacci(A-2); // actual logic 
	    }
}
