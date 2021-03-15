/*
 * Keep in mind about the overflows 
 * */

package com.example.practice;


public class ReverseInteger {
	 public static int reverse(int A) {
		 int a =0;
	//	 System.out.println(Integer.MAX_VALUE);
		 if(A > Integer.MAX_VALUE && A < Integer.MIN_VALUE) {
			 System.out.println(A);
			 return a;
			 }
		 boolean negFlag = false;
		 if(A < 0) {
			 negFlag = true;
			 A= (-1)*A;
		 }
		long al = 0;
		 while(A>0) {
			 al=al*10+A%10;
			 A=A/10;
			
		 }
	//	 System.out.println(al);
		 a = (int) al;
		 if(al != a)
			 return 0;
		
		 if(negFlag) {
			 al=(-1)*al;
			 return (int) al;
		 }
		 return a;
	    }

}
