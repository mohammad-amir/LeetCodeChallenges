package de.mohammadamir;

public class ProductOfArrayExceptSelf {
    // 1ms
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] finalProductArray = new int[len];
        finalProductArray[0] = 1;

        for (int i = 1; i < len; i++) {
            finalProductArray[i] = finalProductArray[i - 1] * nums[i - 1];
        }

        int rightProduct = nums[len - 1];

        for (int i = len - 2; i >= 0; i--) {
            finalProductArray[i] = finalProductArray[i] * rightProduct;
            rightProduct = rightProduct * nums[i];
        }

        return finalProductArray;
    }

    // 2ms
    public int[] productExceptSelfOld(int[] nums) {
        int len = nums.length;

        int[] finalProductArray = new int[len];
        int[] leftProductArray = new int[len];
        int[] rightProductArray = new int[len];

        leftProductArray[0] = 1;
        rightProductArray[len - 1] = 1;

        for (int i = 1; i < len; i++) {
            leftProductArray[i] = leftProductArray[i - 1] * nums[i - 1];
            rightProductArray[len - i - 1] = rightProductArray[len - i] * nums[len - i];
        }

        for (int i = 0; i < len; i++) {
            finalProductArray[i] = leftProductArray[i] * rightProductArray[i];
        }

        return finalProductArray;
    }
}
