/*Prime String (100 Marks)
Oddia and Evenia are two friends who love strings and prime numbers. Although they have the same taste and like similar things, they are enemies when it comes to even and odd numbers. Oddia likes the odd numbers and Evenia likes the even numbers. They have a problem for you to solve.


A string S of lowercase letters will be provided and you have to figure out if the given string is Prime String or not. The index starts at 1.


Prime String: A string is considered a prime string only if the absolute difference between the sum of odd indexed letters and even indexed letters is completely divisible by any of the odd prime numbers less than 10.


Note: For calculations, consider the ASCII value of lowercase letters.


Example:

String, S = abcdef

Summation of Odd Indexed letters, O = a + c + e = 97 + 99 + 101 = 297

Summation of Even Indexed letters, E = b + d + f = 98 + 100 + 102 = 300


Absolute Difference = |O-E| = |297-300| = 3


This is completely divisible by 3 and leaves 0 as remainder. Thus, the given string is a Prime String.


If the string is prime string, print Prime String otherwise print Causal String. Can you solve it?

Input Format
The first line of input consists of the number of test cases, T

Next N lines each consist of a string, S.


Note: Read the input from the console.

Constraints
1<= T <=10

2<= |S| <=10000


|S| is the length of the string.

Output Format
For each test case, print Prime String if the string is prime string otherwise print Casual String.

Sample TestCase 1
Input
2
bbae
abcdef
Output
Casual String
Prime String
Explanation
Test Case 1: 

Sum of Odd indexed letters, O = 98+97 = 195

Sum of Even indexed letters, E = 98 + 101 = 199


Absolute Difference = |195-199| = 4


This is not divisible by any of the odd prime numbers. The given string is Casual String.


Test Case 2: As explained in the example.
 * */

package strings;

import java.util.Scanner;

public class PrimeString {

	public static String checkPrimeString(String input) {
		// System.out.println("input -- >"+input);
		String res = "Casual String";
		int oddSum = 0, evenSum = 0;
		for (int i = 0; i < input.length(); i++) {
			// System.out.println(input.charAt(i)+" -- "+(input.charAt(i)+0));
			if (i % 2 == 0) {
				evenSum += input.charAt(i);

			} else {
				oddSum += input.charAt(i);
			}
		}

		int diff = evenSum - oddSum;
		// to handle absolute value
		if (diff < 0) {
			diff *= (-1);
		}
		// System.out.println("diff -->"+diff);
		for (int i = 0; i < 10; i++) {
			if (checkPrime(i) && (i%2 !=0) && (diff % i) == 0) {
				return "Prime String";
			}
		}
		return res;
	}

	public static boolean checkPrime(int input) {
		boolean res = true;
		for (int i = 2; i < (input / 2) + 1; i++) {
			// System.out.println(i+" current value");
			if (input % i == 0) {
				res = false;
				break;
			}

		}
		// base case
		if (input == 0 || input == 1) {
			res = false;
		}
		return res;
	}

	public static void main(String[] args) {
		int t = 0;
		Scanner sc = new Scanner(System.in);
		t = Integer.parseInt(sc.nextLine());
		String input;
		for (int i = 0; i < t; i++) {
			// System.out.println("t--> "+i);
			input = sc.nextLine();
			System.out.println(checkPrimeString(input));
		}

		/*
		 * for(int j=0;j<20;j++) { System.out.println("i : "+j+" = "+checkPrime(j)); }
		 */

	}

}
