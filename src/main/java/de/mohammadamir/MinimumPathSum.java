package de.mohammadamir;

// Minimum Path Sum
// https://leetcode.com/problems/minimum-path-sum/
public class MinimumPathSum {
    public int minPathSum(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        for (int i=rows - 1; i >=0; i--) {
            for (int j = cols - 1; j >=0; j--) {
                if (i + 1 < rows || j + 1 < cols) {
                    int distance;

                    if (i + 1 >= rows) {
                        distance = grid[i][j + 1];
                    } else if (j + 1 >= cols) {
                        distance = grid[i + 1][j];
                    } else {
                        distance = Math.min(grid[i][j + 1], grid[i + 1][j]);
                    }

                    grid[i][j] = grid[i][j] + distance;
                }
            }
        }

        return grid[0][0];
    }
}
