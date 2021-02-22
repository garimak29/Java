package com.example.practice;

import java.util.ArrayList;

public class NobleInteger {

	public static int solve(ArrayList<Integer> A) {
		int res =-1;
		A.sort(null);
	//	System.out.println(A.size());
		for (int i =0;i<A.size();i++) {
			System.out.println(A.get(i));
			if(i<A.size()-1) {
				if(A.get(i)!=A.get(i+1) && A.size()-1 - i == A.get(i) )
			
					return 1;
			}
			else 
			{
				if(A.size()-1 - i == A.get(i) )
					
					return 1;
			}
		}
		return res;
    }
}
