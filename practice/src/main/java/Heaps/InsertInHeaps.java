package Heaps;

import java.util.ArrayList;

import Trees.TreeNode;

public class InsertInHeaps {

	public static void insert(ArrayList<Integer> arr) {
		TreeNode A = new TreeNode(arr.get(0));
		for(int i =1;i<arr.size();i++) {
			if(A.val < arr.get(i)) {
				reheapify(A);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
