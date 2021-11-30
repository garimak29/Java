/*Problem Description

Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).



Problem Constraints

1 <= number of nodes <= 105



Input Format

First and only argument is root node of the binary tree, A.



Output Format

Return a 2D integer array denoting the zigzag level order traversal of the given binary tree.



Example Input

Input 1:

    3
   / \
  9  20
    /  \
   15   7
Input 2:

   1
  / \
 6   2
    /
   3


Example Output

Output 1:

 [
   [3],
   [9, 20],
   [15, 7]
 ]
Output 2:

 [ 
   [1]
   [6, 2]
   [3]
 ]


Example Explanation

Explanation 1:

 Return the 2D array. Each row denotes the traversal of each level.
 * 
 * 
 * */

/*
 * Intuition of level order traversal 
 * - > basically we can add the root node to the queue
 * one we visit the root note add the childern in the queue and remove root from the queue
 * - > 
 *  3
   / \
  9  20
    /  \
   15   7
   
   Queue > 3
   Now upon visiting 3 , remove 3 from the queue and add the childern to the queue
   Queue > 9 20
   Remove 9 and add its childern if there are any
   Queue > 20 (no child of 9)
   Queue > 15 7
   Queue > 7
   Queue > 
   
   In our case we can keep the count of the children seperately and as per that we can insert the value in the arrayList
 * */

package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class LevelOrderTraversal {

	public static ArrayList<ArrayList<Integer>> levelOrder(TreeNode A) {
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		ArrayList<Integer> level = null;
		if(A == null) {
			return res;
		}
		
		queue.add(A);
		while(queue.size() > 0) {
			int size = queue.size();
			level = new ArrayList<Integer>();
			for(int i =0;i<size;i++) {
				
				TreeNode top = queue.poll();
				level.add(top.val);
				if(top.left != null)
					queue.add(top.left);
				if(top.right != null)
					queue.add(top.right);
			}
			
			
			res.add(level);
			
		}
		

		return res;
	}

	private static ArrayList<ArrayList<Integer>> traverse(ArrayList<ArrayList<Integer>> res, 
			Queue<TreeNode> queue) {

		TreeNode A = queue.peek();
		
		
		if (A == null)
			return res;
		else {
			System.out.println("to be checked "+A.val);
			queue.poll();
			System.out.println("old Queue");
			for (TreeNode item : queue) {
				System.out.print(item.val + " ");
			}
			// L Rt r
			if (A.left != null) {
				queue.add(A.left);

			}

			if (A.right != null) {
				queue.add(A.right);

			}
			traverse(res, queue);
			//queue.remove();
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

		System.out.println(levelOrder(D));

		/*
		4
	2		6
1		35		7
*/
	}

}


/** * Definition for binary tree * class TreeNode { * int val; * TreeNode left; * TreeNode right; * TreeNode(int x) { val = x; } * } */
/*public class Solution {
	public ArrayList<ArrayList<Integer>> levelOrder(TreeNode A) {
	    ArrayList<ArrayList<Integer>> res = new ArrayList<>();
	    ArrayList<Integer> level = new ArrayList<>();
	    Queue<TreeNode> queue = new LinkedList<>();
	    if (A == null)
	        return null;
	    queue.add(A);
	    queue.add(null);
	    TreeNode node;
	    while (!queue.isEmpty()) {
	        node = queue.remove();
	        if (node == null && queue.isEmpty()) {
	            res.add(new ArrayList<>(level));
	            break;
	        }
	        if (node == null) {
	            res.add(new ArrayList<>(level));
	            level.clear();
	            queue.add(null);
	            continue;
	        }
	        level.add(node.val);
	        if (node.left != null)
	            queue.add(node.left);
	        if (node.right != null) {
	            queue.add(node.right);
	        }
	    }
	    return res;
	}
}*/