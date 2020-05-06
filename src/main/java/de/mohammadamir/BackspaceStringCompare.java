package de.mohammadamir;

import java.util.Stack;

// Backspace String Compare
// https://leetcode.com/problems/backspace-string-compare/
public class BackspaceStringCompare {
    public boolean backspaceCompare(String S, String T) {
        boolean result = false;

        Stack<Character> sStack = getStack(S);
        Stack<Character> tStack = getStack(T);

        if (tStack.size() == sStack.size()) {
            result = true;

            while (!sStack.isEmpty() && result) {
                result = result && (sStack.pop().equals(tStack.pop()));
            }
        }

        return result;
    }

    private Stack<Character> getStack(String string) {
        Stack<Character> stack = new Stack<>();

        for (char ch : string.toCharArray()) {
            if (ch == '#') {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(ch);
            }
        }

        return stack;
    }
}
