package de.mohammadamir;

// Rotate Image
// https://leetcode.com/problems/rotate-image/
public class RotateImage {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        for (int r = 0; r < n; r++) {
            for (int c = r; c < n; c++) {
                if (r != c) {
                    matrix[r][c] = matrix[r][c] + matrix[c][r];
                    matrix[c][r] = matrix[r][c] - matrix[c][r];
                    matrix[r][c] = matrix[r][c] - matrix[c][r];
                }
            }
        }

        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n/2; c++) {
                matrix[r][c] = matrix[r][c] + matrix[r][n-c-1];
                matrix[r][n-c-1] = matrix[r][c] - matrix[r][n-c-1];
                matrix[r][c] = matrix[r][c] - matrix[r][n-c-1];
            }
        }
    }
}
