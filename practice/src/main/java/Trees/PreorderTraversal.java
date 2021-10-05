/*
 * Preorder Traversal
Problem Description

Given a binary tree, return the preorder traversal of its nodes values.

NOTE: Using recursion is not allowed.



Problem Constraints
1 <= number of nodes <= 105



Input Format
First and only argument is root node of the binary tree, A.



Output Format
Return an integer array denoting the preorder traversal of the given binary tree.



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

 [1, 2, 3]
Output 2:

 [1, 6, 2, 3]


Example Explanation
Explanation 1:

 The Preoder Traversal of the given tree is [1, 2, 3].
Explanation 2:

 The Preoder Traversal of the given tree is [1, 6, 2, 3].
 * 
 * */

package Trees;

import java.util.*;


public class PreorderTraversal {
	// static List<Integer> res = new ArrayList<Integer>();
	  public static ArrayList<Integer> preorderTraversal(TreeNode A) {
		  List<Integer> res = new ArrayList<Integer>();
		  // r > L > R
		  TreeNode head = A;
		  res = traverse(A , res);
		for (Integer integer : res) {
			System.out.println(integer);
			
		}
		return (ArrayList<Integer>) res;
		  
	    }
	  
	  public static List<Integer> traverse(TreeNode A , List<Integer> res) {
		 
		  if(A == null)
			  return res;
		  else
		  {
			 res.add(A.val);
			  traverse(A.left , res);
			  traverse(A.right , res);
			 
		  }
		  
		  return res;
			  
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode A = new TreeNode(1) ;
		TreeNode B = new TreeNode(2) ;
		TreeNode C = new TreeNode(3) ;
		TreeNode D = new TreeNode(4) ;
		TreeNode E = new TreeNode(5) ;
		TreeNode F = new TreeNode(6) ;
		TreeNode G = new TreeNode(7) ;
		TreeNode H = new TreeNode(8) ;
		A.left = B;
		A.right = C;
		B.left = D;
		B.right = E;
		C.left = F;
		C.right = G;
		
		D.left = H;
		preorderTraversal(A);
		
		/*		1A
			2B		3C
		4D		5E 6F	7G
	8H*/

	}

}

/*
 * 
 * public ArrayList < Integer > preorderTraversal(TreeNode A) {
    ArrayList < Integer > res = new ArrayList < Integer > ();
    Stack < TreeNode > stack = new Stack < > ();
    if (A == null)
      return res;
    stack.push(A);
    TreeNode node;
    while (!stack.isEmpty()) {
      node = stack.pop();
      res.add(node.val);
      if (node.right != null)
        stack.push(node.right);
      if (node.left != null)
        stack.push(node.left);
    }

    return res;

  }
 * 
 * */
