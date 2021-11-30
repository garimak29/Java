package Trees;

public class SortedArrayToBalancedBST {

	public static TreeNode sortedArrayToBST(final int[] A) {
		TreeNode root = null;
		int i = 0;
		while (i < A.length) {
			root = insert(root, A[i]);
		//	System.out.println(A[i]);
			i++;
		}

	//	 System.out.println(root.val);

		// System.out.println(root.val);
		return root;
	}

	public static TreeNode insert(TreeNode root, int val) {
		if (root == null) {
		//	System.out.println("insde");
			return new TreeNode(val);
		}

	//	System.out.println(root.val);
		if (val > root.val) {
			root.right = insert(root.right, val);
		} else if (val < root.val) {
			root.left = insert(root.left, val);
		}
	//	System.out.println(root.val);
		return root;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = { 1, 2, 3, 4, 5 };
		InorderTraversal.inorderTraversal(sortedArrayToBST(A));

	}

}
