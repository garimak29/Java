/*
 * Approach : 1. if the array is not sorted , sort it
 * 2. store the value in hashmap <key -> array value , value -> frequency of the value appeared
 * 3. if the value is greater than 1 then increase the value till u find a number which does not exists in the map
 * 5. put the new value with frequency 1 in the map. 
 * 
 * 
 * */package com.example.practice;

import java.util.ArrayList;
import java.util.HashMap;

public class UniqueElements {
	  public static int solve(ArrayList<Integer> A) {
		  int[] res = {0};
		  A.sort(null);
		  HashMap<Integer , Integer> map = new HashMap<Integer , Integer>();
		  for(int j =0;j<A.size();j++) {
			 
			  if(map.containsKey(A.get(j))) {
				  int a = map.get(A.get(j));
				  System.out.println(a+1);
				  
				  map.put(A.get(j), a+1); 
			  }
			  else
			  {  map.put(A.get(j), 1);
			  System.out.println("new element "+A.get(j));
			  }
			  }
		
		  map.forEach((key1 , value1)->{
				 System.out.println("current value \n"+key1 +" : "+ value1);
			 });
		  
		  // concurrentModification exception was observed to overcome this array list had to be used
		  /*map.forEach((key , value) ->{
			
		  	int check = key;
			  boolean flag =false;
			 System.out.println("key :"+key +" value :"+value);
			  while(map.containsKey(check) && value >1 ) {
				  flag =true;
				  check++;
				  System.out.println("updated check :"+check+" for key "+key);
				  res[0]+=1;
			  }
			
			if(flag)
				map.put(check, 1);
			flag =false;
			 
			
		  });*/
		  
		 for(int i =0;i< A.size();i++){
				
			 if(i<A.size()-1 && A.get(i)==A.get(i+1)) {
				i++;
			 }
			  	int check = A.get(i);
				  boolean flag =false;
				  System.out.println("key :"+A.get(i));
				  while(map.containsKey(check) && map.get(A.get(i)) >1 ) {
					  flag =true;
					  check++;
					  System.out.println("updated check :"+check+" for key "+A.get(i));
					  res[0]+=1;
				  }
				
				if(flag)
					map.put(check, 1);
				flag =false;
				 
				
		 }
		
			  return res[0];
	    }
}
