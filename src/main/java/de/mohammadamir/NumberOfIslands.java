package de.mohammadamir;

// Number of Islands
// https://leetcode.com/problems/number-of-islands/
public class NumberOfIslands {
    public int numIslands(char[][] grid) {
        int islandCount = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    grid[i][j] = '2';
                    islandCount++;

                    visitNeighbourLand(grid, i, j);
                }
            }
        }

        return islandCount;
    }

    private static void visitNeighbourLand(char[][] grid, int i, int j) {
        if (i > 0 && grid[i - 1][j] == '1') {
            grid[i - 1][j] = '2';
            visitNeighbourLand(grid, i - 1, j);
        }

        if (i + 1 < grid.length && grid[i + 1][j] == '1') {
            grid[i + 1][j] = '2';
            visitNeighbourLand(grid, i + 1, j);
        }

        if (j > 0 && grid[i][j - 1] == '1') {
            grid[i][j - 1] = '2';
            visitNeighbourLand(grid, i, j - 1);
        }

        if (j + 1 < grid[i].length && grid[i][j + 1] == '1') {
            grid[i][j + 1] = '2';
            visitNeighbourLand(grid, i, j + 1);
        }
    }
}
