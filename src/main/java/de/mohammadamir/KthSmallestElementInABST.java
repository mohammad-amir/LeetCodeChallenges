package de.mohammadamir;

import de.mohammadamir.helper.TreeNode;

// Kth Smallest Element in a BST
// https://leetcode.com/problems/kth-smallest-element-in-a-bst/
public class KthSmallestElementInABST {
    public int kthSmallest(TreeNode root, int k) {
        return findSmallest(root, k)[1];
    }

    Integer[] findSmallest(TreeNode treeNode, int k) {
        Integer min = null;
        if (treeNode != null) {
            Integer[] ret = findSmallest(treeNode.left, k);

            if (ret[1] == null) {
                k = ret[0];
                if (k == 1) {
                    return new Integer[]{k, treeNode.val};
                } else {
                    k--;
                    ret = findSmallest(treeNode.right, k);
                    k = ret[0];
                    min = ret[1];
                }
            } else {
                min = ret[1];
            }
        }

        return new Integer[]{k, min};
    }
}
