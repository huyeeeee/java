package leetcode;

import java.util.ArrayList;
import java.util.List;

public class binaryTreePaths_257 {

    public List<String> binaryTreePaths(TreeNode root){
        List<String> result = new ArrayList<>();
        if (root == null){
            return result;
        }
        tree(root,"",result);
        return result;
    }

    public String tree(TreeNode t,String s,List<String> ls){
        if (t.left != null){
            tree(t.left,s + t.val + "->",ls);
        }
        if (t.right != null){
            tree(t.right,s + t.val + "->",ls);
        }
        if (t.left == null && t.right == null){
            ls.add(s + t.val);
        }
        return s;
    }
}
