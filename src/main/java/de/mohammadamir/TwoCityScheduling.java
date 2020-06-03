package de.mohammadamir;

import java.util.Arrays;

// Two City Scheduling
// https://leetcode.com/problems/two-city-scheduling/
public class TwoCityScheduling {
    public int twoCitySchedCost(int[][] costs) {
        int n = costs.length;

        if (n == 1) {
            return Math.min(costs[0][0], costs[0][1]);
        } else {
            int minCost = 0;
            int[] diffArray = new int[n];

            int i = 0;
            while(i < n) {
                diffArray[i] = costs[i][0] - costs[i][1];
                minCost += costs[i++][1];
            }

            Arrays.sort(diffArray);

            i = 0;
            while (i < n/2) {
                minCost += diffArray[i++];
            }

            if (n % 2 == 1 && diffArray[i] < 0) {
                minCost += diffArray[i];
            }

            return minCost;
        }
    }
}
