package de.mohammadamir;

import java.util.Arrays;

// Last Stone Weight
// https://leetcode.com/problems/last-stone-weight/
public class LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        Arrays.sort(stones);
        int length = stones.length;

        while (length > 1) {
            int result = stones[length - 1] - stones[length - 2];

            if (result > 0) {
                length--;
                int pos = 0;
                while (pos < length - 1 && stones[pos] <= result) {
                    pos++;
                }

                for (int i = length - 1; i > pos ; i--) {
                    stones[i] = stones[i-1];
                }

                stones[pos] = result;
            } else {
                length -= 2;
            }
        }

        return length == 0 ? 0 : stones[0];
    }
}
