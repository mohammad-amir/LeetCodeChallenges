package de.mohammadamir;

// Count Square Submatrices with All Ones
// https://leetcode.com/problems/count-square-submatrices-with-all-ones/
public class CountSquareSubmatricesWithAllOnes {

    public int countSquares(int[][] matrix) {
        int count = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 1) {
                    int result = 1;

                    if (i > 0 && j > 0) {
                        result += Math.min(Math.min(matrix[i][j - 1], matrix[i - 1][j]), matrix[i - 1][j - 1]);
                    }

                    matrix[i][j] = result;

                    count += result;
                }
            }
        }

        return count;
    }
}