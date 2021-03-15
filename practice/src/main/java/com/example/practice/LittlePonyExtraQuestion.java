package com.example.practice;

import java.util.ArrayList;
import java.util.HashMap;

public class LittlePonyExtraQuestion {

	
	    public static ArrayList<Integer> solve(ArrayList<Integer> A) {
	        ArrayList<Integer> arr = new ArrayList<Integer>();
	        int totalSum =0;
	        for(int i =0;i<A.size();i++){
	            totalSum +=A.get(i);
	        }
	        HashMap<Integer , Integer> map = new HashMap<Integer, Integer>();
	        int max=totalSum - A.get(0);
	        for(int i =0;i<A.size();i++){
	            int diff = totalSum - A.get(i);
	            if(diff > max)
	                max = diff;
	            if(map.containsKey(diff)){
	                map.put(diff , map.get(diff)+1);
	                
	            }
	            else 
	                map.put(diff , 1);
	        }
	        map.forEach((key, value)->{
	        	System.out.println(key +" : "+value );
	        });
	        System.out.println(max);
	        int countMax = map.get(max);
	        if( countMax == A.size()) {
		    	  arr.add(1);
		    	  arr.add(1);
		       }
	        else {
	        	int len = A.size();
	        	int gcd = gcd(countMax,A.size());
	        	System.out.println("gcd"+ gcd);
	        	if( gcd != 1) {
	        		countMax /=gcd;
	        		len /=gcd;
	        	
	        	}
	        arr.add(countMax);
	        arr.add(len);
	        }
	 //       System.out.println(countMax);
	   
	       // System.out.println("p :"+countMax+" q:"+A.size()+ "  = "+(countMax / A.size()));
	        return arr;
	    }
	    
	    public static int gcd(int a , int b) {
	    //	ArrayList<Integer>
	    	int gcd = 1;
	    	System.out.println(a+" : "+b);
	    	if( b%a == 0) {
	    		gcd = a;
	    	}
	    	for(int i =2 ;i<Math.pow(a, 0.5) && i<Math.pow(b , 0.5);i++) {
	    		if(a%i == 0 || b%i == 0) {
	    			gcd = i;
	    		}
	    	}
	    	System.out.println(gcd);
	    	return gcd;
	    }
	

}
