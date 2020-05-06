package de.mohammadamir;

// Longest Common Subsequence
// https://leetcode.com/problems/longest-common-subsequence/
public class LongestCommonSubsequence {
    public int longestCommonSubsequence(String text1, String text2) {
        if (text1 == null || text2 == null || text1.length() == 0 || text2.length() == 0) {
            return 0;
        }

        int result = 0;
        char[] chars1 = text1.toCharArray();
        char[] chars2 = text2.toCharArray();
        int[][] subseq = new int[text1.length()][text2.length()];

        for (int i = 0; i < text1.length(); i++) {
            for (int j = 0; j < text2.length(); j++) {
                if (chars1[i] == chars2[j]) {
                    subseq[i][j] = getVal(subseq, i - 1, j - 1) + 1;
                } else {
                    subseq[i][j] = Math.max(getVal(subseq,i - 1, j), getVal(subseq, i, j - 1));
                }
            }
        }

        return subseq[chars1.length - 1][chars2.length - 1];
    }

    int getVal(int[][] arr, int i, int j) {
        return (i >=0 && j>= 0) ? arr[i][j] : 0;
    }
}
