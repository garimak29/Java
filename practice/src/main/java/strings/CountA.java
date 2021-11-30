/*
 * Problem Description

You are given a string A. Find the number of substrings that start and end with 'a'.



Problem Constraints
1 <= |A| <= 105

String will have only lowercase English letters.



Input Format
Given the only argument is a String A.



Output Format
Return number of substrings that start and end with 'a'.



Example Input
Input 1:

 A = "aab"
Input 2:

 A = "bcbc"


Example Output
Output 1:

 3
Output 2:

 0


Example Explanation
Explanation 1:

 Substrings that start and end with 'a' are:
    1. "a"
    2. "aa"
    3. "a"
Explanation 2:

 There are no substrings that start and end with 'a'.
 * */

package strings;

public class CountA {
	
	 public static int solve(String A) {
		 int count =0;
		 int i=0,j=1;
		while(i<A.length() && j<A.length()) {
			if(A.charAt(i)== 'a' && A.charAt(j)=='a') {
				System.out.println("1st "+i+" -> "+j);
				count++;
				if(j-i==1)
					count+=2;
				i=j;
				j++;
				
				
			}
			else if(A.charAt(i)!= 'a') {
				i++;
			}
			else if(A.charAt(i)=='a' && A.charAt(j)!='a') {
				System.out.println("2nd "+i+" -> "+j);
			//	count++;
				j++;
			}
		}
		 return count;
	    }
	 
	 public static int solve1(String A) {
		 int count =0 , countaa =0;
		 
		 for(int i=0;i<A.length();i++) {
			 if(A.charAt(i)=='a' ) {
				 count++;
				 if(i+1<A.length() && A.charAt(i+1)=='a') {
					 countaa++;
				 }
			 }
		 }
		 count = (factorial(count-1))
		 return count;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	String str = "vleirzohviwfaqnefbdwzpcjdlxhqollqfdrdqvhqlinlggbmpxqwfsdytuihbmkssmelzpn";
	//	String str ="aab";
		String str = "anvnvnvnvnavnvnnvvnanvnvnvvnanvnv";
		System.out.println(solve(str));

	}

}
