/*Q2 - Merge Intervals
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
 * 
 * */

package mentor;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

public class MergeInterval {
	public static void mergeIneterval(Interval[] arr) {
		// add a comparator so that if the intervals are not stored in any order this will help 
		// complexity o(nlogn)
		Arrays.sort(arr, new Comparator<Interval>() {

			@Override
			public int compare(Interval o1, Interval o2) {

				return o1.start - o2.start;
			}

		});
		

		Stack<Interval> res = new Stack();
		Interval interval = new Interval(0, 0);
		for (int i = 0; i < arr.length ; i++) {
			if (res.empty()) {
				res.add(arr[i]);
			} else {
				if ((res.peek()).end >= arr[i].start && res.peek().end <= arr[i].end) {
					Interval interval1 = new Interval(res.peek().start, arr[i].end);

					res.pop();
					res.add(interval1);

				}
				else
				{
					res.add(arr[i]);
				}

			}
		}
		System.out.println(res.size());
		for (int j = 0; j < res.size(); j++) {

			System.out.print(res.get(j).start +" , ");
			System.out.println(res.get(j).end);

		}
	}

	public static void main(String args[]) {
		Interval[] arr = new Interval[4];
		arr[0] = new Interval(2, 6);
		arr[1] = new Interval(1, 3);
		arr[2] = new Interval(8, 10);
		arr[3] = new Interval(15, 18);
		mergeIneterval(arr);
	}

}
