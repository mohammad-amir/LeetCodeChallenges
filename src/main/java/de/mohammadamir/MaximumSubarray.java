package de.mohammadamir;

// Maximum Subarray
// https://leetcode.com/problems/maximum-subarray/
public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int maxSubArraySum = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (maxSubArraySum < sum) {
                maxSubArraySum = sum;
            }

            if (sum < 0) {
                sum = 0;
            }
        }

        return maxSubArraySum;
    }
}