package de.mohammadamir;

import de.mohammadamir.helper.TreeNode;

// Construct Binary Search Tree from Preorder Traversal
// https://leetcode.com/problems/construct-binary-search-tree-from-preorder-traversal/
public class ConstructBinarySearchTreeFromPreorderTraversal {
    private int i;

    public TreeNode bstFromPreorder(int[] preorder) {
        i = 0;
        return getChildNode(preorder, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private TreeNode getChildNode(int[] preorder, int min, int max) {
        TreeNode treeNode = null;

        if (i < preorder.length && max >= preorder[i] && min <= preorder[i]) {
            treeNode = new TreeNode(preorder[i]);
            i++;
            treeNode.left = getChildNode(preorder, min, treeNode.val - 1);
            i++;
            treeNode.right = getChildNode(preorder,treeNode.val + 1, max);
        } else {
            i--;
        }

        return treeNode;
    }
}
