/*
Q2 - Merge Intervals
Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.

Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]

Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].

Constraints :
0 <= starti <= endi <= 10^4
intervals[i].length == 2

Naive Approach :
 a   	b	c
[1 , 3]      	[2 , 6]
a[0]a[1]  	b[0] b [1]
    	a[1] >= b[0] && a[1] < b[1] -- > over lap
   	 
    	op[] -> [a[0] , b[1]]
   	 
[6 , 9] [ 6 , 10]
[6 , 10]  

tc (o(n))
sc O(n)


*/

package mentor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class MergeInterval {
	public static void mergeIneterval(Interval[] arr) {
		Arrays.sort(arr , new Comparator<Interval>() {
		} );
		System.out.println("inside");
		ArrayList<Interval> res = new ArrayList<Interval>();
		for(int i =0;i<arr.length-1;i++) {
			if(arr[i].end >= arr[i+1].start && arr[i].end <= arr[i+1].end)
				res.add(new Interval(arr[i].start ,arr[i+1].end))  ;
		}
		for(int j =0;j<res.size();j++) {
			System.out.println(res.get(j).start);
			System.out.println(res.get(j).end);
		}
	}
	
	public static void main (String args[]) {
		Interval[] arr = new Interval[4];
		arr[0]=new Interval(1,3);
        arr[1]=new Interval(2,6);
        arr[2]=new Interval(8,10);
        arr[3]=new Interval(15,18);
		mergeIneterval(arr);
	}

}
