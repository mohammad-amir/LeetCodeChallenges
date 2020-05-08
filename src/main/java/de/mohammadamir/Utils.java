package de.mohammadamir;

import de.mohammadamir.helper.ListNode;
import de.mohammadamir.helper.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Utils {
    public static TreeNode getBinaryTree(Integer[] input) {
        TreeNode root = null;

        if (input != null && input.length > 0) {
            root = new TreeNode(input[0]);

            Queue<TreeNode> nodesToProcess = new LinkedList<>();
            nodesToProcess.add(root);

            int i = 1;
            while (i < input.length && !nodesToProcess.isEmpty()) {
                TreeNode node = nodesToProcess.poll();

                if (node != null) {
                    Integer val = input[i++];
                    node.left = val != null ? new TreeNode(val) : null;
                    nodesToProcess.add(node.left);

                    if (i < input.length) {
                        val = input[i++];
                        node.right = val != null ? new TreeNode(val) : null;
                        nodesToProcess.add(node.right);
                    }
                }
            }
        }

        return root;
    }

    public static ListNode getLinkedList(String input, String separator) {
        ListNode head = null;

        if (input != null && input.trim().length() > 0) {
            String[] values = input.split(separator);
            head = new ListNode(Integer.parseInt(values[0]));

            ListNode node = head;
            for (int i = 1; i < values.length; i++) {
                node.next = new ListNode(Integer.parseInt(values[i]));
                node = node.next;
            }
        }

        return head;
    }

    public static ListNode getLinkedList(int[] input) {
        ListNode head = null;

        if (input != null && input.length > 0) {
            head = new ListNode(input[0]);

            ListNode node = head;
            for (int i = 1; i < input.length; i++) {
                node.next = new ListNode(input[i]);
                node = node.next;
            }
        }

        return head;
    }
}
