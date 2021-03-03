package com.example.practice;

public class AmazingString {
	 public static int solve(String A) {
		 int res =0;
		 for(int i =0;i<A.length();i++){
				 if(A.charAt(i) == 'a' || A.charAt(i) == 'A' || A.charAt(i) == 'e' || A.charAt(i) == 'E' || A.charAt(i) == 'i' || A.charAt(i) == 'I' || A.charAt(i) == 'o' || A.charAt(i) == 'O' || A.charAt(i) == 'u' || A.charAt(i) == 'U') {
				res+=A.length()-i;
		 }
		 }
		 return res%10003;
	    }

}
