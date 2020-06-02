package de.mohammadamir;

import de.mohammadamir.helper.ListNode;

// Delete Node in a Linked List
// https://leetcode.com/problems/delete-node-in-a-linked-list/
public class DeleteNodeInALinkedList {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
