package de.mohammadamir;

// Valid Perfect Square
// https://leetcode.com/problems/valid-perfect-square/
public class ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        int left = 1;
        int right = num;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int sqrt = num / mid;
            int r = num % mid;

            if (sqrt == mid && r == 0) {
                return true;
            } else if (sqrt > mid) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}
