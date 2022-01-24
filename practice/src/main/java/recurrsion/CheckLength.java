package recurrsion;

import Trees.TreeNode;

public class CheckLength {

	public static int checktreeLength(TreeNode node) {
		int res = 0;
		int left=0 , right=0;
		//base case 
		if(node == null )
			return res;
		else {
		//	if(node.left != null)
			{
				 left = (1+checktreeLength(node.left));
			}
		//	if(node.right!= null)
			{
				right = (1+checktreeLength(node.right));
			}
			
			return  Integer.max(left, right);
		}
		//return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode A = new TreeNode(1);
		TreeNode B = new TreeNode(1);
		TreeNode C = new TreeNode(1);
		TreeNode D = new TreeNode(1);
		TreeNode E = new TreeNode(1);
		A.left = B;
		A.right = C;
		B.left = D;
		D.left = E;
		System.out.println(checktreeLength(A));
		
	}

}
