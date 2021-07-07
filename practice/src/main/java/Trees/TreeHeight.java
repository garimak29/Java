package Trees;

import java.util.Stack;

public class TreeHeight {
	
	 
	  class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) {
	       val = x;
	       left=null;
	       right=null;
	      }
	  }
	 
	public class Solution {
	    public int solve(TreeNode A) {
	    	int res =0;
	    	Stack stack = new Stack();
	    	TreeNode curr = A;
	    	System.out.println(curr);
	    	while(curr != null || !stack.isEmpty()) {
	    		if(curr !=null) {
	    			res ++;
	    			stack.push(curr);
	    			curr = curr.left;
	    		}
	    		else
	    		{
	    			TreeNode temp = (TreeNode) stack.peek();
	    			stack.pop();
	    			curr = temp.right;
	    		}
	    	}
	    	return res ;
	    }
	}


}
