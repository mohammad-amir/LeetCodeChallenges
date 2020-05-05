package de.mohammadamir;

import java.util.ArrayList;
import java.util.List;

public class MinStack {
    private List<Integer> store;
    private List<Integer> minStore;
    private int size;
    private int min;

    /** initialize your data structure here. */
    public MinStack() {
        store = new ArrayList<>();
        size = 0;
        min = Integer.MAX_VALUE;
        minStore = new ArrayList<>();
    }

    public void push(int x) {
        store.add(x);
        size++;
        min = Math.min(x, min);
        minStore.add(min);
    }

    public void pop() {
        if (size > 0) {
            store.remove(size - 1);
            minStore.remove(size - 1);
            size--;
            min = size > 0 ? minStore.get(size - 1) : Integer.MAX_VALUE;
        }
    }

    public int top() {
        if (size > 0) {
            return store.get(size - 1);
        } else {
            throw new RuntimeException("Empty Stack");
        }
    }

    public int getMin() {
        if (size > 0) {
            return min;
        } else {
            throw new RuntimeException("Empty Stack");
        }
    }
}