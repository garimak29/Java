package com.example.practice;

import java.util.ArrayList;
import java.util.HashMap;

public class ColorfulNumber {
	
	public static int colorful(int A) {
		int res=0;
		int temp = A;
		int len=0;
		HashMap<Integer , Boolean> map = new HashMap<Integer , Boolean>();
		ArrayList<Integer> arr = new ArrayList();
		while(temp != 0) {
			int rem = temp%10;
			arr.add(rem);
			map.put(rem, true);
			len++;
			temp = temp/10;
			
		}
		System.out.println(len);
		System.out.println(arr.size());
		int check = 0;
		for (int i=0;i< len ; i++) {
			System.out.println(arr.get(i));
			if(i+1<len)
			{	System.out.println(arr.get(i));
				check = arr.get(i)*arr.get(i+1);
				if(map.containsKey(check)) {
					return 0;
				}
				else
				{
					map.put(check, true);
				}
				if(i+2 < len ) {
					check = arr.get(i)*arr.get(i+1)*arr.get(i+2);
					if(map.containsKey(check)) {
						return 0;
					}
					else
					{
						map.put(check, true);
					}
				}
			
			}
		}
		System.out.println(len);
		//	int[] arr = new int[];
		
		map.forEach((keys , value)-> {
		
	         
            System.out.println("Key: " + keys + " Value: " + value);
     

    });
		if(map.size() == (len-1)*3 || len ==1)
			return 1;
			
		return res;
    }

}
