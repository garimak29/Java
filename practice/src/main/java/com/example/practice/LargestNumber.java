package com.example.practice;

import java.util.ArrayList;
import java.util.List;

public class LargestNumber {
	 public static String largestNumber(List<Integer> A) {
		 StringBuilder str = new StringBuilder("");
		 for(int i =0;i<A.size();i++)
		 {	System.out.println("OLD A"+A);
			 A = sort((ArrayList<Integer>) A , i);
			System.out.println("New A"+A);
		 }
		 return str.toString();
		 	
	    }
	 public static ArrayList<Integer> sort(ArrayList<Integer> arr , int sortedElement){
		  int max = Integer.MIN_VALUE;
		  int index = 0 ;
		  for(int i =sortedElement;i<arr.size();i++) {
			  Integer num = arr.get(i);
			//  System.out.print(num);
			  if (num.toString().length() > 1) {
				 while(num.toString().length()>1)
					 num = num/10;
				  
			  }
			  System.out.print(num+"\n");
		//	  System.out.println();
			  if(num > max) {
				  max = num;
				  index = i;
			  }
		  }
		  System.out.println("max :"+max);
		  int temp = arr.get(index);
		  arr.remove(index);
		  arr.add(index, arr.get(sortedElement));
		  arr.remove(sortedElement);
		  arr.add(sortedElement,temp);
		  
		 System.out.println(arr.get(sortedElement));
		
		  return arr;
	 }
}
