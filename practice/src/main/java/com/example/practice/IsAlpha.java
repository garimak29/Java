package com.example.practice;

import java.util.ArrayList;

public class IsAlpha {
	public static int solve(ArrayList<Character> A) {
		int res = 1;
		for(int i =0;i<A.size();i++) {
			if((A.get(i) > 90 || A.get(i)<65)  && (A.get(i) > 122 || A.get(i)<97)) {
				return 0;
			}
		}
		
		return res;
    }

}
