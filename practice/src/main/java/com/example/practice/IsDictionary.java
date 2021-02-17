package com.example.practice;

import java.util.HashMap;

public class IsDictionary {

	public static int solve(String [] A, String B) {
		int res = 1;
		HashMap<Character , Integer> map = new HashMap<Character , Integer>();
		for(int i =0;i<B.length();i++)
		{
			map.put(B.charAt(i), i);
		}
		if(A.length > 1) {
			for(int j=0;j<A.length-1;j++) {
				int len =0;
				boolean sameFlag = false;
				if(A[j].length()>A[j+1].length())
					len =A[j+1].length();
				else
					len= A[j].length();
				int k =0;
				System.out.println(A[j]);
				while(len > 0) {

					System.out.println(map.get(A[j].charAt(k))+" - "+map.get(A[j+1].charAt(k)));
					if (map.get(A[j].charAt(k)) < map.get(A[j+1].charAt(k)))
					{
						k++;
						len--;		
						sameFlag = false;
						break;
					}
					else if (map.get(A[j].charAt(k)) == map.get(A[j+1].charAt(k))) {
						sameFlag = true;
						k++;
						len--;
					}
					else
					{
						k++;
						len--;
						return 0;
					}

				}
				if(len == 0 || sameFlag == true)
				{
					if(A[j].length()>A[j+1].length())
						return 0;
				}
			}

		}
		return res;

	}

}
