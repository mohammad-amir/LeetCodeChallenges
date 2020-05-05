package de.mohammadamir;

import java.util.HashMap;
import java.util.Map;

// Two Sum
// https://leetcode.com/problems/two-sum/
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        if (null != nums && nums.length > 0) {
            Map<Integer, Integer> countMap = new HashMap<>();

            for (int i = 0; i < nums.length; i++) {
                if (countMap.containsKey(target - nums[i])) {
                    return new int[]{countMap.get(target - nums[i]), i};
                }

                countMap.put(nums[i], i);
            }
        }

        return new int[]{-1, -1};
    }
}
