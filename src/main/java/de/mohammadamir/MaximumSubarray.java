package de.mohammadamir;

// Maximum Subarray
// https://leetcode.com/problems/maximum-subarray/
public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int maxSubArraySum;

        if (nums == null || nums.length == 0) {
            maxSubArraySum = 0;
        } else {
            maxSubArraySum = nums[0];
            int sum = nums[0];

            for (int i = 1; i < nums.length; i++) {
                sum = Math.max(nums[i], nums[i] + sum);
                maxSubArraySum = Math.max(sum, maxSubArraySum);
            }
        }

        return maxSubArraySum;
    }
}