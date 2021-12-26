package sorting;

import java.util.ArrayList;

public class WaveArray {
	 public static ArrayList<Integer> wave(ArrayList<Integer> A) {
		 A.sort(null);
		 ArrayList<Integer> B = new ArrayList<Integer>();
		 ArrayList<Integer> C = new ArrayList<Integer>();
		 int i , j =0;
		 for( i =0;i<A.size();i++) {
			 if(i%2==0) {
				 B.add(A.get(i));
			 }
			 else
				 C.add(A.get(i));
		 }
		 
		 A.removeAll(A);
		 while(j<B.size() && j< C.size()) {
			A.add(C.get(j));
			A.add(B.get(j));
			j++;
		 }
		 
		 if(j*2<i) {
			 if(j<B.size()) {
				 A.add(B.get(j));
			 }
			 else if (j<C.size()) {
				 A.add(C.get(j));
			 }
			 j++;
		 }
		 System.out.println(A.toString());
		 return A;
	    }

	 public static ArrayList<Integer> wave1(ArrayList<Integer> A) {
		 A.sort(null);
		 for(int i =0;i<A.size()-1;i+=2) {
			 swap(A , i , i+1);
		 }
		 System.out.println(A.toString());
		 return A;
	    }
	 

	private static void swap(ArrayList<Integer> a, int i, int j) {
		// TODO Auto-generated method stub
		int temp = a.get(i);
		a.set(i, a.get(j));
		a.set(j, temp);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {1, 2, 3, 4};
		
		wave1(utilPackage.UtilClass.ArrayToArrayList(A));
		int[] B = {5, 1, 3, 2, 4 };
		wave1(utilPackage.UtilClass.ArrayToArrayList(B));
	}

}
