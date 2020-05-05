package de.mohammadamir;

// Maximal Square
// https://leetcode.com/problems/maximal-square/
public class MaximalSquare {
    public int maximalSquare(char[][] matrix) {
        int count = 0;
        int rows = matrix.length;

        if (rows > 0 && matrix[0].length > 0) {
            int cols = matrix[0].length;

            int intCopy[][] = new int[rows][cols];

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (matrix[i][j] != '0') {
                        int result = 0;

                        if (i > 0 && j > 0) {
                            result = Math.min(Math.min(intCopy[i][j - 1], intCopy[i - 1][j]), intCopy[i - 1][j - 1]);
                        }

                        intCopy[i][j] = 1 + result;
                        count = Math.max(count, 1 + result);
                    } else {
                        intCopy[i][j] = 0;
                    }
                }
            }
        }

        return count * count;
    }
}
