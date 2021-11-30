/*Problem Description

Given the root node of a Binary Tree denoted by A. You have to Serialize the given Binary Tree in the described format.

Serialize means encode it into a integer array denoting the Level Order Traversal of the given Binary Tree.

NOTE:

In the array, the NULL/None child is denoted by -1.
For more clarification check the Example Input.


Problem Constraints

1 <= number of nodes <= 105



Input Format

Only argument is a A denoting the root node of a Binary Tree.



Output Format

Return an integer array denoting the Level Order Traversal of the given Binary Tree.



Example Input

Input 1:

           1
         /   \
        2     3
       / \
      4   5
Input 2:

            1
          /   \
         2     3
        / \     \
       4   5     6


Example Output

Output 1:

 [1, 2, 3, 4, 5, -1, -1, -1, -1, -1, -1]
Output 2:

 [1, 2, 3, 4, 5, -1, 6, -1, -1, -1, -1, -1, -1]


Example Explanation

Explanation 1:

 The Level Order Traversal of the given tree will be [1, 2, 3, 4, 5 , -1, -1, -1, -1, -1, -1].
 Since 3, 4 and 5 each has both NULL child we had represented that using -1.
Explanation 2:

 The Level Order Traversal of the given tree will be [1, 2, 3, 4, 5, -1, 6, -1, -1, -1, -1, -1, -1].
 Since 3 has left child as NULL while 4 and 5 each has both NULL child.
 * 
 * 
 * */

package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class SerializeBinarytree {
	 public static ArrayList<Integer> solve(TreeNode A) {
		 ArrayList<Integer> res = new ArrayList<Integer>();
		 Queue<TreeNode> queue = new LinkedList<TreeNode>();
		 if(A == null)
			 return res;
		 queue.add(A);
		 while(queue.size() >0) {
			 TreeNode top = queue.poll();
			res.add(top.val);
			 if(top.left != null)
				 queue.add(top.left);
			 else
				 res.add(-1);
			 if(top.right != null)
				 queue.add(top.right);
			 else
				 res.add(-1);
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
