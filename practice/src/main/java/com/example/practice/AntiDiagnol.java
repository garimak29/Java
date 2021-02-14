package com.example.practice;

import java.util.ArrayList;

public class AntiDiagnol{
	public static int[][] diagonal(int[][] A) {
		int[][] res = new int[2*A.length-1][3];
		
		int k =0;
		System.out.println(2*A.length-1);
		for (int i=0;i<A.length;i++) {
			
			for (int j=0;j<A.length;j++) {
				if(i+j >= A.length)
						k = i-(i+j - (A.length-1)) ;// basically i - diff
					else
						k=i;
					System.out.println(A[i][j]);
				res[i+j][k] = A[i][j];
				System.out.println("i: "+i+" j:"+j+" i+j:"+(i+j)+" k:"+k+"res "+res[i+j][k]);
				
			}
		}
		
		for (int p =0;p<2*A.length;p++) {
			for(int q= 0;q<A.length;q++) {
				if(res[p][q] == 0)
					res[p][q] = (Integer) null;
		//		System.out.print(res[p][q]);
			}
		//	System.out.println();
		}
		return res;
    }
	
	
}
