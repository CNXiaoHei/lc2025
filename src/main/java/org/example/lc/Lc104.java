package org.example.lc;

import org.example.lc.model.TreeNode;

public class Lc104 {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int depth = 1;
        depth += Math.max(maxDepth(root.left), maxDepth(root.right));
        return depth;
    }
}
