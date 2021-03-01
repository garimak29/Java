package com.example.practice;

import java.util.ArrayList;
import java.util.HashMap;

public class ChangeCharacter {
	 public static int solve(String A, int B) {
		 int res =0;
		 ArrayList<Integer> arr = new ArrayList<Integer>();
		 // Count for all the characters set to 0
		 for(int i =0;i<26;i++) {
			 arr.add(0);
			 
		 }
	//	System.out.println(arr);
		//count for all the characters are getting set to the actual count as per the occurance in the string
		 for(int i =0;i<A.length();i++) {
			 int c = (A.charAt(i) -97)%26;
			 arr.set(c, arr.get(c)+1);
		//	 System.out.println(c);
			
		 }
		 // sorting the list so that when we perform the substraction , we could set the count accordingly
		 arr.sort(null);
		System.out.println("sorted array :"+arr);
		 for(int i=0;i<26;i++) {
			 if(arr.get(i)>0 & B>0)
			 {
				 int diff = B-arr.get(i); 
				 // if diff > 0 then set B to B-count of the character , that is , we have removed those characters and hence the counter for those characters would be set to 0
				 if( diff >=0){
					 B -= arr.get(i);
					 arr.set(i, 0);
					 

					// System.out.println(B); 
				 }
				 else {
					 arr.set(i , (-1)*diff); // multiplied with -1 coz diff is would be in negative as count of chars would be more than B
					 B=0;
					 break;
				 }
				System.out.println("diff"+diff);
				 System.out.println("after diff arr :"+arr);
			//	 B--;
				 System.out.println("B :"+B);
			 }
		 }
		 System.out.println(arr);
		 // finally checking the chars which are not set to 0
		 for(int i=0;i<26;i++) {
			 if(arr.get(i)>0 )
			 {
				res++;
			 }
		 }
		
		 return res;
	    }

}
