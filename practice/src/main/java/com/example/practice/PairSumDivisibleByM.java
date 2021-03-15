/*
 * Approach :
 * ax + r1 = number 
 * bx + r2= number 
 * where x is the number we are dividing with 
 * so we can say (a+b)x + r1+r2 = 0 
 * since (a+b) is divisible by x , so to make the equation zero (r1+r2) == x
 * all we need to do is find the pairs based on r1 , x-r2
 * can be done by adding the reminders in the hm and finding x-r2
 * there will be 3 cases for solving this issue :
 * 1. r1 == x-r2 then the reminder belongs to the same bucket N*(N-1)/2
 * 2. r1 != x-r2 then the reminder belongs to the diff bucket N*M;
 * 3. if r1 == r2 == 0 then reminder belongs to same bucket N*N-1/2
 * 4. r1 != x-r2 then r1 < x-r2 or r1 > x but since we are traversing in the map we know that 
 * we would be accessing these elements twice so to access the element only once we would have to 
 * consider either r1< x-r2 or r1>x-r2
 * 
 * since int * int -> can cause overflow , always use long for this 
 * */package com.example.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PairSumDivisibleByM {
	
	    public static int solve(ArrayList<Integer> A, int B) {
	        long res = 0;
	        int mod = 1000000007;
	        HashMap<Integer , Long> map = new HashMap<Integer , Long>();
	        for(int i =0;i<A.size();i++){
	        	int keyMap = A.get(i)%B;
	            if(map.containsKey(keyMap)){
	                map.put(keyMap , map.get(keyMap)+1);
	            }
	            else
	                map.put(keyMap, (long)1);
	        }
	        
	     
	        for(Map.Entry mapElement : map.entrySet()){
	            int key = (int)mapElement.getKey();
	            long value = (long)mapElement.getValue();
	            
	            int diff = B - key;
	            if(map.containsKey(diff)) {
	            if(diff == key){
	                //same bucket 
	                res += ((value * (value-1))/2);
	         //       System.out.println(res);
	                res = res % mod;
	            }
	            else if (diff > key)
	            {
	            //	long prod = map.get(key)*map.get(diff)
	                res+= (value * map.get(diff));
	                 res = res % mod;
	            }
	            }
	        }
	        if(map.containsKey(0)){
	        	  res += ((map.get(0) * (map.get(0)-1))/2);
	              
	                res = res % mod;
	        }
	     return (int)res;   
	    }
	

	
	public static int solve1(ArrayList<Integer> A, int B) {
	 	long res = 0;
			long mod = 1000000007;
			HashMap<Integer, Long> map = new HashMap<Integer, Long>();
			// System.out.println(A.size());
			for (int i = 0; i < A.size(); i++) {
				int key = A.get(i) % B;
				if (map.containsKey(key))
					map.put(key, map.get(key) + 1);
				else
					map.put(key, (long)1);

			}

			for (Map.Entry mapElement : map.entrySet()) {
				int key = (int) mapElement.getKey();
				long value = ((long) mapElement.getValue());
				int diff = B - key;
				if (map.containsKey(diff)) {
				//	System.out.println(B - key + " : " + key + " :: " + map.get(B - key) + " : " + map.get(key));

					if (diff == key ) {
					//	System.out.println(B - key + " : " + key + " :: " + map.get(B - key) + " : " + map.get(key));
						long sum = (map.get(key) * (map.get(key) - 1) / 2);
					//	System.out.println("sum"+sum);
						res += sum ;
					//	System.out.println(res);
						res = res % mod ;
					} else {
						if (key<diff) {
						//	System.out.println(B - key + " : " + key + " :: " + map.get(B - key) + " : " + map.get(key));

							res += (map.get(key) * map.get(B - key));
							res = res % mod ;
						//	System.out.println(res / 2);
						}
					}

				}else if (key == 0) {
					/*
					 * System.out.println("inside zero"); System.out.println(B - key + " : " + key +
					 * " :: " + map.get(B - key) + " : " + map.get(key));
					 */
					long sum = (map.get(key) * (map.get(key) - 1) / 2);
				//	System.out.println("sum"+sum);
					res += sum ;
				//	System.out.println(res);
					res = res % mod ;
				}
			}
			// map.forEach((key1 , value)->{ System.out.println(key1+ " : "+value); });

			return (int)res;

	}

}
