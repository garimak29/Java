package Trees;

public class BalancedBinaryTree {
	boolean isBal;
	int height;
	
	public  BalancedBinaryTree(boolean isBal , int height) {
		this.height = height;
		this.isBal = isBal;
	}

	public static BalancedBinaryTree isBal(TreeNode root) {
		if(root == null) {
			return new BalancedBinaryTree(true, 0);
		}
		
		BalancedBinaryTree left = isBal(root.left);
		BalancedBinaryTree right = isBal(root.right);
		if(left.isBal && right.isBal && Math.abs(left.height-right.height) <2) {
			return new BalancedBinaryTree(true, Math.max(left.height, right.height)+1);
		}
		else
			return new BalancedBinaryTree(false, 0);
	}
	 public static int isBalanced(TreeNode A) {
		 int res = 0;
		 
		   BalancedBinaryTree resNode = isBal(A);
		   if(resNode.isBal )
			   return 1;
		 return res;
	    }
	 
	 
	 public static boolean isBalanced1(TreeNode A) {
		 if (A == null )
		 {
			 return true;
		 }
		 
		 int leftHeight = getHeight(A.left);
		 int rightHeight = getHeight(A.right);
		 
		 return  (Math.abs(rightHeight - leftHeight) < 2) && isBalanced1(A.left) && isBalanced1(A.right);
	 }
	 
	 public static int isBalanced0(TreeNode A) {
		 int res = 0;
		 if(isBalanced1(A))
			 return 1;
		 return 0;
		 }
	private static int getHeight(TreeNode root) {
		// TODO Auto-generated method stub
		int ht = 0;
		while(root.left != null || root.right != null) {
			if(root.left!= null) {
				root=root.left;
			}
			else
				root = root.right;
			ht++;
			
		}
		return ht;
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
		
		System.out.println(isBalanced0(A));

	}

}

