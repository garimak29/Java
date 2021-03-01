package com.example.practice;

import java.util.ArrayList;

public class ToLower {
	 public static ArrayList<Character> to_lower(ArrayList<Character> A) {
		 
		 for(int i =0;i<A.size();i++) {
			 if(A.get(i) > 64 && A.get(i)<91) {
				 A.set(i, (char) (A.get(i)+32));
			 }
		 }
		 return A;
	    }

}
