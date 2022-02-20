package Trees;

public class DiameterOfTree {
    public int solve(TreeNode A) {
        int res = 0;
        if(A == null)
            return 0;
       return Math.max(solve(A.left) , solve(A.right))+1;

    }

}
