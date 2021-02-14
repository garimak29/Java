package com.example.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;



public class Anagrams {
	
	//@SuppressWarnings("unchecked")
	public static String newString(ArrayList list) {
		String result = null;
		list.sort(null);
		result = list.toString();
		return result; 
	}
	 public static ArrayList<ArrayList<Integer>> anagrams(final List<String> A) {
	  
	 	  // key - addition of ASCII value of the strings passed  , value - array of integers  
	  HashMap <String , ArrayList>  map = new HashMap<String, ArrayList>();
	  for (int i =0;i< A.size();i++)
	  {	
		  ArrayList newStr = new ArrayList();
		  for(int j=0;j<A.get(i).length();j++) {
			  newStr.add(A.get(i).charAt(j));
		  }
		  String newKey = newString(newStr);
		  if(map.containsKey(newKey)) {
			   ArrayList<Integer> myList = new ArrayList<Integer>();
					
				  myList = map.get(newKey); 
				  myList.add(i+1);
				  map.put(newKey, myList); 
		//		 System.out.println(map.get(newKey));
				
		  }
		  else
		  {
			  ArrayList<Integer> myList = new ArrayList<Integer>();
				  myList.add(i+1);
				  map.put(newKey,myList ); 
		//		  System.out.println(map.get(newKey));
				 
	  }
 }
	  
	  ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
	// Set<String> keys = map.keySet();
	 ArrayList<String> keys = new ArrayList<String>(map.keySet());
     for(int i=keys.size()-1; i>=0;i--){
    	 res.add(new ArrayList(map.get(keys.get(i))));
    //     System.out.println(map.get(keys.get(i)));
     }
	
	  return res;
	  }
	 

}
