package de.mohammadamir;

// Minimum Moves to Equal Array Elements
// https://leetcode.com/problems/minimum-moves-to-equal-array-elements/
public class MinimumMovesToEqualArrayElements {
    public int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE;
        int sum = 0;

        for (int num : nums) {
            sum += num;
            min = num < min ? num : min;
        }

        return (sum - nums.length*min);
    }
}
