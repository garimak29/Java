package com.example.practice;

import java.util.ArrayList;

public class DivisorGame {
	public static int solve(int A, int B, int C) {
		int count = 0;
		long temp = B * C;
		
		for (long i = temp; i <= A;) {
			
				if (i % temp == 0 ) {
					count++;
					i += temp;
				} else
					i++;
			
			System.out.println(i);
		}

		return count;
	}
	public static int solve1(int A, int B, int C) {
		int count=0;
		int temp = B>C?C:B;
		//System.out.println("temp"+temp);
		for(int i =temp;i<=(A);) {
			if(i%B == 0 && i%C == 0) {
			//	arr.set(i, arr.get(i)+2);
		//		System.out.println(i);
				count++;
				i+=temp;
				
			//	System.out.println(arr.get(i)+" : "+i);
			}
			else 
				i++;
		
		}
		if( B == 1 || C ==1)
			return count;
		return count;
	}
	
	public static int sieve(int A, int B, int C) {
		int count =0; int i =0;
		ArrayList<ArrayList<Integer>> arr = new ArrayList();
		for(i =1 ; i<A;i++) {
			;
		}
		return count ;
	}
}
