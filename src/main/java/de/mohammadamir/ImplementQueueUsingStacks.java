package de.mohammadamir;

import java.util.Stack;

// Implement Queue using Stacks
// https://leetcode.com/problems/implement-queue-using-stacks/
public class ImplementQueueUsingStacks {
    public static void main(String[] args) {
        MyQueue obj = new MyQueue();
        obj.push(1);
        obj.push(2);
        System.out.println(obj.pop());
        System.out.println(obj.peek());
        System.out.println(obj.empty());
        System.out.println(obj.pop());
        System.out.println(obj.empty());
    }
}

class MyQueue {
    Stack<Integer> stack;

    /** Initialize your data structure here. */
    public MyQueue() {
        stack = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        stack.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        int x = stack.get(0);
        stack.remove(0);
        return x;
    }

    /** Get the front element. */
    public int peek() {
        return stack.get(0);
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack.isEmpty();
    }
}