/*
 * Earlier i thought of updating the same string and working through it , but there were many errors so i created
 * a string builder and added the characters as per question
 * */package com.example.practice;

import java.util.ArrayList;

public class StringOperations {
	public static String solve(String A) {
		StringBuilder str = new StringBuilder("");
		A = A.concat(A);
		for(int i =0;i<A.length();i++) {
			if(A.charAt(i) > 64 && A.charAt(i)<91) {
				
			}
			else if (A.charAt(i) == 'a' || A.charAt(i) == 'A' || A.charAt(i) == 'e' || A.charAt(i) == 'E' || A.charAt(i) == 'i' || A.charAt(i) == 'I' || A.charAt(i) == 'o' || A.charAt(i) == 'O' || A.charAt(i) == 'u' || A.charAt(i) == 'U') {
				
				str.append("#");
			//	System.out.println(str);
			}
			else {
				
				str.append(A.charAt(i));
			//	System.out.println(str);
			}
				
		}
		
		return str.toString();
    }

}
