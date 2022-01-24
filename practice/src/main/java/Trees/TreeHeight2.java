package Trees;

import Trees.TreeNode;

public class TreeHeight2 {

	 public static int solve(TreeNode A) {
		 int max = 0;
		 TreeNode root = A;
		 int lheight = 0, rheight =0; 
		 
		 if(A == null)
			 return 0;
		 else
		 {
		//	 System.out.println(A.val);
			lheight = solve(A.left)+1;
			rheight = solve(A.right)+1;
					
		 }
		 return  Math.max(lheight , rheight);
	 }
	 
	public static void main(String[] args) {
		
		TreeNode A = new TreeNode(1) ;
		TreeNode B = new TreeNode(2) ;
		TreeNode C = new TreeNode(3) ;
		TreeNode D = new TreeNode(4) ;
		TreeNode E = new TreeNode(5) ;
		A.left = B;
		A.right = C;
		B.left = D;
		D.left = E;
		System.out.println(solve(A));
	/*		A
		3B		1C
	2D
1E*/
	}

}
