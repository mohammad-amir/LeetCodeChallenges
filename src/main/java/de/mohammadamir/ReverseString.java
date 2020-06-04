package de.mohammadamir;

// Reverse String
// https://leetcode.com/problems/reverse-string/
public class ReverseString {
    public void reverseString(char[] s) {
        if (s != null && s.length > 1) {
            int size = s.length;
            int i = 0;

            while (i < size/2) {
                char temp = s[size - i - 1];
                s[size - i - 1] = s[i];
                s[i++] = temp;
            }
        }
    }
}