package de.mohammadamir;

// Search in Rotated Sorted Array
// https://leetcode.com/problems/search-in-rotated-sorted-array/
public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        if(null != nums && nums.length > 0) {
            int left = 0;
            int right = nums.length - 1;

            while (left < right) {
                int midpoint = left + (right - left) / 2;

                if (nums[midpoint] > nums[right]) {
                    left = midpoint + 1;
                } else {
                    right = midpoint;
                }
            }

            int start = left;
            right = nums.length - 1;

            if (target >= nums[start] && target <= nums[right]) {
                left = start;
            } else {
                right = start;
                left = 0;
            }

            while (left <= right) {
                int midpoint = left + (right - left) / 2;

                if (nums[midpoint] < target) {
                    left = midpoint + 1;
                } else if (nums[midpoint] > target) {
                    right = midpoint - 1;
                } else {
                    return midpoint;
                }
            }
        }

        return -1;
    }
}
