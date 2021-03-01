package com.example.practice;

public class PalindromeInteger {
	public static int isPalindrome(int A) {
		int res = 1;
		
		String str = ""+A;
		for(int i =0;i<str.length()/2;i++) {
			if (str.charAt(i) == str.charAt(str.length()-i-1)) {
				
			}
			else
				return 0;
		}
		return res;
    }

}
