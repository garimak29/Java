/*
 * Though process : 
 * Basically we know if we add a list of numbers and they result in same number that means nothing got 
 * added to that number 
 * 1,2,-2,1
 * prefix sum : 1,3,1,4
 * Now here from 1 to 1 something got added which resulted in the same number as per our main array
 * 2+ -2 = 0
 * so its correct
 * 
 * */
package com.example.practice;

import java.util.ArrayList;
import java.util.HashMap;

public class SumOfSubArrayZero {
	 public static int solve(ArrayList<Integer> A) {
		
		 int count=0;
		 //Long to avoid overflow error
		 HashMap <Long , Boolean > map = new HashMap<Long , Boolean>();
		 long sum =0;
		 for(int i =0;i<A.size();i++){
			 map.put(sum, true); // this statement has been added here so that if 0 is encountered then we have already input 1 zero in our hashmap it will directly find the element no need of entering new condition 
			 sum+=A.get(i);
			
			 if(map.containsKey(sum) )
			 {
				 System.out.println(sum);
				 System.out.println(count);
				 count++;
			 }
		
			
			
			 
		 }
		if(count >= 1)
		 return 1;
		else return 0;
	    }

}
