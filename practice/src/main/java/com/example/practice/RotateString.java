package com.example.practice;

public class RotateString {
	 public static String solve(String A, int B) {
		 StringBuilder str = new StringBuilder("");
		 if(B > A.length())
			 B= B%A.length();
		 System.out.println(A);
		 int i=0, count = A.length() , j = A.length()-B;
		 System.out.println(" i :"+i+" j "+j+" count "+count);
		 while(j<A.length() && count > 0) {
			 str.append(A.charAt(j));
			 	j++;
			 	count--;
			 	System.out.println("inside "+str);
		 }
		 
		 while(i<A.length()-B && count >0) {
			 str.append(A.charAt(i));
			 	i++;
			 	count--;
				System.out.println(str);
		 }
		 return str.toString();
	    }

}
