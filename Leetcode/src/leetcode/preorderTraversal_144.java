package leetcode;

import java.util.ArrayList;
import java.util.List;

public class preorderTraversal_144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        preOrder(root,list);
        return list;
    }

    public void preOrder(TreeNode root,List<Integer> list){
        if (root != null){
            list.add(root.val);
            preOrder(root.left,list);
            preOrder(root.right,list);
        }
    }
}
