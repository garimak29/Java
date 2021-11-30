package Trees;

public class SearchInBST {
	
	public static boolean searchValue(TreeNode A , int key)
	{
		boolean rightres = false , leftres = false;
		// base case
		if(A == null)
			return false;
		else {
			
			//left
			leftres = searchValue(A.left, key); 
			// right 
			rightres = searchValue(A.right, key);
			// join
			
			return (A.val== key || leftres  || rightres);
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
		
	/*					A
	 * 				B		C
	 * 					D				
	 * 						E
	 * 
	 * 
	 * 
	 * 
	 * */
		
		System.out.println(searchValue(A,0));

	}

}
