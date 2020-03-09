package leetcode;

public class isSameTree_100 {
    public boolean isSameTree(TreeNode p,TreeNode q){
        if (p == null || q == null)
            return false;
        if (p == null && q == null)
            return true;
        return p.val == q.val && isSameTree(p.left,q.left) && isSameTree(p.right,q.right);

    }
}
