package com.example.practice;

public class VowelIt {
	public static String solve(String A) {
		StringBuilder res= new StringBuilder("");
		
		for (int i=0;i<A.length();i++) {
			if (A.charAt(i)== 'a' || A.charAt(i)== 'e'|| A.charAt(i)=='i'|| A.charAt(i)=='o'|| A.charAt(i)=='u') {
				res.append(A.charAt(i));
			}
		}
		return res.toString();
    }

}
