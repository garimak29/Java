package com.example.practice;

import java.util.ArrayList;

public class ToUpper {
 public static ArrayList<Character> to_upper(ArrayList<Character> A) {
		 
		 for(int i =0;i<A.size();i++) {
			 if(A.get(i) > 96 && A.get(i)<123) {
				 A.set(i, (char) (A.get(i)-32));
			 }
		 }
		 return A;
	    }
}
