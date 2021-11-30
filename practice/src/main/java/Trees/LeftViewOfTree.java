package Trees;

import java.util.ArrayList;
import java.util.Queue;

import java.util.LinkedList;

public class LeftViewOfTree {

	 public static ArrayList<Integer> solve(TreeNode A) {
		 ArrayList<Integer> res = new ArrayList<Integer>();
		 Queue<TreeNode> queue = new LinkedList<TreeNode>();
		 int size =0;
		 if(A == null )
			 return res;
		 queue.add(A);
		 while(queue.size() >0) {
			 size = queue.size();
			 res.add(queue.peek().val);
			 for(int i =0;i<size;i++) {
				 TreeNode top = queue.poll();
				 if(top.left != null)
					 queue.add(top.left);
				 if(top.right != null)
					 queue.add(top.right);
			 }
			
		 }
		 return res;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode A = new TreeNode(1);
		TreeNode B = new TreeNode(2);
		TreeNode C = new TreeNode(3);
		TreeNode D = new TreeNode(4);
		TreeNode E = new TreeNode(5);
		TreeNode F = new TreeNode(6);
		TreeNode G = new TreeNode(7);
		D.left = B;
		D.right = F;
		B.left = A;
		B.right = C;
		F.left = E;
		F.right = G;

		System.out.println(solve(D));

		/*
		4
	2		6
1		35		7
*/
	}

}
