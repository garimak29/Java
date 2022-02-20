/*Problem Description

Given two binary trees, check if they are equal or not.

Two binary trees are considered equal if they are structurally identical and the nodes have the same value.



Problem Constraints

1 <= number of nodes <= 105



Input Format

First argument is a root node of first tree, A.

Second argument is a root node of second tree, B.



Output Format

Return 0 / 1 ( 0 for false, 1 for true ) for this problem.



Example Input

Input 1:

   1       1
  / \     / \
 2   3   2   3
Input 2:

   1       1
  / \     / \
 2   3   3   3


Example Output

Output 1:

 1
Output 2:

 0


Example Explanation

Explanation 1:

 Both trees are structurally identical and the nodes have the same value.
Explanation 2:

 Value of left child of the tree is different.
*
* */

package Trees;

public class IdenticalBinaryTree {
    public static int isSameTree(TreeNode A, TreeNode B) {

        if(check(A, B))
            return 1;
        else
            return 0;
    }

    private static boolean check(TreeNode a, TreeNode b) {
        if(a == null && b == null)
            return true;
        //fail safe condition
        if(a == null || b == null)
            return false;
        if(a.val != b.val)
            return false;

        return (check(a.left , b.left) &&
                check(a.right , b.right));
    }

    public static void main(String[] args) {
        System.out.println(isSameTree(new TreeNode(0), new TreeNode(0)));
    }
}
/*
*  public int isSameTree(TreeNode A, TreeNode B) {
        return sameTree(A, B);
    }

    public int sameTree(TreeNode A, TreeNode B) {
        if (A == null && B == null)
            return 1;
        if (A == null || B == null)
            return 0;
        if (A.val != B.val)
            return 0;

        int num = 1;
        num = num & sameTree(A.left, B.left) & sameTree(A.right, B.right);
        return num;
    }
}
*
* */