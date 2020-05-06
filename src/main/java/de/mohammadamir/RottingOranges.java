package de.mohammadamir;

import java.util.HashSet;
import java.util.Set;

// Rotting Oranges
// https://leetcode.com/problems/rotting-oranges/
public class RottingOranges {
    public int orangesRotting(int[][] grid) {
        int mins = 0;

        if (null != grid && grid.length > 0) {
            int freshCount = 0;
            Set<int[]> rottenList = new HashSet<>();

            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    if (grid[i][j] == 1) {
                        freshCount++;
                    } else if (grid[i][j] == 2) {
                        rottenList.add(new int[]{i, j});
                    }
                }
            }

            int[][] directions = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

            while (freshCount > 0) {
                Set<int[]> infectedList = new HashSet<>();
                for (int[] rotten : rottenList) {
                    int i = rotten[0];
                    int j = rotten[1];

                    for (int[] direction : directions) {
                        int x = i + direction[0];
                        int y = j + direction[1];

                        if (x >= 0 && y >= 0 & x < grid.length && y < grid[0].length && grid[x][y] == 1) {
                            freshCount--;
                            grid[x][y] = 2;
                            infectedList.add(new int[]{x, y});
                        }
                    }
                }

                if (infectedList.size() == 0) {
                    return -1;
                }

                mins++;
                rottenList = infectedList;
            }
        }

        return mins;
    }
}
