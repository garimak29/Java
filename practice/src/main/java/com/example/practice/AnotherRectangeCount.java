package com.example.practice;

import java.util.ArrayList;

public class AnotherRectangeCount {

	public static int solve(ArrayList<Integer> A, int B) {
		int count = 0;
		int i = 0, j = A.size() - 1;
		while (i <= j) {
			long prod = A.get(i) * A.get(j);
			System.out.println("i :" + i + " j:" + j +"  prod +"+prod) ;
			
			if (prod > B) {
				j--;
			} else {
				count += (j - i + 1);
				i++;
				if(i == j)
					count++;

			}
			System.out.println(count);
		}

		return count ;
	}
	
}
