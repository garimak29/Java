package com.example.practice;

import java.util.ArrayList;
import java.util.List;

public class TestingPack {
	public static String stringInputOutput(List<Object> parameters , String expected , Object method , Object className) {
		String res = "";
	//	String actual = className.getClass().getMethod(method, String.class);
		return res;
	}
	public static ArrayList<Integer> convertToArrayList(int[] a){
		ArrayList<Integer> A = new ArrayList<Integer>();
		for(int i =0;i<a.length;i++) {
			A.add(a[i]);
		}
		return A;
	}

}
