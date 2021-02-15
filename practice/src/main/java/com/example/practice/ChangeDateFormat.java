package com.example.practice;

import java.util.HashMap;

public class ChangeDateFormat {
	 public static String solve(String A) {
		 StringBuilder res = new StringBuilder("");
		 String[] arr = A.split(" ");
		 HashMap<String , String> month = new HashMap<String , String>();
		 month.put("Jan", "01");
		 month.put("Feb", "02");
		 month.put("Mar", "03");
		 month.put("Apr", "04");
		 month.put("May", "05");
		 month.put("Jun", "06");
		 month.put("Jul", "07");
		 month.put("Aug", "08");
		 month.put("Sep", "09");
		 month.put("Oct", "10");
		 month.put("Nov", "11");
		 month.put("Dec", "12");
		 
	//	 for (int i =0;i<arr.length;i++) {
		//	 System.out.println(arr[0].substring(0, arr[0].length()-2));
			 res.append(arr[2]);
			 res.append("-");
			 res.append(month.get(arr[1]));
			 res.append("-");
			 String date = arr[0].substring(0, arr[0].length()-2);
			 if(date.length() == 1)
				 res.append("0");
			 res.append(date);
				
			 
			 
//		 }
				/*
				 * System.out.println(A); System.out.println(res);
				 */ 
		 return res.toString();
	    }
}
