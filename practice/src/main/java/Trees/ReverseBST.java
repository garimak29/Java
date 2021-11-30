package Trees;

public class ReverseBST {

	public static void reverseTree(TreeNode root ) {
		TreeNode temp;
		//base
		if(root == null) {
			return ;
		}
		
		//left
		 reverseTree(root.left);
		// right
		 reverseTree(root.right);
		// join
		temp = root.left;
		root.left = root.right;
		root.right = temp;
		System.out.println("value after :"+root.val);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeNode A = new TreeNode(1);
		TreeNode B = new TreeNode(2);
		TreeNode C = new TreeNode(3);
		TreeNode D = new TreeNode(4);
		TreeNode E = new TreeNode(5);
		A.left = B;
		A.right = C;
		C.left = D;
		D.right = E;
		
	/*					A
	 * 				B		C
	 * 					D				
	 * 						E
	 * 
	 * 
	 * 
	 * 
	 * */
		InorderTraversal.inorderTraversal(A);
		reverseTree(A);

	}

}
