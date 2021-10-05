package com.example.practice;

import java.util.ArrayList;
import java.util.HashMap;

public class RemoveDuplicatesFromSortedArray {
	// using array
	public static int removeDuplicates(ArrayList<Integer> a) {
		int len = 0;
		int i = 0, j = i + 1;
		System.out.println(a.size());
		while (i < a.size() && j < a.size()) {  // O(N) complexity 

			if (a.get(i)*1 == a.get(j)*1) {
				
				a.remove(j); // leading to O(N) complexity
			//	j++;
			}
			else {
				i++;
				j++;
			}
			System.out.println(i +":"+j+" :"+a );
			
		//	j++;
		}
		System.out.println(a);
		 len = a.size();
		return len;
	}

	// using hashmap
	public static int removeDuplicates1(ArrayList<Integer> a) {
		int len = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < a.size(); i++) {
			if (map.containsKey(a.get(i))) {
				map.put(a.get(i), map.get(a.get(i)) + 1);
			} else {
				map.put(a.get(i), 1);
			}
		}
		len = map.size();
		return len;
	}
	
	
}
