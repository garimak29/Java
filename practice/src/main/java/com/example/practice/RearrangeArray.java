/*
 * Approach : 
 * multiply with the size
 * add the new ith element to the original array element A[a[i]]
 * a.get(a.get(i)/a.size())/a.size()+a.get(i)
 * a.get(i)/a.size() : to get the original element (to get correct index else overflow coz size of array is less that 15
 * a.get(a.get(i)/a.size()) - this will get the element at the required index
 * a.get(a.get(i)/a.size())/a.size() - we need to add the original value so divided it by the size
 * a.get(a.get(i)/a.size())/a.size()+a.get(i) - we need to store both new array value and the old one of the required index , hence added them 
 * to recover the original value without size multiplication - just / by size
 * to recover the new value without size - just take a modulus
 * 
 * */package com.example.practice;

import java.util.ArrayList;

public class RearrangeArray {
	public static void arrange(ArrayList<Integer> a) {
		int i ;
		for( i =0;i<a.size();i++) {
			a.set(i, a.get(i)*a.size());
		}
	//	System.out.println(a);
		for( i =0;i<a.size();i++) {
			System.out.println(a.get(a.get(i)/a.size())+" : "+a.get(i));
			int value = a.get(a.get(i)/a.size())/a.size()+a.get(i);
			a.set(i, value);
		}
//		System.out.println(a);
		for( i =0;i<a.size();i++) {
			a.set(i, a.get(i)%a.size());
		}
	//	System.out.println(a);
	}

}
