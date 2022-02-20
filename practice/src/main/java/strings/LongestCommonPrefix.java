package strings;

import java.util.ArrayList;
import java.util.Arrays;

public class LongestCommonPrefix {

	public static String longestCommonPrefix(ArrayList<String> A) {

		if(A == null || A.size() == 0)
			return "";
		String res = "";
		// assume the first word is the longest common prefix
		String temp = A.get(0);
		int j=0;

		for(int i =1;i<A.size();i++){
			String currentWord = A.get(i);
			while(j<temp.length() && j<currentWord.length()){
				if ( temp.charAt(j)== currentWord.charAt(j))
					j++;
				else
					break;

			}

			// the first character did not match return directly
			if(j == 0)
				return "";

			temp = currentWord.substring(0,j);
			j=0;

		}
		return temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> str = new ArrayList<>();
		str.addAll(Arrays.asList("abc","abcty","abcjksah"));
		System.out.println(longestCommonPrefix(str));

		ArrayList<String> str1 = new ArrayList<>();
		str1.addAll(Arrays.asList("abcd", "abcd", "efgh"));
		System.out.println(longestCommonPrefix(str1));
	}

}


/*
* public class Solution {
    public String longestCommonPrefix(ArrayList < String > A) {
        if (A.size() == 0)
            return "";
        String str;
        String res = "";
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < A.size(); i++) {
            min = Math.min(min, A.get(i).length());
        }
        for (int i = 0; i < min; i++) {
            char c = A.get(0).charAt(i);
            // check if c character is same in every string or not
            for (int j = 1; j < A.size(); j++) {

                if (c != A.get(j).charAt(i))
                    return res;
            }
            res += c;
        }
        return res;
    }
}
*
*
* */