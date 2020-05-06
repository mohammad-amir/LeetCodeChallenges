package de.mohammadamir;

// Perform String Shifts
// https://leetcode.com/problems/perform-string-shifts/
public class PerformStringShifts {
    public String stringShift(String s, int[][] shift) {
        int finalStep = 0;

        for(int[] step : shift) {
            finalStep += (2 * step[0] - 1)*step[1];
        }

        if (finalStep > 0) {
            finalStep = s.length() - finalStep % s.length();
        } else {
            finalStep = (finalStep * -1) % s.length();
        }

        return s.substring(finalStep).concat(s.substring(0, finalStep));
    }
}
