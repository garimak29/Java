package com.example.practice;

import java.util.HashMap;

public class ExcelColumnNumber {
	public static int titleToNumber(String A) {
		int res =0;
		HashMap <Character , Integer > map = new HashMap<Character , Integer>();
		for(int i =1;i<27;i++) {
			map.put( (char) (i+64),i);
		//	System.out.println((char) (i+64));
		}
		int i=A.length()-1;
		int j=0;
		while(i>=0) {
		//	A.charAt(i);
		//	System.out.println(map.get(A.charAt(i)));
		//	System.out.println(Math.pow(26, j));
			res+=map.get(A.charAt(i))*(Math.pow(26, j));
			i--;
			j++;
		}
		
		
		return res;
		
		
	}

}
