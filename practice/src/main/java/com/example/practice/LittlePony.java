package com.example.practice;

import java.util.ArrayList;
import java.util.HashMap;

public class LittlePony {

	// TLE error
	public static ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
		ArrayList<Integer> res = new ArrayList<Integer>();

		for (int i = 0; i < B.size(); i++) {
			System.out.println("-----------------" + i + "------------------");
			int count = 0;
			int diff = B.get(i);
			for (int j = 0; j < A.size(); j++) {

				System.out.print(diff + " - " + A.get(j));
				diff = diff - A.get(j);
				System.out.print(" = " + diff + "\n");
				if (diff > 0)
					count++;
				else
					diff = diff + A.get(j);

			}

			res.add(count);
		}
		return res;

	}

	public static ArrayList<Integer> solve1(ArrayList<Integer> A, ArrayList<Integer> B) {
		ArrayList<Integer> res = new ArrayList<Integer>();
		ArrayList<Integer> pres = new ArrayList<Integer>();
		
		int sum =0;
		for (int i =0;i < A.size();i++) {
			sum+=A.get(i);
			res.add(sum);
		}
		 for(int i =0;i<B.size();i++) {
			 
				 System.out.println("-----------------"+i+"------------------");
		
			// System.out.println(diff);
			
			  for(int j=0;j< A.size();j++) { // System.out.println(res.get(j));
			  
			  if(j < res.size()-1) { if(res.get(j)<= B.get(i) && res.get(j+1) > B.get(i) )
			  { // System.out.println(j); 
				  pres.add(j+1); break; 
				  
			  }
				  else if (res.get(0)> B.get(i) )
				  { pres.add(0); break; }
			  
			  } else { if (res.get(j)<B.get(i)) { pres.add(j+1); break; } }
			 
			 }
			 
			 
		 }
		return pres;
	    
	 
	 }

	public static ArrayList<Integer> solve2(ArrayList<Integer> A, ArrayList<Integer> B) {
		ArrayList<Integer> res = new ArrayList<Integer>();
		ArrayList<Integer> pres = new ArrayList<Integer>();

		int sum = 0;
		for (int i = 0; i < A.size(); i++) {
			sum += A.get(i);
			res.add(sum);
		}
		for (int i = 0; i < B.size(); i++) {
			System.out.println("B :"+B.get(i));
			int index = findIndex(res, B.get(i));
			pres.add(index);
			

		}
		return pres;

	}

	public static int findIndex(ArrayList<Integer> arr, int target) {
		
		int start = 0, end = arr.size() - 1;
		int mid = 0;
		int j = arr.size();
		
		if (target > arr.get(arr.size() - 1))
			return arr.size();
		if (target < arr.get(0))
			return 0;
		
		while (start <= end) {
			mid = (start + end) / 2;
			System.out.println("mid: " + arr.get(mid));
			if ((target > arr.get(mid) && target < arr.get(mid + 1)) || (target == arr.get(mid))) {
				System.out.println("pppp");
				return mid + 1;
			}

			else if (target > arr.get(mid)) {
				start = mid + 1;

			} else if (target < arr.get(mid)) {
				System.out.println("end updated");
				end = mid - 1;
			}

			j = end;
		}
		return 0;
	}

	/*
	 * public static void main(String[] args) { ArrayList<Integer> arr = new
	 * ArrayList<Integer>(); arr.add(3); arr.add(7); arr.add(11); arr.add(17); int
	 * target = 4; System.out.println(findIndex(arr, target)); }
	 */

}
