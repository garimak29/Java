package recurrsion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Permutation {

	  public static ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A) {
		  ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		  for(int i =0;i<A.size()-1;i++) {
			 res.add(generate(A, i));
		  }
		  return res;
	  }
	  public static ArrayList<Integer> generate(ArrayList<Integer> A , int currentIndex){
		HashSet<String > map = new HashSet<String >();
		  for(int j=currentIndex;j<A.size();j++)
		{  A=swap(A,currentIndex,j);
		if((map.contains(A)))
				map.add(A.toString());
	//	 System.out.println(map);
		}
		  return A;
	  }
	  
	  public static ArrayList<Integer> swap(ArrayList<Integer> arr , int i , int j) {
		  int temp = arr.get(i);
		  arr.set(i, arr.get(j));
		  arr.set(j, temp);
		  return arr;
	  }
	  
	  
	  public static ArrayList<ArrayList<Integer>> permute1(ArrayList<Integer> A) {
		  ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		 ArrayList<Integer> B = new ArrayList<Integer>();
		  for(int i =0;i<A.size()-1;i++) {
			 res.add(generate1(B, A, i));
		  }
		  return res;
	  }
	
	private static ArrayList<Integer> generate1(ArrayList<Integer> b, ArrayList<Integer> a , int i) {
		// TODO Auto-generated method stub
		if(a.size() == 0) {
			return b;
		}
		else {
			b.add(a.get(i));
			a.remove(i);
			permute1(a);
		}
		return null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<Integer>();
	arr.add(1);
	arr.add(2);
	arr.add(3);
	System.out.println(permute1(arr));

	}

}
