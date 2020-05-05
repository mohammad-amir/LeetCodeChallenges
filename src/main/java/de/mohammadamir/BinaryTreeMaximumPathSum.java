package de.mohammadamir;

import de.mohammadamir.helper.TreeNode;

// Binary Tree Maximum Path Sum
// https://leetcode.com/problems/binary-tree-maximum-path-sum/
public class BinaryTreeMaximumPathSum {
    private int maxPathSum;

    public int maxPathSum(TreeNode root) {
        maxPathSum = Integer.MIN_VALUE;
        getMaxPathSum(root);
        return maxPathSum;
    }

    private int getMaxPathSum(TreeNode node) {
        if(node == null) {
            return 0;
        } else {
            int nodeValue = node.val;
            int leftMaxPathSum = Math.max(0, getMaxPathSum(node.left));
            int rightMaxPathSum = Math.max(0, getMaxPathSum(node.right));

            maxPathSum = Math.max(maxPathSum, leftMaxPathSum + rightMaxPathSum + nodeValue);

            return nodeValue + Math.max(leftMaxPathSum, rightMaxPathSum);
        }
    }
}
