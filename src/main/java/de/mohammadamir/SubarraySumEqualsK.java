package de.mohammadamir;

// Subarray Sum Equals K
// https://leetcode.com/problems/subarray-sum-equals-k/
public class SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int sumTillNow = 0;

        for (int i = 0; i < nums.length; i++) {
            sumTillNow += nums[i];
            int tempSum = sumTillNow;
            int temp = 0;

            do {
                if (tempSum == k) {
                    count++;
                }

                tempSum -= nums[temp];
                temp++;
            } while (temp <= i);
        }

        return count;
    }
}
