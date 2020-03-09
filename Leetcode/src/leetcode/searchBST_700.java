package leetcode;

public class searchBST_700 {
    public TreeNode searchBST(TreeNode root,int val){
        if (root == null)
            return null;
        if (root.val > val){
            searchBST(root.left,val);
        }
        else if (root.val < val)
            searchBST(root.right,val);
        else if (root.val == val){
            return root;
        }
        return null;
    }
}
