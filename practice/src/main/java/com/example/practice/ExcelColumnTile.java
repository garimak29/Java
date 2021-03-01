package com.example.practice;

import java.util.HashMap;

public class ExcelColumnTile {
	public static String convertToTitle(int A) {
		String str = "";
		HashMap <Integer , Character > map = new HashMap<Integer , Character>();
		for(int i =1;i<27;i++) {
			map.put(i, (char) (i+64));
		//	System.out.println((char) (i+64));
		}
		int a = 0 ;
		int temp;
		while(A>0) {
			a=A%26;
			
			if(a == 0) {
				str="Z"+str;
				A--;
			}
			else
				str = map.get(a)+""+str;
			A=A/26;
		//	System.out.println("a :"+a+" map : "+map.get(a)+" A:"+A);
		}
		System.out.println(A/26);
		System.out.println(map.get(20));
		
		return str.toString();
    }
	

}
