package com.example.practice;

import java.util.ArrayList;

public class PairWithGivenSum2 {
	 public static int solve(ArrayList<Integer> A, int B) {
		 int count =0;
		 boolean flag =false;
		 int i =0 , j=A.size()-1;
		 while(i<j) {
			 int sum = A.get(i)+A.get(j);

			 System.out.println(i+" i :"+j+" :j" +"sum : "+sum);
			 if(sum != B) {
				 if(sum <B && j==A.size()) 
					 j--;
				 else if (sum > B) {
					 j--;
				 }
				 else {
					 i++;
				 }
			 }
			 if(sum == B) {
				 
				 if(A.get(i)*1 == A.get(i+1)*1 && A.get(j)*1 == A.get(j-1)*1  && A.size() > 2 && i<A.size()-2 && j<A.size()-2)
					{
						//System.out.println("count2 before "+ count);
						count+=4;
						i+=2;
						j+=2;
						System.out.println("count2 "+ count);
					}
			 else if(A.get(i)*1 == A.get(i+1)*1 && A.size() > 2)
				{
					//System.out.println("count2 before "+ count);
					count+=2;
					i+=2;
					System.out.println("count2 "+ count);
				}
				else if(A.get(j)*1 == A.get(j-1)*1 && A.size() > 2) {
					count+=2;
					
					j-=2;
					
					System.out.println("count3 "+ count);
				}
				else {
					
					 count++;
					i++;
					System.out.println("count1 "+ count);
				}
			 }
			
			
		 }
		 if(A.size() == 3 && A.get(0) == A.get(1) && A.get(1) == A.get(2) && A.get(0) + A.get(1) == B ) {
				count++;
			}
		
		 return count;
	    }

	 public static int solve1(ArrayList<Integer> A, int B) {
		 int count =0;
		 
		 int i =0 , j=1;
		 while(i<=j && j<A.size() ) {
			 if(i==j && j<A.size()-1)
				 j++;
			 int sum = A.get(i)+A.get(j);
			 System.out.println(i+" i :"+j+" :j"+" sum :"+sum);
				
			if(sum == B) {
				count++;
				j++;
			}
			else if(sum > B && i<A.size()-1)
				{
				i++;
				}
			else
				{
				if(j<A.size()-1)
				j++;
				}
			
			if(i ==j && j == A.size()-1)
				break;
			
		 }
		
		 if( A.size() >2 && A.get(1)+A.get(2) == B) {
			
			 count++;
		 }
		 return count;
	    }

}

