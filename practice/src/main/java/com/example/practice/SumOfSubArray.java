package com.example.practice;

import java.util.ArrayList;
import java.util.HashMap;

public class SumOfSubArray {
	public static ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
		HashMap<Integer , ArrayList<Integer>> map = new HashMap<Integer , ArrayList<Integer>>();
		for (int i =0;i<A.size();i++) {
			for(int j=i+1;j<A.size();j++) {
				
				int key = A.get(i)+A.get(j);
				if (map.containsKey(key)) {
					
					
					System.out.println("found"+map.get(A.get(i)+A.get(j)));
					System.out.println(i+" "+j);
					
				}
				else {
					ArrayList<Integer> arr = new ArrayList<Integer>();
					System.out.println(i+" "+j);
					arr.add(i);
					arr.add(j);
					map.put(A.get(i)+A.get(j),arr );
					
				}
					
			}
			System.out.println(map.size());
			map.forEach((key , value) -> {
				System.out.println(key +" : "+value);
				
			});
			
		}
		return null;
		
    }
}
