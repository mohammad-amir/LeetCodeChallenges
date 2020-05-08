package de.mohammadamir;

import de.mohammadamir.helper.TreeNode;

// CousinsInBinaryTree
// https://leetcode.com/problems/cousins-in-binary-tree/
public class CousinsInBinaryTree {
    int [] depthParentX;
    int [] depthParentY;

    public boolean isCousins(TreeNode root, int x, int y) {
        depthParentX = null;
        depthParentY = null;

        search(root, null, x, y, 0);

        return (depthParentX != null) &&
                (depthParentY != null) &&
                (depthParentY[0] == depthParentX[0]) &&
                (depthParentY[1] != depthParentX[1]);
    }

    void search(TreeNode node, TreeNode parent, int x, int y, int depth) {
        if (node != null) {
            if (depthParentX == null && node.val == x) {
                if (parent != null) {
                    depthParentX = new int[]{depth, parent.val};
                } else {
                    return;
                }
            } else if (depthParentY == null && node.val == y) {
                if (parent != null) {
                    depthParentY = new int[]{depth, parent.val};
                } else {
                    return;
                }
            }

            if (depthParentX == null || depthParentY == null) {
                search(node.left, node, x, y, depth + 1);
                search(node.right, node, x, y, depth + 1);
            }
        }
    }
}
