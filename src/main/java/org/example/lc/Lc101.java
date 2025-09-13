package org.example.lc;

import org.example.lc.model.TreeNode;

public class Lc101 {
    public boolean isSymmetric(TreeNode root) {
        TreeNode mirror = root;
        return eq(root, mirror);
    }

    public boolean eq(TreeNode n1, TreeNode n2) {
        if (n1 == null && n2 == null) {
            return true;
        } else if (n1 == null || n2 == null) {
            return false;
        }
        if (n1.val != n2.val) {
            return false;
        }
        return eq(n1.left, n2.right) && eq(n1.right, n2.left);
    }
}
