package com.example.practice;

import java.util.ArrayList;
import java.util.HashMap;

public class SumOfSubArray {
	public static ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		ArrayList<Integer> res = new ArrayList<Integer>();
		int i = 0, j = A.size() - 1;
		// prefix sum array
		int sum = 0;
		for (i = 0; i < A.size(); i++) {
		
			sum += A.get(i);
			arr.add(sum);
		System.out.println(sum);

		}
		i = 0; j=1;
		while (i <= j && i<A.size() && j<A.size()) {
			int diff = arr.get(j) - arr.get(i);
			System.out.println(diff +" j "+j+" i "+i);
			if (diff < B)
				j++;
			else if (diff > B)
				i++;
			else {
				// index starts from 0
				for(int k=i+1;k<=j;k++)
				res.add(A.get(k));

				return res;
			}

		}
		if (res.size() == 0)
			{
			for (i = 0; i < A.size(); i++) {
				if (A.get(i) == B) {
					res.add(A.get(i));
					return res;
				}
			}
			res.add(-1);
			}
		return res;

	}
}
