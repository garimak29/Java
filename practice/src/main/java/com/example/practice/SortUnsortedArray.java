package com.example.practice;

import java.util.ArrayList;

public class SortUnsortedArray {
	public static int solve(ArrayList<Integer> A) {
		int res =0;
		if(A.size() == 0 || A.size() == 1)
			return res;
		ArrayList<Integer> arr = (ArrayList<Integer>) A.clone();
		//arr = A;// this is passing reference so now A is also getting sorted 
		
	//	System.out.println("a"+A);
		arr.sort(null);
	//	System.out.println("arr :"+arr);
		int start =0 , end = 0;
		int i =0 , j=arr.size()-1;
	//	System.out.println(arr.get(j));
		while(i < arr.size() && j> 0 ) {
			
			if(A.get(i) == arr.get(i) && A.get(j) == arr.get(j)) {
				i++;j--;
			//	System.out.println("A "+A.get(i) +" : "+arr.get(j));
			}
			else
			{
				if(A.get(i) == arr.get(i) &&A.get(j) != arr.get(j)) {
					i++;
					end = j;
				}
					
				else if (A.get(i) != arr.get(i) && A.get(j) == arr.get(j)){
					j--;
					start = i;
				}
				else if(A.get(i) != arr.get(i) && A.get(j) != arr.get(j)) {
					start = i;
					end= j;
					break;
				}
				
			}
			
		}
	//	System.out.println("start"+start+"  : end "+end);
		if(end != start)
			res = end -start+1;
		else
			res = end - start;
		return res;
    }

}
