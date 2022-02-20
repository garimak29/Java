/*
* Problem Description

Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).



Problem Constraints

1 <= number of nodes <= 105



Input Format

First and only argument is the root node of the binary tree.



Output Format

Return 0 / 1 ( 0 for false, 1 for true ).



Example Input

Input 1:

    1
   / \
  2   2
 / \ / \
3  4 4  3
Input 2:

    1
   / \
  2   2
   \   \
   3    3


Example Output

Output 1:

 1
Output 2:

 0


Example Explanation

Explanation 1:

 The above binary tree is symmetric.
Explanation 2:

The above binary tree is not symmetric.
*/

package Trees;

public class SymetricBinaryTree {
    public int isSymmetric(TreeNode A) {
        if( check(A.left , A.right))
            return 1;
        return 0;
    }

    private boolean check(TreeNode left, TreeNode right) {
        if(left == null && right == null )
            return true;
        //indicating that either one of them is not reached the leaf and is not symetric
        //fail safe condition
        if(left == null || right == null )
            return false;
        //fail safe condition
        if(left.val != right.val)
            return false;
        return (check(left.left , right.right) &&
                check(left.right , right.left));

    }

}
/*
* public class Solution {
    public int isSymmetric(TreeNode A) {
        if (A == null)
            return 0;
        return rec(A.left, A.right) ? 1 : 0;
    }
    public boolean rec(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null)
            return true;
        if (node1 == null || node2 == null)
            return false;
        if (node1.val != node2.val)
            return false;
        return rec(node1.left, node2.right) | rec(node1.right, node2.left);
    }
}
*
* */