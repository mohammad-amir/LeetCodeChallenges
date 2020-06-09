package de.mohammadamir;

// Is Subsequence
// https://leetcode.com/problems/is-subsequence/
public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        int i = 0, j = 0;

        while (i < sChars.length && j < tChars.length) {
            if (sChars[i] == tChars[j++]) {
                i++;
            }
        }

        return (i == sChars.length);
    }
}
