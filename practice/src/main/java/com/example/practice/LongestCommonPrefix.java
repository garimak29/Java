package com.example.practice;

import java.util.ArrayList;

public class LongestCommonPrefix {
	 public static String longestCommonPrefix(ArrayList<String> A) {
		StringBuffer prefix = new StringBuffer("");
		// String prefix = "";
		 for(int i =0;i<A.size();i++) {
			 prefix.append(A.get(i).charAt(i));
			 System.out.println(prefix);
			 for(int j=0;j<A.size();j++) {
				 if(""+A.get(i).charAt(j) == prefix.toString()) {
					 System.out.println("in");
				 }
				 else
					 break;
			 }
		 }
		 return prefix.toString();
	    }

}
