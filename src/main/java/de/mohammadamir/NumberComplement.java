package de.mohammadamir;

// Number Complement
// https://leetcode.com/problems/number-complement/
public class NumberComplement {
    public int findComplement(int num) {
        if (num > 0) {
            int result = 0;
            int p = 0;

            while (num > 0) {
                result += ((1 - num % 2) * Math.pow(2, p++));
                num = num / 2;
            }

            return result;
        } else {
            return 1;
        }
    }
}
