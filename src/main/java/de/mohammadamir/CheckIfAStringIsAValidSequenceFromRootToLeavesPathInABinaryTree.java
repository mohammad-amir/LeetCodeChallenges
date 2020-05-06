package de.mohammadamir;

import de.mohammadamir.helper.TreeNode;

// Check If a String Is a Valid Sequence from Root to Leaves Path in a Binary Tree
// https://leetcode.com/problems/check-if-a-string-is-a-valid-sequence-from-root-to-leaves-path-in-a-binary-tree/
public class CheckIfAStringIsAValidSequenceFromRootToLeavesPathInABinaryTree {
    public boolean isValidSequence(TreeNode root, int[] arr) {
        return isValid(root, arr, 0);
    }

    private boolean isValid(TreeNode node, int[] arr, int pointer) {
        boolean valid = false;

        if (node != null && node.val == arr[pointer]) {
            if (pointer == arr.length - 1) {
                valid = node.left == null && node.right == null;
            } else {
                valid = isValid(node.left, arr, pointer + 1) || isValid(node.right, arr, pointer + 1);
            }
        }

        return valid;
    }
}
