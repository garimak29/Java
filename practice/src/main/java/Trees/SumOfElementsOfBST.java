package Trees;

public class SumOfElementsOfBST {
	static int sum = 0;

	public static int sumNodes(TreeNode A) {
		int leftsum = 0, rightsum = 0;
		if (A == null) {
			return 0;
		} else {
			leftsum += sumNodes(A.left);
			rightsum += sumNodes(A.right);
			return A.val + leftsum + rightsum;
		}

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
		
		System.out.println(sumNodes(A));

	}

}
