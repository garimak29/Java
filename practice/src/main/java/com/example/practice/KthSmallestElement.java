package com.example.practice;

import java.util.List;

public class KthSmallestElement {
	 public static int kthsmallest(final List<Integer> A, int B) {
		 
		 int res =0 ;
		 A.sort(null);
		 		 
		 return A.get(B-1);
	    }
}
