package com.example.practice;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoSortedArray {
	
	 public static ArrayList<Integer> solve(final List<Integer> A, final List<Integer> B) {
	 ArrayList<Integer> arr = new ArrayList<Integer>();
	 int i =0, j=0;
	 while(i<A.size() && j<B.size()) {
		 if(A.get(i) < B.get(j)) {
			 arr.add(A.get(i));
			 i++;
		 }else if (A.get(i) > B.get(j)) {
			 arr.add(B.get(j));
			 j++;
			 
		 }
		 else
		 {
			 arr.add(A.get(i));
			 arr.add(B.get(j));
			 i++;
			 j++;
		 }
	 }
	 if(i < A.size()) {
		 while(i<A.size()) {
			 arr.add(A.get(i));
			 i++;
		 }
	 }
	 else if(j < B.size()) {
		 while(j<B.size()) {
			 arr.add(B.get(j));
			 j++;
		 }
	 }
	 return arr;
	 }

}
