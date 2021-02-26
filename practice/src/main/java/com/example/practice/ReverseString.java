package com.example.practice;

public class ReverseString {
	 public static String solve(String A) {
		 char temp ;
		int count=0;
		A=reverse(A).toString();
		if(A.length()==1)
			return A;
	     StringBuilder str = new StringBuilder(A.trim());
	     StringBuilder res = new StringBuilder("");
	//	System.out.println(A);
		  for (int i =1;i<str.length();i++) { 
		  if(str.charAt(i-1) == ' ' && str.charAt(i)!=' ') { 
			  count++; 
			  }
		  
		  
		  }
	//	 System.out.println("cpunt :"+count);
		 int start =0, end =0;
		 int counterCount =0;
	//	 System.out.println("length :"+str.length());
		 int i =0;
		 for (i=1;i<str.length();i++) {
			 
			 String str1="";
			 
			 if(str.charAt(i-1) == ' ' && str.charAt(i)!= ' ') {
				 
				 end = i;
				
			//	System.out.println("start :"+start+" : end :"+ end +" : character :"+i);
				 StringBuilder newStr = new StringBuilder(str.substring(start, end));
					
				 	  start = end;
					  newStr = reverse(newStr.toString());
			//		  System.out.println("newStr :"+newStr.toString());
					res.append(newStr.toString().trim()).append( " " );
			//		System.out.println("i "+i+" : "+res);
				 
				counterCount++;
				// System.out.println("counrter:"+counterCount);
			 }
			 if(count == counterCount ) {
					break;
			 }	 
			 
		 }
		// System.out.println(count);
		 if(count == counterCount ) {
			// System.out.println(str.substring(i, str.length()));
			 if(str.charAt(i)==' ')
				 start = i+1;
			 else
				 start = i-1;
				res.append(reverse(str.substring(start, str.length())).toString());
			//	System.out.println(res);
		 }
		 return res.toString().trim();
	    }

	private static StringBuilder reverse(String substring) {
		// TODO Auto-generated method stub
		StringBuilder str = new StringBuilder(substring);
		char temp;
		for(int i =0;i<substring.length()/2;i++) {
			 temp = str.charAt(i);
				str.setCharAt(i, str.charAt(str.length()-1-i));
				str.setCharAt(str.length()-1-i, temp);
		}
		return str;
	}
}
