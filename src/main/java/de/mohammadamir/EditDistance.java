package de.mohammadamir;

// Edit Distance
// https://leetcode.com/problems/edit-distance/
public class EditDistance {
    public static void main(String[] args) {
        System.out.println(new EditDistance().minDistance("abcdef", "azced"));
        System.out.println(new EditDistance().minDistance("horse", "ros"));
        System.out.println(new EditDistance().minDistance("intention", "execution"));

        System.out.println(new EditDistance().minDistance("zoologicoarchaeologist", "zoogeologist"));
    }

    public int minDistance(String word1, String word2) {
        if (word2 == null || word1 == null) {
            return 0;
        }

        char[] matchChars = word2.toCharArray();
        char[] inputChars = word1.toCharArray();

        int r = matchChars.length + 1;
        int c = inputChars.length + 1;

        int[][] distArr = new int[r][c];

        for (int i = 1; i < r; i++) {
            distArr[i][0] = i;
        }

        for (int j = 1; j < c; j++) {
            distArr[0][j] = j;
        }

        for (int i = 1; i < r; i++) {
            for (int j = 1; j < c; j++) {
                if (matchChars[i-1] == inputChars[j-1]) {
                    distArr[i][j] = distArr[i - 1][j - 1];
                } else {
                    distArr[i][j] = Math.min(Math.min(distArr[i - 1][j], distArr[i][j - 1]), distArr[i - 1][j - 1]) + 1;
                }
            }
        }

        return distArr[r-1][c-1];
    }
}
