/*basically dfs means 3 types of searches
* 1. inorder
* 2. post order
* 3. pre-order
*
* Here in all of these implementation we are focused on searching the dept first
* */
package Trees;

public class DeptFirstSearch {
    public static void search(TreeNode root){
        if(root == null)
            return;
        search(root.left);
        System.out.println(root.val);
        search(root.right);
     //   System.out.println(root.val);
    }

    public static void main(String[] args) {
        TreeNode A = new TreeNode(1);
        TreeNode B = new TreeNode(2);
        TreeNode C = new TreeNode(3);
        TreeNode D = new TreeNode(4);
        TreeNode E = new TreeNode(5);
        A.left = B;
        A.right = C;
        C.left = D;
        D.right = E;
        search(A);
        /*					A
         * 				B		C
         * 					D
         * 						E
         *
         *
         *
         *
         * */

    }
}
