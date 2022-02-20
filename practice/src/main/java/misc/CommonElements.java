/*
 * Problem Description

Given two integer array A and B of size N and M respectively. Your task is to find all the common elements in both the array.

NOTE:

Each element in the result should appear as many times as it shows in both arrays.
The result can be in any order.


Problem Constraints
1 <= N, M <= 105

1 <= A[i] <= 109



Input Format
First argument is an integer array A of size N.

Second argument is an integer array B of size M.



Output Format
Return an integer array denoting the common elements.



Example Input
Input 1:

 A = [1, 2, 2, 1]
 B = [2, 3, 1, 2]
Input 2:

 A = [2, 1, 4, 10]
 B = [3, 6, 2, 10, 10]


Example Output
Output 1:

 [1, 2, 2]
Output 2:

 [2, 10]


Example Explanation
Explanation 1:

 Elements (1, 2, 2) appears in both the array. Note 2 appears twice in both the array.
Explantion 2:

 Elements (2, 10) appears in both the array.
 * 
 * */

package misc;

import java.util.ArrayList;
import java.util.HashMap;

public class CommonElements {

	public static ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
		ArrayList<Integer> res = new ArrayList<Integer>();
		A.sort(null);
		B.sort(null);
		int i = 0, j = 0;
		while (i < A.size() && j < B.size()) {
			 if (A.get(i) == B.get(j)) {
				res.add(A.get(i));
				i++;
				j++;
			} else if (A.get(i) < B.get(j)) {
				i++;
			} else if(A.get(i) > B.get(j)) {
				j++;
			}
		}
		return res;

	}


	public static ArrayList<Integer> solve1(ArrayList<Integer> A, ArrayList<Integer> B) {
		ArrayList<Integer> res = new ArrayList<Integer>();
		HashMap<Integer , Integer> map = new HashMap<>();
		for(int i=0;i<A.size();i++){
			if(map.containsKey(A.get(i)))
				map.put(A.get(i),map.get(A.get(i))+1);
			else
				map.put(A.get(i) , 1);
		}

		for(int j=0;j<B.size();j++){
			System.out.println(map.containsKey(B.get(j)) +" - "+ map.get(B.get(j)) );
			if(map.get(B.get(j)) != null && map.containsKey(B.get(j)) && map.get(B.get(j)) > 0){
				//while(map.get(B.get(j)) > 0)

					res.add(B.get(j));
					map.put(B.get(j) , map.get(B.get(j))-1);

			}
		}
		res.sort(null);
		return res;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1 ,1 ,1,2,2,2,2 };
		int[] b = { 1,1,2,3 };
		ArrayList<Integer> A = new ArrayList<Integer>();
		ArrayList<Integer> B = new ArrayList<Integer>();
		A = utilPackage.UtilClass.ArrayToArrayList(a);
		B = utilPackage.UtilClass.ArrayToArrayList(b);
		System.out.println(solve1(A, B));

	}

}
