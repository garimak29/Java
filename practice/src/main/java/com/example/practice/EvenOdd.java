package com.example.practice;

import java.util.ArrayList;

public class EvenOdd {
	public static int solve(ArrayList<Integer> A) {
		int res = 0;
		System.out.println(A);
		for(int i =0;i<A.size()-2;i++) {
			if(A.get(i)%2 != 0 && A.get(i+1)%2==0 && A.get(i+1)%2!=0 ) {
				A.remove(i+1);
				res++;
			}else if (A.get(i)%2 != 0 && A.get(i+1)%2==0 && A.get(i+1)%2!=0 ) {
				;
			}
		}
		return res;
	}

}
