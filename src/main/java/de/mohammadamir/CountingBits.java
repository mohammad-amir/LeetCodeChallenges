package de.mohammadamir;

// Counting Bits
// https://leetcode.com/problems/counting-bits/
public class CountingBits {
    public int[] countBits(int num) {
        int[] out = new int[num+1];

        if (num > 0) {
            out[1] = 1;

            for (int i = num; i > 1 && out[i] == 0; i--) {
                out[i] = getOneCount(i, out);
            }
        }

        return out;
    }

    private int getOneCount(int x, int[] out) {
        if (x == 0 || out[x] > 0) {
            return out[x];
        } else {
            out[x/2] = getOneCount(x/2, out);
            return x%2 + out[x/2];
        }
    }
}
