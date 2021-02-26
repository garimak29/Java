package com.example.practice;

import java.util.ArrayList;

public class ElementsRemoval {
	 public static int solve(ArrayList<Integer> A) {
		 int res =0;
		 A.sort(null);
		 ArrayList<Integer> prefixSum = new ArrayList<Integer>();
		 int sum =0;
		 for(int i =0;i< A.size();i++) {
			 sum+=A.get(i);
			 prefixSum.add(sum);
		 }
		 for( int i = A.size()-1 ; i>=0;i--) {
			 res+=prefixSum.get(i);
		 }
		 return res;
		 
	    }
}
