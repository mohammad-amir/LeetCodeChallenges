package de.mohammadamir;

import de.mohammadamir.helper.TreeNode;

// Invert Binary Tree
// https://leetcode.com/problems/invert-binary-tree/
public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if (root != null) {
            TreeNode temp = root.left;

            root.left = root.right;
            root.right = temp;

            invertTree(root.left);
            invertTree(root.right);
        }

        return root;
    }
}
