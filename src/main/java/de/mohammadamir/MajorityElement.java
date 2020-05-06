package de.mohammadamir;

import java.util.HashMap;
import java.util.Map;

// Majority Element
// https://leetcode.com/problems/majority-element/
public class MajorityElement {
    public int majorityElementOld(int[] nums) {
        int halfLen = nums.length / 2;
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            Integer index = map.getOrDefault(num, 0);

            if (index == halfLen) {
                return num;
            } else {
                map.put(num, index + 1);
            }
        }

        return 0;
    }
}
