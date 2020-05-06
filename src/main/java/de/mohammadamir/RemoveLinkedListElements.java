package de.mohammadamir;

import de.mohammadamir.helper.ListNode;

// Remove Linked List Elements
// https://leetcode.com/problems/remove-linked-list-elements/
public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode node = head, prev = null;

        while (node != null) {
            if (node.val == val) {
                if (prev != null) {
                    prev.next = prev.next.next;
                } else {
                    head = head.next;
                }
            } else {
                prev = node;
            }

            node = node.next;
        }

        return head;
    }
}
