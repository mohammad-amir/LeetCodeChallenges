package de.mohammadamir;

// Best Time to Buy and Sell Stock II
// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii
public class BestTimeToBuyAndSellStockII {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buyAt = -1;
        int prevVal = prices[0];

        for (int i = 1; i < prices.length; i++) {
            if (buyAt < 0) {
                if (prevVal < prices[i]) {
                    buyAt = prevVal;
                }
            } else if (prevVal > prices[i]) {
                profit = profit + prevVal - buyAt;
                buyAt = prices[i];
            }

            prevVal = prices[i];
        }

        if (buyAt >= 0 && prevVal > buyAt) {
            profit = profit + prevVal - buyAt;
        }

        return profit;
    }
}
