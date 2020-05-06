package de.mohammadamir;

import de.mohammadamir.helper.ListNode;

// Middle of the Linked List
// https://leetcode.com/problems/middle-of-the-linked-list/
public class MiddleOfTheLinkedList {
    public ListNode middleNode(ListNode head) {
        ListNode middle = head;
        ListNode last = head;

        while (null != last && null != last.next) {
            last = last.next.next;
            middle = middle.next;
        }

        return middle;
    }
}
