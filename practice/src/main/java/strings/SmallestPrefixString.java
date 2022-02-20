/*Given 2 strings A and B of size N and M respectively consisting of lowercase alphabets, find the lexicographically smallest string that can be formed by concatenating non empty prefixes of A and B (in that order).
Note: The answer string has to start with a non empty prefix of string A followed by a non empty prefix of string B.



Problem Constraints

1 <= N, M <= 100000



Input Format

First argument is a string A of size N.
Second argument is a string B of size M.



Output Format

Return a string denoting Lexicographically smallest string that can be formed by concatenating non empty prefixes of A and B (in that order).



Example Input

Input 1:

 A = "abba"
 B = "cdd"
Input 2:

 A = "acd"
 B = "bay"


Example Output

Output 1:

 "abbac"
Output 2:

 "ab"


Example Explanation

Explanation 1:

 We can concatenate prefix of A i.e "abba" and prefix of B i.e "c".
 The lexicographically smallest string will be "abbac".
Explanation 2:

 We can concatenate prefix of A i.e "a" and prefix of B i.e "b".
 The lexicographically smallest string will be "ab".

*
* */

package strings;

public class SmallestPrefixString {
    public static String smallestPrefix(String A, String B) {
        char[] a = A.toCharArray();
        char[] b = B.toCharArray();
        String res = "";
        int i = 0, j = 0;
        while (i < A.length() && j < B.length()) {

            if (a[i] < b[j]) {
                res += "" + a[i];

                i++;

            } else if (b[j] < a[i]) {
                if (i == 0) {
                    res += "" + a[i];

                    i++;
                } else {
                    res += "" + b[j];
                    j++;
                }
            } else {
                if (i == 0) {
                    res += "" + a[i] + b[j];

                    i++;
                    j++;
                } else {
                    res += b[j];
                    j++;
                }
            }

            if (j == 1) {
                if (i != 0) {
                    break;
                }
            } else if (j == 0 && i == A.length()) {
                res += b[j];
            }

        }
        return res;
    }

    public static void main(String[] args) {
            System.out.println(smallestPrefix("ababa" , "ahahahah"));
           System.out.println(smallestPrefix("a" , "a"));
          System.out.println(smallestPrefix("harry" , "potter"));
        System.out.println(smallestPrefix("tom", "riddle"));
        System.out.println(smallestPrefix("twvvsl", "wtcyawv"));
    }
}
/*
* public class Solution {
    public String smallestPrefix(String A, String B) {
        String ans = "";
        int i = 1;
        ans += A.charAt(0);
        while (i < A.length() && A.charAt(i) < B.charAt(0)) {
            ans += A.charAt(i);
            i++;
        }
        ans += B.charAt(0);
        return ans;
    }
}
*
* */