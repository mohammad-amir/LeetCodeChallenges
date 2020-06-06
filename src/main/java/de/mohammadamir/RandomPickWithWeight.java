package de.mohammadamir;

import java.util.Random;

// Random Pick with Weight
// https://leetcode.com/problems/random-pick-with-weight/
public class RandomPickWithWeight {
    public static void main(String[] args) {
        Solution obj = new Solution(new int[] {188, 927, 949, 95, 151, 659, 405, 906, 481, 363, 728, 839});
        System.out.println(obj.pickIndex());
        System.out.println(obj.pickIndex());
        System.out.println(obj.pickIndex());
        System.out.println(obj.pickIndex());
        System.out.println(obj.pickIndex());
        System.out.println(obj.pickIndex());
        System.out.println(obj.pickIndex());
        System.out.println(obj.pickIndex());
        System.out.println(obj.pickIndex());
        System.out.println(obj.pickIndex());
        System.out.println(obj.pickIndex());
    }
}

class Solution {
    private int[] max;
    int size;
    Random random;

    public Solution(int[] w) {
        random = new Random(0);
        max = new int[w.length];
        size = 0;

        for (int i = 0; i < w.length; i++) {
            size += w[i];
            max[i] = size;
        }
    }

    public int pickIndex() {
        int num = random.nextInt(size) + 1;
        int left = 0;
        int right = max.length - 1;

        while (left < right) {
            int mid = left + (right - left)/2;

            if (max[mid] > num) {
                right = mid;
            } else if (max[mid] < num) {
                left = mid + 1;
            } else {
                return mid;
            }
        }

        return left;
    }
}
