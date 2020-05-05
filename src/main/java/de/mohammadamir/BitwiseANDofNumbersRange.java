package de.mohammadamir;

// Bitwise AND of Numbers Range
// https://leetcode.com/problems/bitwise-and-of-numbers-range/
// Copied solution
public class BitwiseANDofNumbersRange {
    public int rangeBitwiseAnd(int m, int n) {
        int shifts = 0;

        while (m < n) {
            m >>= 1;
            n >>= 1;

            shifts++;
        }

        return n << shifts;
    }
}
