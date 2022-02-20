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

	public static int isValidBST1(TreeNode A) {
		if( isValid(A, Integer.MIN_VALUE , Integer.MAX_VALUE))
			return 1 ;
		else
			return 0;

	}

	public static boolean isValid(TreeNode A , int l , int r){
		if(A == null)
			return true;
		if(A.val >= l && A.val <= r){
			boolean left = isValid(A.left , l , A.val);
			boolean right = isValid(A.right , A.val , r);
			return (left && right);
		}
		else
			return false;
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
		
		System.out.println(isValidBST1(D));
		
		/*
					4
				2		6
			1		35		7
*/
	}

}
