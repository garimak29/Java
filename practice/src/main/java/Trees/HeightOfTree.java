package Trees;

public class HeightOfTree {
	
	public static int getHeight(TreeNode A) {
		int lhgt = 0 , rhgt = 0;
		
		// base case
		if(A == null ) {
			return 0;
		}
		
		// left st
		lhgt += getHeight(A.left);
		// rst
		rhgt += getHeight(A.right);
		// join the results
		return Math.max(lhgt, rhgt)+1;
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
		
		System.out.println(getHeight(A));
	}

}
