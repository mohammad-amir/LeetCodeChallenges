package de.mohammadamir;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

// Remove K Digits
// https://leetcode.com/problems/remove-k-digits/
public class RemoveKDigits {
    public String removeKdigits(String num, int k) {
        if (k == 0) {
            return num;
        } else if (num.length() == k) {
            return "0";
        }

        List<Integer> numList = new LinkedList<>();

        for(char numChar : num.toCharArray()) {
            numList.add(numChar - '0');
        }

        int i;
        while (k > 0) {
            i = 0;
            while (i < numList.size() - 1 && numList.get(i) <= numList.get(i+1)) {
                i++;
            }

            numList.remove(i);
            k--;
        }

        i = 0;
        while (numList.size() > i && numList.get(i) == 0) {
            i++;
        }

        if (i == numList.size()) {
            return "0";
        }

        return numList.stream().skip(i).map(Object::toString).collect(Collectors.joining());
    }
}