/*Postorder Traversal
Problem Description

Given a binary tree, return the Postorder traversal of its nodes values.

NOTE: Using recursion is not allowed.



Problem Constraints
1 <= number of nodes <= 105



Input Format
First and only argument is root node of the binary tree, A.



Output Format
Return an integer array denoting the Postorder traversal of the given binary tree.



Example Input
Input 1:

   1
    \
     2
    /
   3
Input 2:

   1
  / \
 6   2
    /
   3


Example Output
Output 1:

 [3, 2, 1]
Output 2:

 [6, 3, 2, 1]


Example Explanation
Explanation 1:

 The Post order Traversal of the given tree is [3, 2, 1].
Explanation 2:

 The post order Traversal of the given tree is [6, 3, 2, 1].
 * 
 * */
package Trees;

import java.util.ArrayList;
import java.util.Stack;

public class PostOrderTraversal {

	public static ArrayList<Integer> postorderTraversal(TreeNode A) {
		ArrayList<Integer> res = new ArrayList<Integer>();
		res = traverse(A, res);
		for (Integer integer : res) {
			System.out.println(integer);
		}
		return res;
	}

	public static ArrayList<Integer> traverse(TreeNode A, ArrayList<Integer> res) {
		if (A == null)
			return res;
		else {
			// L Rt r

			traverse(A.left, res);
			traverse(A.right, res);
			res.add(A.val);

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
		TreeNode H = new TreeNode(8);
		A.left = B;
		A.right = C;
		B.left = D;
		B.right = E;
		C.left = F;
		C.right = G;

		D.left = H;
		postorderTraversal(A);
		//stackPostOrder(A);
		/*
		 * 1A 2B 3C 4D 5E 6F 7G 8H
		 */
		// 8 4 5 2 6 7 3 1
	}
}
/*
 * public ArrayList<Integer> postorderTraversal(TreeNode A) {
	    Stack<TreeNode> stack1, stack2;
	    ArrayList<Integer> postorder;
	    TreeNode node;
	    stack1 = new Stack<>();
	    stack2 = new Stack<>();
	    postorder = new ArrayList<>();
	    if (A == null)
	        return null;
	    stack1.push(A);
	    while (!stack1.isEmpty()) {
	        node = stack1.pop();
	        stack2.push(node);
	        if (node.left != null)
	            stack1.push(node.left);
	        if (node.right != null)
	            stack1.push(node.right);
	    }
	    while (!stack2.isEmpty()) {
	        node = stack2.pop();
	        postorder.add(node.val);
	    }
	    return postorder;
	}
 * 
 * */
 