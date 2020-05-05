package de.mohammadamir;

import java.util.HashSet;
import java.util.Set;

// Happy Number
// https://leetcode.com/problems/happy-number/
public class HappyNumber {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();

        while(set.add(n) && n > 1) {
            int sum = 0;

            do {
                int r = n % 10;
                sum += (r * r);
                n = n / 10;
            } while (n > 0);

            n = sum;
        }

        return (n == 1);
    }
}
