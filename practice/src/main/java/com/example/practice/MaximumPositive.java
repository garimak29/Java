package com.example.practice;

import java.util.ArrayList;

public class MaximumPositive {
	 public static ArrayList<Integer> solve(ArrayList<Integer> A) {
	        int i =0 , j =1 , startPoint =0 , endPoint = 0 , len= 0;
	        while(i<A.size() && j<A.size()){
	        	
	            if(A.get(i) < 0 && j<A.size() && i<A.size()){
	            	System.out.println("if1 "+i+" : "+j+" : "+A.get(i)+" : "+A.get(j));
	                i++;
	                j++;
	                
	            }
	            else if (A.get(i)>0 && A.get(j) > 0) {
	            	System.out.println("if2 "+i+" : "+j+" : "+A.get(i)+" : "+A.get(j));
		             
	            	j++;
	            	  if(len < j-i)
	                    {    len = j-i;
	                        startPoint = i;
	                        endPoint = j;
	                    	System.out.println(len);
	                    }
	            }
	            else
	            {
	            	System.out.println("if3 "+i+" : "+j+" : "+A.get(i)+" : "+A.get(j));
		             
	                if(A.get(j)<0 && j<A.size()){
	                
	                    if(len < j-i)
	                    {    len = j-i;
	                        startPoint = i;
	                        endPoint = j;
	                    	System.out.println(len);
	                    }
	                    
	                    i=j;
	                    j++;
	                    
	                }
	            }
	        }
	        if(startPoint == endPoint && i<j) {
	        	startPoint = i;
	        	endPoint = j;
	        }
	        ArrayList<Integer> arr = new ArrayList<Integer>();
	        for(int k =startPoint;k<endPoint;k++){
	            arr.add(A.get(k));
	        }
	        return arr;
	    }
}
