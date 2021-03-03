package com.example.practice;

public class CountOccurance {
	 public static int solve(String A) {
		 int res =0;
		 
		 for(int i=0;i<A.length()-2;i++) {
		//	 System.out.println(A.charAt(i));
			 if(A.charAt(i)=='b' && A.charAt(i+1)=='o' && A.charAt(i+2)=='b')
			 { 	
				 res++;
			 }
		 }
		 
		 return res;
	    }

}
