package com.example.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class PerfectCards {
	public static  String solve(ArrayList<Integer> A) {
	    String res = "LOSE";
	    
	    if(A.size()%2!=0)
	    	return res;
	    HashMap<Integer , Integer > map = new HashMap <Integer , Integer>();
	    for(int i =0;i<A.size();i++) {
	    	if ((map.containsKey(A.get(i))))
	    	map.put(A.get(i), map.get(A.get(i))+1);
	    	else
	    		map.put(A.get(i), 1);
	    }
	    
	    	if(map.size() !=2)
	    		return res;
	    
			int count =map.get(A.get(0));
			//System.out.println(count);
			for (Entry<Integer, Integer> entry : map.entrySet()) {
				if(count != entry.getValue())
					return res;
			}
		 
			
		 
	    res= "WIN";
	    return res;
	
	}

}
