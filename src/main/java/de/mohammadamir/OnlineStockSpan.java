package de.mohammadamir;

// Online Stock Span
// https://leetcode.com/problems/online-stock-span/
public class OnlineStockSpan {
    public static void main(String[] args) {
        StockSpanner stockSpanner = new StockSpanner();

        System.out.println(stockSpanner.next(100)); // 1
        System.out.println(stockSpanner.next(80)); // 1
        System.out.println(stockSpanner.next(60)); // 1
        System.out.println(stockSpanner.next(70)); // 2
        System.out.println(stockSpanner.next(60)); // 1
        System.out.println(stockSpanner.next(75)); // 4
        System.out.println(stockSpanner.next(85)); // 6

        StockSpanner stockSpanner2 = new StockSpanner();
        System.out.println(stockSpanner2.next(32)); // 1
        System.out.println(stockSpanner2.next(82)); // 2
        System.out.println(stockSpanner2.next(73)); // 1
        System.out.println(stockSpanner2.next(99)); // 4
        System.out.println(stockSpanner2.next(91)); // 1

        StockSpanner stockSpanner3 = new StockSpanner();
        System.out.println(stockSpanner3.next(29)); // 1
        System.out.println(stockSpanner3.next(91)); // 2
        System.out.println(stockSpanner3.next(62)); // 1
        System.out.println(stockSpanner3.next(76)); // 2
        System.out.println(stockSpanner3.next(51)); // 1
    }
}

class StockSpanner {
    int[][] priceSpanArray;
    int size;

    public StockSpanner() {
        priceSpanArray = new int[10000][2];
        size = 0;
    }

    public int next(int price) {
        int daySpan = 1;

        while(size > 0 && priceSpanArray[size - 1][0] <= price) {
            daySpan += priceSpanArray[size - 1][1];
            size--;
        }

        priceSpanArray[size] = new int[]{price, daySpan};
        size++;

        return daySpan;
    }
}