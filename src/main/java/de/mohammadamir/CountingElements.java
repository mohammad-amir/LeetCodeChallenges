package de.mohammadamir;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

// Counting Elements
// https://leetcode.com/problems/counting-elements/
public class CountingElements {
    public static int countElements(int[] arr) {
        Arrays.sort(arr);

        Map<Integer, Integer> countElementMap = new LinkedHashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int count;
            if(countElementMap.containsKey(arr[i])) {
                count = countElementMap.get(arr[i]) + 1;
            } else {
                count = 1;
            }

            countElementMap.put(arr[i], count);
        }

        int c = 0;
        Integer x = Integer.MIN_VALUE;


        for(Integer key : countElementMap.keySet()) {
            if (x+1 == key) {
                c += countElementMap.get(x);
            }

            x = key;
        }

        return c;
    }
}
