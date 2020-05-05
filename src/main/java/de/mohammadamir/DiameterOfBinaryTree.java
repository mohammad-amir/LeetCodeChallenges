package de.mohammadamir;

import de.mohammadamir.helper.TreeNode;

// Diameter of Binary Tree
// https://leetcode.com/problems/diameter-of-binary-tree/
public class DiameterOfBinaryTree {
    public int diameterOfBinaryTree(TreeNode root) {
        return root == null ? 0 : getHeightDiameter(root)[1];
    }

    private int[] getHeightDiameter(TreeNode root) {
        if (root == null) {
            return new int[]{0,0};
        } else {
            int[] leftHeightDiameter = getHeightDiameter(root.left);
            int[] rightHeightDiameter = getHeightDiameter(root.right);

            return new int[]{
                    1 + Math.max(leftHeightDiameter[0], rightHeightDiameter[0]),
                    Math.max(
                            leftHeightDiameter[0] + rightHeightDiameter[0],
                            Math.max(leftHeightDiameter[1], rightHeightDiameter[1])
                    )
            };
        }
    }
}
