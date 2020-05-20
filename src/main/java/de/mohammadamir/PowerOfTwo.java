package de.mohammadamir;

// Power of Two
// https://leetcode.com/problems/power-of-two/
public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if (n == 0) {
            return false;
        }

        while (n > 1 && n%2 == 0) {
            n = n/2;
        }

        return (n == 1);
    }
}
