package de.mohammadamir;

// Complement of Base 10 Integer
// https://leetcode.com/problems/complement-of-base-10-integer/
public class ComplementOfBase10Integer {

    public int bitwiseComplement(int N) {
        if (N > 0) {
            int result = 0;
            int p = 0;

            while (N > 0) {
                result +=  ((1 - N % 2)*Math.pow(2, p++));
                N = N/2;
            }

            return result;
        } else {
            return 1;
        }
    }
}
