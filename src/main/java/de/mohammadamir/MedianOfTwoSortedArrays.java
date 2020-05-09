package de.mohammadamir;

// Median Of Two Sorted Arrays
// https://leetcode.com/problems/median-of-two-sorted-arrays/
public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (isNotEmpty(nums1) && isNotEmpty(nums2)) {
            int[] xArr = nums1.length <= nums2.length ? nums1 : nums2;
            int[] yArr = nums1.length <= nums2.length ? nums2 : nums1;

            int left = 0;
            int right = xArr.length - 1;

            while(true) {
                if (left > right) {
                    left = left + right;
                    right = left - right;
                    left = left - right;
                }

                int i = left + (right - left)/2;
                int j = (nums1.length + nums2.length + 1)/2 - i - 2;

                if (getVal(xArr,i) <= getVal(yArr, j+1) && getVal(yArr, j) <= getVal(xArr, i+1)) {
                    if ((nums1.length + nums2.length) % 2 == 0) {
                        return (double) (
                                Math.max(
                                        getVal(xArr,i),
                                        getVal(yArr, j)
                                ) +
                                Math.min(
                                        getVal(xArr,i+1),
                                        getVal(yArr, j+1)
                                )
                        ) / 2;
                    } else {
                        return Math.max(getVal(xArr,i), getVal(yArr, j));
                    }
                } else if (getVal(xArr,i) > getVal(yArr, j+1)) {
                    right = i - 1;
                } else {
                    left = i + 1;
                }
            }
        } else if (isNotEmpty(nums1) || isNotEmpty(nums2)) {
            int[] arr = isNotEmpty(nums1) ? nums1 : nums2;
            int i = (arr.length - 1)/2;

            if (arr.length % 2 == 0) {
                return (double) (
                        arr[i] +
                        arr[i+1]
                ) / 2;
            } else {
                return arr[i];
            }
        }

        return 0;
    }

    int getVal(int[] arr, int index) {
        return index < 0 ? Integer.MIN_VALUE : index >= arr.length ? Integer.MAX_VALUE : arr[index];
    }

    boolean isNotEmpty(int[] arr) {
        return (arr != null && arr.length > 0);
    }
}
