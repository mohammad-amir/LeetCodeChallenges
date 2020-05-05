package de.mohammadamir;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// Contiguous Array
// https://leetcode.com/problems/contiguous-array/
public class ContiguousArray {
    public int findMaxLengthOld(int[] nums) {
        int foundMaxLength = 0;
        int count = 0;
        Map<Integer, Integer> countMap = new HashMap<>();
        countMap.put(0, -1);

        for (int i = 0; i < nums.length; i++) {
            count += 2 * nums[i] - 1;

            if (countMap.containsKey(count)) {
                foundMaxLength = Math.max(foundMaxLength, i - countMap.get(count));
            } else {
                countMap.put(count, i);
            }
        }

        return foundMaxLength;
    }

    // Copied
    public int findMaxLengthOMS(int[] nums) {
        if(nums.length == 0 || nums.length == 1) return 0;

        int maxLength = 0;

        int[] arr = new int[2*nums.length+1];

        Arrays.fill(arr, -2);

        arr[nums.length] = -1;

        int counter = nums.length;

        for(int i = 0; i < nums.length; i++){
            counter+=nums[i]*2-1;

            if(arr[counter] == -2){
                arr[counter] = i;
            }else{
                maxLength = Math.max(maxLength, i-arr[counter]);
            }
        }

        return maxLength;
    }
}
