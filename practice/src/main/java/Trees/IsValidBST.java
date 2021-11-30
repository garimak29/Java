package Trees;

public class IsValidBST {
	public static int isValidBST(TreeNode A) {

		TreeNode root = A;
		while (A != null && A.left != null && A.right != null) {
			if (A.val > A.left.val && A.val < A.right.val) {
				if (A.left != null)
					A = A.left;
				else
					A = A.right;
			} else
				return 0;
		}
		return 1;
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
		B.left=A;
		B.right = C;
		F.left=G;
		F.right = E;
		
		System.out.println(isValidBST(D));
		
		/*
					4
				2		6
			1		35		7
*/
	}

}
