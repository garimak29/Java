/*
 * Closest Palindrome
Problem Description

Groot has a profound love for palindrome which is why he keeps fooling around with strings.
A palindrome string is one that reads the same backward as well as forward.

Given a string A of size N consisting of lowercase alphabets, he wants to know if it is possible to make the given string a palindrome by changing exactly one of its character.



Problem Constraints
1 <= N <= 105



Input Format
First and only argument is a string A.



Output Format
Return the string YES if it is possible to make the given string a palindrome by changing exactly 1 character. Else, it should return the string NO.



Example Input
Input 1:

 A = "abbba"
Input 2:

 A = "adaddb"


Example Output
Output 1:

 "YES"
Output 2:

 "NO"


Example Explanation
Explanation 1:

 We can change the character at index 3(1-based) to any other character. The string will be palindromic.
Explanation 2:

 To make the string palindromic we need to change 2 characters. 
 * 
 * 
 * */
package strings;

public class ClosePalindrome {
	 public static String solve(String A) {
		 String res = "NO" ;
		 int i =0 , j = A.length()-1 , count=0;
		 while(i<=j) {
			 System.out.println(A.charAt(i));
			 if(A.charAt(i) != A.charAt(j))
			 {
				count++;
			 }
			 i++;
			 j--;
			// System.out.println(A.charAt(i));
		 }
		 
		 System.out.println(count+"-->"+A.length());
		 if(count != 0)
			 res = "NO";
		 if(count == 0 && A.length()%2 != 0)
			 res= "YES";
		 else if (count == 1 )
			 res="YES";
		 else
			 res= "NO";
		 return res;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solve("abgba"));

	}

}
