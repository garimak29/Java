package com.example.practice;

import java.util.HashMap;

public class LongestConsecutive {
	 public static int longestConsecutive(final int[] A) {
	        
	int res =0;
	
	
		HashMap<Integer, Boolean> map = new HashMap <Integer, Boolean>();
		int i=0;
		for (i=0;i<A.length;i++) {
			map.put(A[i], true);
		}
		
		for(i=0;i<A.length;i++) {
			if (map.containsKey(A[i]-1)) {
				
			}
			else {
				int count=0;
				int start = A[i];
				while(map.containsKey(start+1)) {
					count++;
					start++;
				}
				if (res<count)
					{
						res = count;
					
					}
			}
		}
		
		//if (res!=0 || A.length == 1)
			res++;
	return res;
	 
	 }

}
