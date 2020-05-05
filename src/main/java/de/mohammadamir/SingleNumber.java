package de.mohammadamir;

import java.util.*;

// Single Number
// https://leetcode.com/problems/single-number/
public class SingleNumber {
    // 0ms
    public int singleNumber(int[] nums) {
        int x = 0;

        for(int n : nums) {
            x = x ^ n;
        }

        return x;
    }

    // 3 ms
    public int singleNumberOld(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int total = 0;
        int uniqueTotal = 0;

        for(int n : nums) {
            if (set.add(n)) {
                uniqueTotal += n;
            }

            total += n;
        }

        return 2 * uniqueTotal - total;
    }
}