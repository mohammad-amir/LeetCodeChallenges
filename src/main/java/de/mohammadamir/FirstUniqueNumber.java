package de.mohammadamir;

import java.util.HashMap;
import java.util.Map;

// First Unique Number
// https://leetcode.com/problems/first-unique-number/
class FirstUniqueNumber {
    DLLNode head;
    DLLNode tail;
    Map<Integer, DLLNode> links;

    public FirstUniqueNumber(int[] nums) {
        links = new HashMap<>();

        for (int num : nums) {
            add(num);
        }
    }

    public int showFirstUnique() {
        return head != null ? head.value : -1;
    }

    public void add(int value) {
        DLLNode node;
        if (links.containsKey(value)) {
            node = links.get(value);
            remove(node);
        } else {
            node = new DLLNode(value);
            links.put(value, node);
            addInLast(node);
        }
    }

    private void addInLast(DLLNode node) {
        if (tail != null) {
            tail.next = node;
        }

        node.prev = tail;
        node.next = null;
        tail = node;

        if (head == null) {
            head = tail;
        }
    }

    private void remove(DLLNode node) {
        if (node.next != null || node.prev != null || node == head ) {
            if (node.prev != null) {
                node.prev.next = node.next;
            } else {
                head = node.next;
            }

            if (node.next != null) {
                node.next.prev = node.prev;
            } else {
                tail = node.prev;
            }

            node.next = null;
            node.prev = null;
        }
    }
}