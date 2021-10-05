/*
 * Inorder Traversal
Problem Description

Given a binary tree, return the inorder traversal of its nodes values.

NOTE: Using recursion is not allowed.



Problem Constraints
1 <= number of nodes <= 105



Input Format
First and only argument is root node of the binary tree, A.



Output Format
Return an integer array denoting the inorder traversal of the given binary tree.



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

 [1, 3, 2]
Output 2:

 [6, 1, 3, 2]


Example Explanation
Explanation 1:

 The Inorder Traversal of the given tree is [1, 3, 2].
Explanation 2:

 The Inorder Traversal of the given tree is [6, 1, 3, 2].
 * 
 * */

package Trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InorderTraversal {
	// L > r > Rt
	public static ArrayList<Integer> inorderTraversal(TreeNode A) {
		ArrayList<Integer> res = new ArrayList<Integer>();
		res = (ArrayList<Integer>) traverse(A, res);
		for (Integer integer : res) {
			System.out.println(integer);

		}
		return res;
	}

	public static List<Integer> traverse(TreeNode A, List<Integer> res) {

		if (A == null)
			return res;
		else {
			traverse(A.left, res);
			res.add(A.val);
			traverse(A.right, res);
		}

		return res;
	}

	public static ArrayList<Integer> stackInorder(TreeNode A) {
		ArrayList<Integer> res = new ArrayList<Integer>();
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode root = A;
		//stack.push(root);
		while (root != null || !stack.isEmpty()) {
			// go till left till u find the leaf node and to keep a track , add the traversed nodes to the stack
			
			if(root != null) {
				stack.push(root);
				System.out.println("stack -->"+stack.get(stack.size()-1).val);
				root = root.left;
			}
			else {
				// once the leaf node is reached pop out last node added to the stack
				// and move towards the right of the poped node
				//System.out.println("stack pop -->"+stack.pop().val);
				root = stack.pop();
				res.add(root.val);
				root = root.right;
			}
		}
		for (Integer integer : res) {
			System.out.println("res : "+integer);

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
		inorderTraversal(A);
		TreeNode node = A;
	//	System.out.println("stack"+ node.val);
		stackInorder(node);

		/*
		 * 1A 2B 3C 4D 5E 6F 7G 8H
		 */

	}

}

