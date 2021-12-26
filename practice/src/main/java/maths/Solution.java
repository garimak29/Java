package maths;

public class Solution {

	public static int solve(int A) {
		int res = 0;
		int i;
		for (i = 0; i < A; i++) {
			A = A - i;
		}
		return i;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Solution.solve(10));

	}

}
