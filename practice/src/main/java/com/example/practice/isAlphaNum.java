package com.example.practice;

import java.util.ArrayList;

public class isAlphaNum {

	public static int solve(ArrayList<Character> A) {
		int res = 1;
		for(int i =0;i<A.size();i++) {
		//	System.out.println("character "+A.get(i)+" condition :"+((A.get(i) > 90 || A.get(i)<65)  && (A.get(i) > 122 || A.get(i)<97) && (A.get(i)>57 || A.get(i) < 48)));
			if((A.get(i) > 90 || A.get(i)<65)  && (A.get(i) > 122 || A.get(i)<97) && (A.get(i)>57 || A.get(i) < 48)) {
				return 0;
			}
		}
		
		return res;
    }
}
