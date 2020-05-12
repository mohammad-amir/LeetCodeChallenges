package de.mohammadamir;

// Single Element In A Sorted Array
// https://leetcode.com/problems/single-element-in-a-sorted-array/
public class SingleElementInASortedArray {
    public int singleNonDuplicate(int[] nums) {
        int len = nums.length;
        if (len > 1) {
            int left = 0;
            int right = len - 1;

            while (left < right) {
                int mid = left + (right - left)/2;

                if (mid < len -1 && nums[mid] == nums[mid +1]) {
                    if (mid % 2 == 1) {
                        right = mid - 1;
                    } else {
                        left = mid + 1;
                    }
                } else if (mid > 0 && nums[mid] == nums[mid - 1]) {
                    if (mid % 2 == 0) {
                        right = mid - 1;
                    } else {
                        left = mid + 1;
                    }
                } else {
                    return nums[mid];
                }
            }

            return nums[left];
        }

        return nums[0];
    }
}
