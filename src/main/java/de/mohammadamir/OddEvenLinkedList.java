package de.mohammadamir;

import de.mohammadamir.helper.ListNode;

// Odd Even Linked List
// https://leetcode.com/problems/odd-even-linked-list/
public class OddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {
        if (head != null && head.next != null && head.next.next != null) {
            ListNode lastOdd = head;
            ListNode prev = head.next;
            ListNode node = head.next.next;
            int i = 3;

            while (node != null) {
                if (i % 2 == 1) { // Odd
                    //delete node
                    prev.next = node.next;

                    //insert after last Odd
                    node.next = lastOdd.next;
                    lastOdd.next = node;

                    lastOdd = node;
                } else {
                    prev = node;
                }

                node = prev.next;
                i++;
            }
        }

        return head;
    }
}
