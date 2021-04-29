package com.example.practice;

import java.util.ArrayList;

public class SubArrayWithGivenSum {
	public static ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int i = 0, j = 0;
		int sum = 0;
		while (i <= j && j < A.size() - 1 && i < A.size() - 1) {

			if (sum == B) {
				break;
			} else {
				if (i == j) {
					sum += A.get(i);
					if (j < A.size() - 1)
						j++;

				} else if (sum < B) {
					sum += A.get(j);
					if (j < A.size() - 1)
						j++;

				} else {
					sum -= A.get(i);
					if (i < A.size() - 1)
						i++;

				}
				System.out.println("j" + j + " i:" + i);
				System.out.println(sum);

			}
		}
		
		
		if (sum == B) {
			for (int p = i; p < j; p++) {
				arr.add(A.get(p));
			}
		}else if(A.get(j)*1 == B) {
			 arr.add(A.get(j));
		}
		else if (A.get(i + 1) != sum && j == A.size() - 1) {
			arr.add(-1);
		}

		return arr;
	}

}
