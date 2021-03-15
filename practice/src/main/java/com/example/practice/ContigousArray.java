package com.example.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ContigousArray {
	public static int solve(ArrayList<Integer> A) {
		int res = 0;
		int sum = 0;
		int startPoint = 0, endPoint = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		// key - index , value = sum
		for (int i = 0; i < A.size(); i++) {
			if (A.get(i) == 0) // replace 0 with -1;
				A.set(i, -1);
			sum += A.get(i);
			System.out.println(sum);
			map.put(i, sum);

		}

		System.out.println("snma");
		for (Map.Entry<Integer, Integer> e : map.entrySet()) {
			startPoint = e.getKey();
			if(map.containsValue(e.getValue())) {
				for (Map.Entry<Integer, Integer> e1 : map.entrySet()) {
					int key = e1.getKey();
					int value = e1.getValue();
					
					if(map.containsValue(e1.getValue())) {
						endPoint = key;
						System.out.println("found" + key);
					}
					else
					{
						System.out.println("not found");
					}
					
					
				}	
					int diff = endPoint - startPoint;
					if (diff < 0) {
						diff = (-1) * diff;
					}
					System.out.println(startPoint + " : " + endPoint + " = " + diff);

					if (res < diff) {

						res = diff ;
						System.out.println(res +"res");
					}
				}
			
		}
		/*
		 * map.forEach((key, value) -> {
		 * 
		 * System.out.println(key + " : " + value); });
		 */

		return res;

	}

	public static int solve1(ArrayList<Integer> A) {
		int res = 0;
		int sum = 0;
		int startPoint = 0, endPoint = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		// key - index , value = sum
		for (int i = 0; i < A.size(); i++) {
			if (A.get(i) == 0) // replace 0 with -1;
				A.set(i, -1);
			sum += A.get(i);
			System.out.println(sum);
			if (map.containsValue(sum)) {
				startPoint = i;
				for (Map.Entry<Integer, Integer> e : map.entrySet()) {
					{
						if (e.getValue().equals(sum))
							endPoint = e.getKey();
					}
				}
				int diff = startPoint - endPoint;
				if (diff < 0) {
					diff = (-1) * diff;
				}
				System.out.println(startPoint + " : " + endPoint + " = " + diff);

				if (res < diff) {

					res = startPoint - endPoint;
				}
			} else

				map.put(i, sum);

		}

		System.out.println("snma");

		/*
		 * map.forEach((key, value) -> {
		 * 
		 * System.out.println(key + " : " + value); });
		 */

		return res;

	}

}
