package de.mohammadamir;

// Capacity To Ship Packages Within D Days
// https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/
public class CapacityToShipPackagesWithinDDays {
    public int shipWithinDays(int[] weights, int D) {
        int max = 0;

        for (int weight : weights) {
            max += weight;
        }

        int min = max/D + (max % D > 0 ? 1 : 0);

        while (min < max) {
            int mid = min + (max - min)/2;

            if (canShipped(mid, weights, D)) {
                max = mid;
            } else {
                min = mid + 1;
            }
        }


        return min;
    }

    private boolean canShipped(int capacity, int[] weights, int D) {
        int days = 0;
        int totalWeight = 0;

        for (int weight : weights) {
            totalWeight += weight;

            if (totalWeight >= capacity) {
                totalWeight = 0;
                days++;
            }
        }

        return (days <= D);
    }
}
