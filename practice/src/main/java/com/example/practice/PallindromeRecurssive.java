package com.example.practice;

public class PallindromeRecurssive {
	public static int solve(String A) {

		return checkPalindrome(A, 0, A.length() - 1);

	}

	public static int checkPalindrome(String A, int i, int j) {

	//	System.out.println("checking" + A + " i :" + i + " j: " + j);
		if (i >= j) {
		//	System.out.println("inside this loop");
			return 1;
		}

		if (A.charAt(i) ==  A.charAt(j)) {
			checkPalindrome(A, i + 1, j - 1);
		}

		return 0;
	}
}
