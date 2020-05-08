package de.mohammadamir;

// Check If It Is a Straight Line
// https://leetcode.com/problems/check-if-it-is-a-straight-line/
public class CheckIfItIsAStraightLine {
    public boolean checkStraightLine(int[][] coordinates) {
        if (coordinates.length > 2) {
            int i = 2;
            while (i < coordinates.length) {
                int x1 = coordinates[i - 2][0];
                int y1 = coordinates[i - 2][1];
                int x2 = coordinates[i - 1][0];
                int y2 = coordinates[i - 1][1];
                int x3 = coordinates[i][0];
                int y3 = coordinates[i][1];

                if ((x2 - x1) * (y3 - y1) != (y2 - y1) * (x3 - x1)) {
                    return false;
                }

                i++;
            }
        }

        return true;
    }
}
