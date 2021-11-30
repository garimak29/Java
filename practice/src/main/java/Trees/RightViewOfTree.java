/*
 * Problem Description

Given a binary tree of integers denoted by root A. Return an array of integers representing the right view of the Binary tree.

Right view of a Binary Tree is a set of nodes visible when the tree is visited from Right side.



Problem Constraints

1 <= Number of nodes in binary tree <= 100000

0 <= node values <= 10^9



Input Format

First and only argument is head of the binary tree A.



Output Format

Return an array, representing the right view of the binary tree.



Example Input

Input 1:

 
            1
          /   \
         2    3
        / \  / \
       4   5 6  7
      /
     8 
Input 2:

 
            1
           /  \
          2    3
           \
            4
             \
              5


Example Output

Output 1:

 [1, 3, 7, 8]
Output 2:

 [1, 3, 4, 5]


Example Explanation

Explanation 1:

Right view is described.
Explanation 2:

Right view is described.
 * 
 * */

package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class RightViewOfTree {
	 public static ArrayList<Integer> solve(TreeNode A) {
		 Queue<TreeNode> queue = new LinkedList<TreeNode>();
		 ArrayList<Integer> res = new ArrayList<Integer>();
		int arr = 0 ;
		 int size =0;
		 if(A == null)
			 return res;
		 queue.add(A);
		 while(queue.size() > 0) {
			 size = queue.size();
			 
			
			 for (int i =0;i<size;i++) {
				 TreeNode top = queue.poll();
				arr = top.val;
				 if(top.left != null)
					 queue.add(top.left);
				 if(top.right != null)
					 queue.add(top.right);
			 }
			 res.add(arr);
			
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
