/*
* You are given a string S. You want to change it to the lexicographically largest possible string by changing some of its characters. But you can only use characters of the string T as a replacement for characters of S. Formally, find the lexicographically largest string you can form by replacing some(or none) of the characters of S by using only the characters of string T. Note: Each character of T can be used at the most once.

Constraints:

1.   1 <= Length of S and T <= 50
2.   All the alphabets of S and T are lower case (a - z)
Input: A string A containing S and T separated by "_" character. (See example below)

Output: Lexicographically largest string P that can be formed by changing some or (none) characters of S using the characters of T.

Example:

Input:

A : "abb_c"
This implies S is "abb" and T is "c".

Output:

P = "cbb"
*
* */


package strings;

import java.util.ArrayList;
import java.util.Arrays;

public class LexographicallyLongest {
    public static String getLargest(String A) {

        String[] str = new String[2];
        str = (A.split("_"));
        String S = str[0];
        String T = str[1];
        //System.out.println(sortString(S));
        //    S= sortString(S);
        T = reverse(sortString(T));
        char[] s = S.toCharArray();
        char[] t = T.toCharArray();
        int i = 0, j = 0;
        while (i < S.length() && j < T.length()) {
            if (S.charAt(i) < T.charAt(j)) {
                s[i] = t[j];
                i++;
                j++;
            } else { //j++;
                i++;
            }
        }
        //  System.out.println(S+" -  "+T);
        return String.valueOf(s);
    }

    public static String reverse(String A) {
        char[] charArray = A.toCharArray();
        for (int i = 0; i < charArray.length / 2; i++) {
            char temp = charArray[i];
            charArray[i] = charArray[charArray.length - i - 1];
            charArray[charArray.length - i - 1] = temp;
        }
        return String.valueOf(charArray);
    }

    public static String sortString(String A) {
        char[] charArray = A.toCharArray();
        Arrays.sort(charArray);
        return String.valueOf(charArray);
    }

    public static void main(String[] args) {
        System.out.println(getLargest("mkj_uio"));
        System.out.println(getLargest("ittmcsvmoa_jktvvblefw"));
    }

}
