package de.mohammadamir;

// Search Insert Position
// https://leetcode.com/problems/search-insert-position/
public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int right = nums.length - 1;

        if (nums[right] < target) {
            return right + 1;
        }

        int left = 0;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (target < nums[mid]) {
                right = mid;
            } else if (target > nums[mid]) {
                left = mid + 1;
            } else {
                return mid;
            }
        }

        return left;
    }
}
