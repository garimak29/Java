/*
 * 
 *Q1 - Move all zeroes to end of array
Given an array of random numbers, Push all the zero’s of a given array to the end of the array. For example, if the given arrays is {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0}, 
it should be changed to {1, 9, 8, 4, 2, 7, 6, 0, 0, 0, 0}. The order of all other elements should be same. 
Expected time complexity is O(n) and extra space is O(1).

Example:  
 

Input :  arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
Output : arr[] = {1, 2, 4, 3, 5, 0, 0, 0};
 
 * */
package arrays;

public class MoveZerosToTheEnd {
	public static int[] solution(int[] a) {
		int i = 0, j = 0;
		while (j < a.length && i < a.length) {

			if (a[i] != 0) {
		//		System.out.println("inside nonn zero " + i + " , " + j + " = " + a[i]);
				i++;
				j++;
			} else {
			//	System.out.println(i + " , " + j + " = " + a[j]);
				
				while (j<a.length-1) {
					if (a[j] != 0)
						break;
					else if (j < a.length - 1 && a[j]==0)
						j++;
				}
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			//	System.out.println(i + " , " + j + " swap ");
				i++;

			}
		}
		for (int l = 0; l < a.length; l++) {
			System.out.println(a[l]);
		}
		return a;
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 0, 4, 3, 0, 5, 0 };
		solution(a);
		int[] b = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0};
		solution(b);

	}
}
