package Trees;

public class MaxValueOfBT {

	public static int maxValue(TreeNode A) {
		int rightmax = 0, leftmax = 0;
		// base case
		if (A == null) {
			return 0;
		}
		// left sub tree
		else {
			leftmax = Math.max(leftmax, maxValue(A.left));

			// right sub tree
			rightmax = Math.max(rightmax, maxValue(A.right));
			// join results
			// can only join the results if u use A.val as per ur required solution
			// else it will return the results of the base case
			return Math.max(A.val, Math.max(rightmax, leftmax));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeNode A = new TreeNode(1);
		TreeNode B = new TreeNode(2);
		TreeNode C = new TreeNode(9);
		TreeNode D = new TreeNode(4);
		TreeNode E = new TreeNode(5);
		A.left = B;
		A.right = C;
		C.left = D;
		D.right = E;
		
		System.out.println(maxValue(A));

	}

}
