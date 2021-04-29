package com.example.practice;

public class GCd {
	 public static int gcd(int A, int B) {
		 Integer a = A;
		 Integer b = B;
		if (a>b)
		{
			int temp = a;
			a = b;
			b  = temp;
		}
		while(a>0) {
			b=b%a;
			System.out.println("B :"+b);
			int temp = a;
			a = b;
			b  = temp;
			System.out.println(a+" : "+b);
		}
		 return b;
	    }

	private static void swap(Integer A, Integer B) {
		// TODO Auto-generated method stub
		Integer temp = A;
		A= B;
		B= temp;
		
		
	}

}
