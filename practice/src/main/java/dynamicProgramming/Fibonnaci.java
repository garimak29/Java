package dynamicProgramming;

import java.util.Scanner;

public class Fibonnaci {
	
	public static int[] initializeArr(int a) {
		int[] arr = new int[a+1];
		for(int i =0;i<a;i++) {
			arr[i] =0; 
		}
		
		return arr;
	}
	public static int returnResult(int num) {
		
		//memoization
		int[] arr = initializeArr(num);
		return  returnFibonacci(num, arr);
		
	}
	public static int returnFibonacci(int a , int[] arr) {
		//System.out.println("inside main function "+a);
		//base case
		if(a < 2) {
			return a;
		}
		// recurssive code 
		if(arr[a] > 0) {
			return arr[a];
		}
		
		arr[a] = returnFibonacci(a-1, arr) + returnFibonacci (a-2 , arr);
		
		return arr[a];
		
	}
	    public static void main(String[] args) {
	        // YOUR CODE GOES HERE
	        // Please take input and print output to standard input/output (stdin/stdout)
	        // DO NOT USE ARGUMENTS FOR INPUTS
	        // E.g. 'Scanner' for input & 'System.out' for output
	    	Scanner sc = new Scanner(System.in);
	        System.out.println(returnResult(sc.nextInt()));
	    }
	}
