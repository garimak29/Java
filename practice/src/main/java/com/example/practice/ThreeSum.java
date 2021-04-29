package com.example.practice;

import java.util.ArrayList;

public class ThreeSum {

	 public static int threeSumClosest(ArrayList<Integer> A, int B) {
		 int sum =0 , i =0 , k =1 , j=A.size()-1 , threeSum =0;
		 int diff , threeSumDiff ;
		 while(j!=1) {
			
			 System.out.println("i : "+i+" A[i] :"+A.get(i)+" j : "+j+" A[j] : "+A.get(j)+" k : "+k+" A[k] :"+A.get(k));
			 sum = A.get(i)+A.get(j)+A.get(k);
			 if(B>sum) {
				 diff = B- sum;
			 }
			 else 
				 diff = sum - B;
			 
			 if(B>threeSum) {
				 threeSumDiff =B - threeSum ;
			 }
			 else
				 threeSumDiff =threeSum -B ;
			 
			 System.out.println(diff +" : "+threeSumDiff);
			 System.out.println("sum :"+sum +" threeSum : "+threeSum);
			 if(sum == B)
				 return B;
			 else if (B- sum  <  B - threeSum )
			 {
				 threeSum = sum ;
			 }
			 k++;
			 if(k == j)
			 {
				 k=1;
				 j--;
			 }
		 }
		 
		 return threeSum;
		 
	    }
}
