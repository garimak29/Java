/**
 * 
 * Thought behind it : basically find GCD of all the elements in the array , if they are =1 then no need to delete any element 
 * if not equal to 1 like its 2 ,3 then that means that all the elemenst have a common factor of 2 ,3 
 * so we would have to delete the whole array :O , hence return -1
 * 
 * */package com.example.practice;

import java.util.ArrayList;

public class DeleteElements {
	 public static int solve(ArrayList<Integer> A) {
		 int res =A.get(0);
		 	for(int i =1;i<A.size()-1;i++) {
		 		res = calcGCD(res,A.get(i));
		 		System.out.println("res :"+res);
		 	}
		 	System.out.println(res);
		 	if (res == 1)
		 		return 0;
		 	else 
		 		return -1;
		 
	    }
	 
	 static int  calcGCD(int a , int b) {
		
		if (a>b)
		{
			int temp = a;
			a = b;
			b  = temp;
		}
		while(a>0) {
			b=b%a;
			System.out.println("B :"+b);
			int temp = a;
			a = b;
			b  = temp;
			System.out.println(a+" : "+b);
		}
		 return b;
	 }
}
