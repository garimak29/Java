package com.example.practice;

import java.util.ArrayList;

public class AP {

	public static int solve(ArrayList<Integer> A) {
		int res =1;
		
		A.sort(null);
		int diff = A.get(0)-A.get(1);
		for (int i=1;i<A.size()-1;i++) {
			if(A.get(i)-A.get(i+1) != diff)
				return 0;
		}
		
		return res;
		
    }
}
