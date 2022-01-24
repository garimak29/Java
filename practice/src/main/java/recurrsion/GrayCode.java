package recurrsion;

import java.util.ArrayList;
import java.util.Vector;

public class GrayCode {
	
 
	static int num;
	 
	/* we have 2 choices for each of the n bits either we
	can include i.e invert the bit or we can exclude the
	bit i.e we can leave the number as it is. */
	static void grayCodeUtil(ArrayList<Integer> res, int n)
	{
	    // base case when we run out bits to process
	    // we simply include it in gray code sequence.
	    if (n == 0)
	    {
	        res.add(num);
	        return;
	    }
	 
	    // ignore the bit.
	    grayCodeUtil(res, n - 1);
	 
	    // invert the bit.
	    num = num ^ (1 << (n - 1));
	    grayCodeUtil(res, n - 1);
	}
	 
	// returns the vector containing the gray
	// code sequence of n bits.
	static ArrayList<Integer> grayCode(int n)
	{
		ArrayList<Integer> res = new ArrayList<Integer>();
	 
	    // num is passed by reference to keep
	    // track of current code.
	    num = 0;
	    grayCodeUtil(res, n);
	 
	    return res;
	}
	 
	// Driver function.
	public static void main(String[] args)
	{
	    int n = 2;
	    ArrayList<Integer> code = grayCode(n);
	    for (int i = 0; i < code.size(); i++)
	        System.out.print(code.get(i) +"\n");
	}
	}
	 

/**
 * 
 * public class Solution {
    public ArrayList < Integer > grayCode(int A) {
        int n = A;
        ArrayList < Integer > result = new ArrayList < > ();
        result.add(0);
        for (int i = 0; i < n; i++) {
            int curSize = result.size();
            // push back all element in result in reverse order
            for (int j = curSize - 1; j >= 0; j--) {
                result.add(result.get(j) + (1 << i));
            }
        }
        return result;
    }
}
 */

