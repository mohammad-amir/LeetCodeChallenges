package de.mohammadamir;

// Move Zeros
// https://leetcode.com/problems/move-zeroes/
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int len = nums.length;
        int finalZeroCount = 0;
        int zeroCount = 0;

        for (int i = 0; i < len; i++) {
            if (nums[i] == 0) {
                zeroCount++;
                finalZeroCount++;
            } else if (zeroCount > 0){
                while (i < len && nums[i] != 0) {
                    nums[i - finalZeroCount] = nums[i];
                    i++;
                }
                zeroCount = 1;

                if (i < len) {
                    finalZeroCount++;
                }
            }
        }

        while (finalZeroCount > 0) {
            nums[len - finalZeroCount] = 0;
            finalZeroCount--;
        }
    }
}