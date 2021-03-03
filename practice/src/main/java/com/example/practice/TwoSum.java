package com.example.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TwoSum {
	
	 public static int[] twoSum( int[] A, int B) {
		 	int[] res = new int[2];
		 	// key - index , value - A[i]
		 	HashMap<Integer , Integer > map = new HashMap<Integer , Integer >();
		 	int j=0;
		 	for (int i=0;i<A.length;i++) {
		 		int diff = B-A[i];
		 //		System.out.println("diff"+diff);
					map.put(j,A[j]);
					j++;
			//		System.out.println("get function "+ map.containsValue(diff));
				 if(map.containsValue(diff) ) {
					 res[1]= i+1;
					 
					 Set<Integer> keys = map.keySet();
					 for (Integer key : keys ) {
						 
					//	 System.out.println("key :"+key+" value "+map.get(key));
						// System.out.println(key+"  - "+res[1]+"=  "+(res[0] == res[1]));
							 
						 if (map.get(key).equals(diff)) {
							 res[0] = key+1;
							 
							break;
						 }
							 
					 }
					 	if(res[0]!=res[1] )
					 	 	return res;
				 }
		 		
		 		
		 	}
			
		 	
		if(res[0] == res[1] && res[0] ==0)
			return new int[] {};
		return res;
		 	
	    }
	 
	

}
