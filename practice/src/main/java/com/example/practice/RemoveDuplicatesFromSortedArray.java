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
	
	public static int removeDuplicates2(ArrayList<Integer> a) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int len = 0;
		int i = 0, j = 0;
		System.out.println(a.size());
		while (i < a.size() && j < a.size()) {  // O(N) complexity 
			
			if (a.get(i)*1 != a.get(i+1)*1) {
				a.set(j++, a.get(i));
			
			}
			
			i++;
			
			
			System.out.println("arr :"+arr);
		//	System.out.println(i +":"+j+" :"+a );
			
		//	j++;
		}
		a.removeAll(arr);
		
		System.out.println("a :"+a);
		 len = a.size();
		return len;
	}
	
	public static int removeDuplicates4(ArrayList<Integer> a) {
		/*
		 * ArrayList<Integer> prefixDiff = new ArrayList<Integer>(); prefixDiff.add(
		 * a.get(0));
		 */
		int len0 =0;
		if(a.size() == 1)
			return a.size();
		if(a.get(0) == 0)
			len0 =1;
		
		int sum =0;
		int firstValue = a.get(0);
		sum+=a.get(0);
		System.out.println("original arr :"+a);
		
		for(int i =1;i<a.size();) {
			System.out.println(a);
			if(a.get(i) == 0 )
			{
				i++;
				//System.out.println(a.get(i));
			}
			else if(a.get(i)%a.get(i-1) == 0 && (a.get(i-1)*1 !=0) && a.get(i)!=0){
				a.set(i, 0);
			}
			else
				if(i<a.size())
				i++;
			
		}
		System.out.println("after mod arr :"+a);
		a.sort(null);
		int i =0;
		  while(i<a.size()) {
			  if(a.get(i) == 0) {
				  a.remove(i);
			  }
			  else
			  i++;
		  }
		 
		  
		 
		System.out.println("a :"+a);
		
		
		return a.size();
	}


}
