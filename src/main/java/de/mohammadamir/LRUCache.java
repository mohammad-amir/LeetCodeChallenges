package de.mohammadamir;

import java.util.HashMap;
import java.util.Map;

// LRU Cache
// https://leetcode.com/problems/lru-cache/
public class LRUCache {
    private DoubleLinkedListNode first;
    private DoubleLinkedListNode last;
    private Map<Integer, DoubleLinkedListNode> store;
    private int max;

    public LRUCache(int capacity) {
        store = new HashMap<>();
        max = capacity;
    }

    public int get(int key) {
        if (store.containsKey(key)) {
            DoubleLinkedListNode node = store.get(key);
            removeNode(node);
            addNode(node);
            return node.value;
        } else {
            return -1;
        }
    }

    public void put(int key, int value) {
        DoubleLinkedListNode node;

        if (store.containsKey(key)){
            node = store.get(key);
            node.value = value;
            removeNode(node);
        } else {
            if (store.size() == max){
                store.remove(first.key);
                removeNode(first);
            }

            node = new DoubleLinkedListNode(key, value);
            store.put(key, node);
        }

        addNode(node);
    }

    private void removeNode(DoubleLinkedListNode node){
        if (node.prev != null) {
            node.prev.next = node.next;
        } else {
            first = node.next;
        }

        if (node.next != null) {
            node.next.prev = node.prev;
        } else {
            last = node.prev;
        }
    }

    private void addNode(DoubleLinkedListNode node){
        if (last != null){
            last.next = node;
        }

        node.prev = last;
        node.next = null;
        last = node;

        if(first == null){
            first = last;
        }
    }
}