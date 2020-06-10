package de.mohammadamir;

// Coin Change 2
// https://leetcode.com/problems/coin-change-2/
public class CoinChange2 {
    public int change(int amount, int[] coins) {
        int[] arr = new int[amount + 1];
        arr[0] = 1;

        for (int c : coins) {
            for (int i = c; i <= amount; i++) {
                arr[i] += arr[i - c];
            }
        }

        return arr[amount];
    }
}
