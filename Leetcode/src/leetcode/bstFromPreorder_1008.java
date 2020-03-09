package leetcode;

public class bstFromPreorder_1008 {
    public TreeNode bstFromPreorder(int[] preorder) {
        return new TreeNode(0);
    }
    public void addNode(TreeNode t,int val){
        if (t.val > val){
            t.left.val = val;
        }
        if (t.val < val){
            t.right.val = val;
        }
    }
}
