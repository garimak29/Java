package com.example.practice;

import java.util.ArrayList;

public class MinimizeDifference {
	 public static int solve(ArrayList<Integer> A, int B) {
		 int minI = Integer.MAX_VALUE;
		 int maxI = Integer.MAX_VALUE;
		 
		 for(int i =0;i<A.size();i++) {
			 minI = min(minI , A.get(i));
			 maxI = max(maxI , A.get(i));
		 }
		 int[] freq = new int[maxI+1];
		 for(int i =0;i<= maxI;i++) {
			 freq[i]=0;
		 }
		 
		 for(int i =0;i< A.size();i++) {
			 freq[A.get(i)]++;
		 }
		 
		 while(B!= 0 && minI <=maxI) {
			 if(freq[minI]<freq[maxI]) {
				 if(freq[minI] > B)
					 break;
				 freq[minI +1] += freq[minI];
				 B-=freq[minI];
				 minI++;
			 }
			 else
			 {
				 if (freq[maxI] > B) {
					 break;
				 }
				 freq[maxI-1]+=freq[maxI];
				 B-=freq[maxI];
				 maxI--;
			 }
		 }
		 return maxI-minI;
	    }

	

	private static int max(int maxI, Integer integer) {
		// TODO Auto-generated method stub
		if(maxI > integer)
			return maxI;
		else return integer;
		
	}



	private static int min(int minI, Integer integer) {
		if(minI > integer)
			return minI;
		else return integer;
	}

}
