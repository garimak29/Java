package com.example.practice;

public class PascalTriangle {
	 public static int[][] solve(int A) {
		 int[][] res = new int[A][A];
		 int[][] res1 = new int[A][];
		 for (int i =0; i<A;i++) {
			int[] a = new int[i+1]; 
			 for(int j=0;j<i+1;j++) {
				 if(i == j || j==0) {
					
					 res[i][j]=1;
					a[j]=1;
			//		 System.out.println(i+"-"+j+"-->"+res[i][j]);
				 }
				 else {
					 res[i][j]= res[i-1][j-1]+res[i-1][j];
					 a[j] = res [i][j];
			//		 System.out.println(i+"-"+j+"--> first "+(res[1][0])+"ds"+res[1][1]+"+ second "+res[i-1][j] );
				 }
			//	 System.out.println(res[1][0]);
				 }
			 res1[i] = a;
			
		 }
		 for(int i = 0;i<A;i++) {
			 for (int j = 0;j<i+1;j++) {
				 System.out.print(res1[i][j]);
			 }
			 System.out.println(" ");
		 }
		 return res1;
	    }

}
