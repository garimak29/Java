package com.example.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PairSumDivisibleByM {
	public static int solve(ArrayList<Integer> A, int B) {
		int res = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		// System.out.println(A.size());
		for (int i = 0; i < A.size(); i++) {
			int value = A.get(i) % B;
			map.put(i, value);

		}
		map.forEach((key1, value) -> {
			System.out.println(key1 + " : " + value);
		});

		for (int i = 0; i < A.size(); i++) {
			// System.out.println("hello");
			int value = A.get(i) % B;

			// System.out.println(value);

			if (!(map.containsValue(B - value) || value == 0)) {
				System.out.println("i : " + i + " :: B" + B + " - value " + value + "= " + (B - value) + " res : " + res
						+ " map contains value :" + map.containsValue(B - value));
				res = res + 1;

			}
			// System.out.println("i : "+i+" :: B"+B+" - value "+value+"= "+(B-value)+" res
			// : "+res +" map contains value :"+map.containsValue(B-value));

		}

		// map.forEach((key1 , value)->{ System.out.println(key1+ " : "+value); });

		return res;
	}

	public static int solve1(ArrayList<Integer> A, int B) {
		int res = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		// System.out.println(A.size());
		for (int i = 0; i < A.size(); i++) {
			int key = A.get(i) % B;
			if (map.containsKey(key))
				map.put(key, map.get(key) + 1);
			else
				map.put(key, 1);

		}

		for (Map.Entry mapElement : map.entrySet()) {
			int key = (int) mapElement.getKey();
			int value = ((int) mapElement.getValue());
			int diff = B - key;
			if (map.containsKey(diff)) {
				System.out.println(B - key + " : " + key + " :: " + map.get(B - key) + " : " + map.get(key));
				/*
				 * if(diff == key) {
				 * 
				 * res += (map.get(key)*map.get(key)-1)/2; System.out.println(res); } else
				 */ {
					res += (map.get(key) * map.get(B - key));
					System.out.println(res / 2);

				}

			}
		}
		// map.forEach((key1 , value)->{ System.out.println(key1+ " : "+value); });

		return res / 2;

	}

}
