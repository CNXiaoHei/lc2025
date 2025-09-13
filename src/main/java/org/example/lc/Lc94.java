package org.example.lc;

import org.example.lc.model.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Lc94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<Integer> leftList = inorderTraversal(root.left);
        List<Integer> list = new ArrayList<>(leftList);
        list.add(root.val);
        List<Integer> rightList = inorderTraversal(root.right);
        list.addAll(rightList);
        return list;
    }
}
