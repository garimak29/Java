package utilPackage;

import java.util.ArrayList;

public class UtilClass {
	public static  ArrayList<Integer> ArrayToArrayList(int[] array){
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		for(int i =0;i<array.length;i++) {
			arrayList.add(array[i]);
		}
		
		return arrayList;
		
	}
	
	/*
	 * public static ArrayList<Integer> TwoDArrayToArrayList(int[][] array){
	 * ArrayList<ArrayList<Integer>> arrayList = new
	 * ArrayList<ArrayList<Integer>>(); for(int i =0;i<array.length;i++) { for(int
	 * j=0;j<) arrayList.add(array[i]); }
	 * 
	 * return arrayList;
	 * 
	 * }
	 */
	
	
}
