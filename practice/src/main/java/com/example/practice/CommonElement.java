package com.example.practice;

import java.util.ArrayList;
import java.util.HashMap;

public class CommonElement {


	public static ArrayList<Integer> solve(ArrayList<Integer> a, ArrayList<Integer> b) {
		// TODO Auto-generated method stubH
		HashMap<Integer , Integer> map = new HashMap<Integer, Integer>();
		for(int i =0;i<b.size();i++) {
			if(map.containsKey(b.get(i))) {
				map.put(b.get(i), map.get(b.get(i))+1);
			}
			else {
				map.put(b.get(i), 1);
			}
			
		}
		
		ArrayList<Integer> res = new ArrayList<Integer>();
		for(int j =0;j<a.size();j++) {
			if(map.containsKey(a.get(j))) {
				if(map.get(a.get(j))>0)
					res.add(a.get(j));
				map.put(a.get(j), map.get(a.get(j))-1);
			}
			
		}
		return res;
	}
}
