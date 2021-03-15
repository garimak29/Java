package com.example.practice;

import java.util.List;

public class MajorityElement {
	 public static int majorityElement(final List<Integer> A) {
		 int res = 0;
		 int majorityElement = 0;
		 int count =0;
		 int i =0;
		 for(i =0;i<A.size();i++) {
			 if(count == 0) {
				count++;
				 majorityElement = A.get(i);
			 }else if(count !=0 ) {
				if(A.get(i) == majorityElement) {
					count++;
				}
				else
					count --;
			 }
		//	 System.out.println(majorityElement);
			 
		 }
		 count=0;
		 for( i =0;i< A.size();i++) {
			 if(A.get(i) == majorityElement)
				 count++;
		 }
		 if(count > (A.size()/2))
			 res = majorityElement;
		 return res;
	    }
	 
}
