package de.mohammadamir;

import de.mohammadamir.helper.ListNode;

// Add Two Numbers
// https://leetcode.com/problems/add-two-numbers/
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum = l1.val + l2.val;
        int carry = sum/10;
        ListNode head = new ListNode(sum % 10);
        ListNode node = head;

        while (l1.next != null && l2.next != null) {
            l1 = l1.next;
            l2 = l2.next;

            sum = l1.val + l2.val + carry;
            carry = sum/10;
            node.next = new ListNode(sum % 10);
            node = node.next;
        }

        while (l1.next != null) {
            l1 = l1.next;
            sum = l1.val + carry;
            carry = sum/10;
            node.next = new ListNode(sum % 10);
            node = node.next;
        }

        while (l2.next != null) {
            l2 = l2.next;
            sum = l2.val + carry;
            carry = sum/10;
            node.next = new ListNode(sum % 10);
            node = node.next;
        }

        if (carry > 0) {
            node.next = new ListNode(carry);
        }

        return head;
    }
}
