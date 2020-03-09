package leetcode;

import java.util.ArrayList;
import java.util.List;

public class inorderTraversal_94 {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        MidOrder(root,list);
        return list;
    }

    public void MidOrder(TreeNode root,List<Integer> list){
        if (root != null){
            MidOrder(root.left,list);
            list.add(root.val);
            MidOrder(root.right,list);
        }
    }
}
